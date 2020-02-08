/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import conexion.Conexion;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Comprobante;
import modelo.Fabrica;
import modelo.Repuesto;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import repositorio.RepositorioComprobante;

/**
 *
 * @author pablo
 */
public class ServicioComprobante {
    
    private RepositorioComprobante repositorioComprobante;

    public ServicioComprobante() {
        this.repositorioComprobante = new RepositorioComprobante();
    }
    
    
    

    public void guardarComprobante(Fabrica fabrica, Repuesto repuesto, String precioDelRepuesto, String cantidad, String total, String totalAPagar) {
     double precioConvertido = this.validarprecio(precioDelRepuesto);
     int cantidadConvertida = this.validarCantidad(cantidad);
     double totalConvertido = this.validarTotal(total);
     double totalPagarConvertido = this.validarTotalApagar(totalAPagar);
     
        Comprobante comprobante = new Comprobante(fabrica, repuesto, precioConvertido, cantidadConvertida, totalConvertido, totalPagarConvertido);
        
        this.repositorioComprobante.guardarComprobante(comprobante);
     
     
    }
    
    
    private double validarprecio(String precioDelRepuesto){
        
        try {
            double precioParseado = Double.valueOf(precioDelRepuesto);
            return precioParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("precio incorrecto");
        }
    
    
    
    
    }
    
    private int validarCantidad(String cantidad){
    
        try {
            int cantidadParseado = Integer.valueOf(cantidad);
            return cantidadParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("cantidad incorrecta");
        }
    
    
    }
    
    private double validarTotal(String total){
    
        try {
            double totalParseado = Double.valueOf(total);
            return totalParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("total incorrecto");
        }
    
    
    }
    
    private double validarTotalApagar(String totalAPagar){
    
        try {
            double totalPagarParseado = Double.valueOf(totalAPagar);
            return totalPagarParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("total a pagar incorrecto");
        }
    
    
    
    }
    
    public ArrayList<Comprobante> obtenerTodoComprobante(){
        
        ArrayList<Comprobante>  del8 = this.repositorioComprobante.obtenerTodos();
        
        return del8;
    
    
    
    
    
    }

    public void generarComprobantee() {
        
         Conexion conexion = new Conexion();
        Connection conection2 = conexion.getConnection();

        try {
            JasperReport jasperRport = (JasperReport) JRLoader.loadObject(getClass().getResource("/reporter/report1.jasper"));//aca agregamos todas las librerias
            JasperPrint print = JasperFillManager.fillReport(jasperRport, null, conection2);
            JasperViewer view = new JasperViewer(print, false); //el jasper view nos va a permitir ver nuestro reporte
            view.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al generar el reporte" + e.getMessage());
        }

    
        
    }
    
}
