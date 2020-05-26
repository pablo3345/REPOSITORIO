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
import modelo.Factura;
import modelo.Mesa;
import modelo.Pedido;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import repositorio.RepositorioFactura;

/**
 *
 * @author pablo
 */
public class ServicioFactura {

    private RepositorioFactura repositorioFactura;

    public ServicioFactura() {
        this.repositorioFactura = new RepositorioFactura();
    }

    public void guardarFacturaDedeLaTabla(String cliente, String platosyBebidas, String cantidad, String precio, String mesa, String total) {
//      this.validarCliente(cliente);
//      this.validarPlatosyBebidas(platosyBebidas);
        double cantidadConvertida = this.validarCantidad(cantidad);
        double precioConvertido = this.validarPrecio(precio);
//      this.validarMesa(mesa);

        Factura factura = new Factura(cliente, platosyBebidas, cantidadConvertida, precioConvertido, mesa, total);

        this.repositorioFactura.guardarFactura(factura);
        
        this.evaluarSiSeguardoLaMismaFila(factura);
        
       
    }

    private double validarCantidad(String cantidad) {

        try {
            double cantidadParseada = Double.valueOf(cantidad);

            return cantidadParseada;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("cantidad equivocada");
        }

    }

    private double validarPrecio(String precio) {

        try {
            double precioParseado = Double.valueOf(precio);
            return precioParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("precio equivocado");
        }

    }

    public ArrayList<Object> mandarMesaOcupadaAfactura(int idMesa) {
        ArrayList<Object> arrayss = this.repositorioFactura.obtenerConsultaHQLmesasOcupadas(idMesa);

        return arrayss;

    }

    public ArrayList<Double> obtenerTotalFactura() {

        ArrayList<Double> totalFactura = this.repositorioFactura.obtenerTotalFactura();

        return totalFactura;

    }

    public void verComprobanteReporter(String ultimoParaGuar) {
        Conexion conexion = new Conexion();
        Connection conection2 = conexion.getConection();

        //obtener la factura
        int idFactura = 1;

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        String sql = "UPDATE factura SET  total= '" + ultimoParaGuar + "' WHERE  idfactura='" + idFactura + "'";

        try {
            PreparedStatement preparedStatement = conection2.prepareStatement(sql);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        try {
            JasperReport jasperRport = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/report1.jasper"));//aca agregamos todas las librerias
            JasperPrint print = JasperFillManager.fillReport(jasperRport, null, conection2);
            JasperViewer view = new JasperViewer(print, false); //el jasper view nos va a permitir ver nuestro reporte
            view.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al generar el reporte" + e.getMessage());
        }
    }

    public void limpiarFactura() {

        Conexion conexion = new Conexion();
        Connection conection2 = conexion.getConection();

        //obtener la factura
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        String sql = "TRUNCATE factura";

        try {
            PreparedStatement preparedStatement = conection2.prepareStatement(sql);
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "La tabla se limpio correctamente");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void actualizarMesasDespuesDeLaFactura(int idMesa) {

        Conexion conexion = new Conexion();
        Connection con = conexion.getConection();
        String disponible = "disponible";
        String sql = "UPDATE mesa SET  estado= '" + disponible + "' WHERE  idmesa='" + idMesa + "'";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.executeUpdate();
            // JOptionPane.showMessageDialog(null, "la mesa se actualizo correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void evaluarSiSeguardoLaMismaFila(Factura factura) {
        
        
    
          
       
          
         
           
           
    
    }

    public ArrayList<Integer> obtetenerPedidoSegunMesa(int idmesa) {
       ArrayList<Integer> arrayId = this.repositorioFactura.obtenerPedidoSegunMesaOcupada(idmesa);
       
       return arrayId;
    }
    

             
          

        

    

}
