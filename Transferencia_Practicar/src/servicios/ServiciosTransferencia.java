/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cuentabancaria;
import modelo.Transferencia;
import repositorio.RepositorioCuentaBancaria;
import repositorio.RepositorioTransferencia;

/**
 *
 * @author pablo
 */
public class ServiciosTransferencia {

    private RepositorioTransferencia repositorioTransferencia;
    private RepositorioCuentaBancaria repositorioCuentaBancaria;

    public ServiciosTransferencia() {
        this.repositorioTransferencia = new RepositorioTransferencia();
        this.repositorioCuentaBancaria = new RepositorioCuentaBancaria();
    }

    public void guardarTransferencia(Cuentabancaria cuentaDestino, Cuentabancaria cuentaOrigen, String monto) {

        double montoConvertido = this.validarMonto(monto);

        if (cuentaOrigen.equals(cuentaDestino)) {
            throw new IllegalArgumentException("hizo el deposito en la misma cuenta");

        }
        if (cuentaOrigen.getSaldo() < montoConvertido) {
            throw new IllegalArgumentException("su saldo es inferior al monto");

        }
        if (montoConvertido <= 0) {
            throw new IllegalArgumentException("el monto es nulo");

        }

        Transferencia transferencia = new Transferencia(cuentaDestino, cuentaOrigen, montoConvertido);

        this.repositorioTransferencia.guardarTransferencia(transferencia);

        this.actualizarSaldoOrigen(cuentaOrigen, montoConvertido);
        this.actualizarSaldoDestino(cuentaDestino, montoConvertido);

//        cuentaOrigen.setSaldo(cuentaOrigen.getSaldo()-montoConvertido);
//        cuentaDestino.setSaldo(cuentaDestino.getSaldo()+montoConvertido);
    }

    private double validarMonto(String monto) {
        try {
            double montoParseado = Double.valueOf(monto);
            return montoParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("monto incorrecto");
        }

    }

    private void actualizarSaldoOrigen(Cuentabancaria cuentaOrigen, double montoConvertido) {

        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();

        
        int idCuenta = cuentaOrigen.getIdcuentaBancaria();
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        
        Cuentabancaria cuentabancaria = this.repositorioCuentaBancaria.obtenerCuentaGuardada(idCuenta);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        double saldo = cuentabancaria.getSaldo() - montoConvertido;
        
        // cuentaOrigen.setSaldo(saldo);

        String sql = "UPDATE cuentabancaria SET  saldo= '" + saldo + "' WHERE  idcuentaBancaria='" + idCuenta + "'";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "el saldo se actualizo correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
    
     private void actualizarSaldoDestino(Cuentabancaria cuentaDestino, double montoConvertido) {
        //obtener la transferencia 
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();

        

        int idCuentaa = cuentaDestino.getIdcuentaBancaria();
        Cuentabancaria cuentabancaria = this.repositorioCuentaBancaria.obtenerCuentaGuardada(idCuentaa);
        
       
         double saldo1 = cuentabancaria.getSaldo()+montoConvertido;
        // cuentaOrigen.setSaldo(saldo);

        String sql = "UPDATE cuentabancaria SET  saldo= '" + saldo1 + "' WHERE  idcuentaBancaria='" + idCuentaa + "'";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "el saldo se actualizo correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public ArrayList<Transferencia> movimientosRelacion(int idCuenta) {
        ArrayList<Transferencia> movimientos = this.repositorioTransferencia.MovimientosRelacionados(idCuenta);
        
        return movimientos;
    }

    public void mostrarUltimoMovimiento(int idCuenta) {
        
        ArrayList<Transferencia> delas8 = this.repositorioTransferencia.MovimientosRelacionados(idCuenta);
        Transferencia tranferenciaUltima = delas8.get(delas8.size() -1 );
        JOptionPane.showMessageDialog(null, tranferenciaUltima);
       
    }

  



}
