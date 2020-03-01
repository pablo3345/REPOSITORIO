/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cuentabancaria;
import modelo.Transferencia;
import servicios.ServiciosCuentaBancaria;
import servicios.ServiciosTransferencia;
import vista.VistaPrincipal;

/**
 *
 * @author pablo
 */
public class Presentador {
    
    private VistaPrincipal vistaPrincipal;
    private ServiciosCuentaBancaria serviciosCuentaBancaria;
    private ServiciosTransferencia serviciosTransferencia;

    public Presentador(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        this.serviciosCuentaBancaria = new ServiciosCuentaBancaria();
        this.serviciosTransferencia = new ServiciosTransferencia();
        this.llenarComboTransferencia();
        this.llenarComboCuenta();
    }

    public void guardarCuentaApretada() {
       String nombre = this.vistaPrincipal.getjTextField1Nombre().getText();
       String apellido = this.vistaPrincipal.getjTextField1Apellido().getText();
       String dni = this.vistaPrincipal.getjTextField1DNI().getText();
       String saldo= this.vistaPrincipal.getjTextField1Saldo().getText();
       
        try {
            this.serviciosCuentaBancaria.guardarCuenta(nombre, apellido, dni, saldo);
            JOptionPane.showMessageDialog(null, "la cuenta se guardo correctamente");
        this.vistaPrincipal.getjTextField1Nombre().setText("");
        this.vistaPrincipal.getjTextField1Apellido().setText("");
        this.vistaPrincipal.getjTextField1DNI().setText("");
        this.vistaPrincipal.getjTextField1Saldo().setText("");
        
        this.llenarComboTransferencia();
        this.llenarComboCuenta();
       
            
        } catch (IllegalArgumentException exception) {
            JOptionPane.showMessageDialog(null,exception.getMessage());
        }
    }

    public void guardarTransferenciaApretado() {
       String monto= this.vistaPrincipal. getjTextField1Monto().getText();
       Cuentabancaria cuentaDestino = (Cuentabancaria) this.vistaPrincipal.getjComboBox2CuentaDestino().getSelectedItem();
       Cuentabancaria cuentaOrigen = (Cuentabancaria) this.vistaPrincipal.getjComboBox1CuentaOrigen().getSelectedItem();
      
       
        try {
            this.serviciosTransferencia.guardarTransferencia(cuentaDestino, cuentaOrigen, monto);
            JOptionPane.showMessageDialog(null, "la transferencia se guardo correctamente");
            
             this.vistaPrincipal. getjTextField1Monto().setText("");
            
            
            
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
    private void llenarComboTransferencia(){
        ArrayList<Cuentabancaria> delas = this.serviciosCuentaBancaria.obtenerTodos();
        
        DefaultComboBoxModel cuentaOrigen = new DefaultComboBoxModel<>(delas.toArray());
        this.vistaPrincipal.getjComboBox1CuentaOrigen().setModel(cuentaOrigen);
        
        
        DefaultComboBoxModel cuentaDestino = new DefaultComboBoxModel<>(delas.toArray());
        this.vistaPrincipal.getjComboBox2CuentaDestino().setModel(cuentaDestino);
        
        DefaultComboBoxModel modeloMovimientosRelacionados = new DefaultComboBoxModel<>(delas.toArray());
        this.vistaPrincipal. getjComboBox1MovimientosRelacionados().setModel(modeloMovimientosRelacionados);
        
        
        
        
        
        
    
    
    
    
    
    }

    public void cargarTabla() {
        
        Cuentabancaria cuenta = (Cuentabancaria) this.vistaPrincipal.getjComboBox1MovimientosRelacionados().getSelectedItem();
        int idCuenta= cuenta.getIdcuentaBancaria();
        
       ArrayList<Transferencia> relaciones  = this.serviciosTransferencia.movimientosRelacion(idCuenta);
       
          DefaultTableModel modeloMovimientos = (DefaultTableModel) this.vistaPrincipal.getjTable1movimientosRelacionados().getModel();
          
          modeloMovimientos.setRowCount(0);
    
    for(Transferencia transferenciaa: relaciones){
        Object[] movimientos ={ transferenciaa.getCuentabancariaByCuentaOrigen().getIdcuentaBancaria(), transferenciaa.getCuentabancariaByCuentaDestino().getIdcuentaBancaria(), transferenciaa.getMonto()};
        modeloMovimientos.addRow(movimientos);

}
       
    }
    
    
    public void llenarComboCuenta(){
        
     ArrayList<Cuentabancaria> delas = this.serviciosCuentaBancaria.obtenerTodos();
    
    DefaultComboBoxModel modelo = new DefaultComboBoxModel<>(delas.toArray());
    
    this.vistaPrincipal.getjComboBox1UltimosMovimientos().setModel(modelo);
    
    
    }

    public void mostrarUltimoMovimiento() {
        Cuentabancaria cuentabancaria = (Cuentabancaria) this.vistaPrincipal. getjComboBox1UltimosMovimientos().getSelectedItem();
        int idCuenta = cuentabancaria.getIdcuentaBancaria();
       this.serviciosTransferencia.mostrarUltimoMovimiento(idCuenta);
    }
    
 

    
    
    
}
