/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import com.mysql.jdbc.Connection;
import conexion.Conexion;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Factura;
import modelo.Mesa;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import repositorio.RepositorioFactura;
import repositorio.RepositorioPedido;

/**
 *
 * @author pablo
 */
public class ServicioFactura {
    
    private RepositorioPedido repositorioPedido;
    private RepositorioFactura repositorioFactura;

    public ServicioFactura() {
        this.repositorioPedido =new RepositorioPedido();
        this.repositorioFactura = new RepositorioFactura();
    }
    
    
    

    public ArrayList<Object> agregarATabla(int idMesa) {
        ArrayList<Object> arrayPedidoObjects = this.repositorioPedido.obtenerPedidoSegunMesaOcupada_Factura(idMesa);
        
        return arrayPedidoObjects;
       
    }

    public void guardarFactura(String cliente, String platosYbebidas, String mesa, String precio, String cantidad, String total) {
      double precioConvertido = this.validarPrecio(precio);
      double cantidadConvertida =this.validarCantidad(cantidad);
      
        Factura factura = new Factura(cliente, platosYbebidas, mesa, precioConvertido, cantidadConvertida, total);
        this.repositorioFactura.guardarFactura(factura);
        
        
    }

    private double validarPrecio(String precio) {
        try {
            double precioParseado = Double.valueOf(precio);
            return precioParseado;
                    
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("precio incorrecto");
        }
    }

    private double validarCantidad(String cantidad) {
        try {
            double cantidadParseado = Double.valueOf(cantidad);
            return cantidadParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("cantidad incorrecta");
        }
    }

    public void truncarTablaFactura() {
       this.repositorioFactura.truncarTabla();
    }

    public ArrayList<Double> traerElTotalFactura() {
       ArrayList<Double> valorTotalFactura = this.repositorioFactura.obtenerTotalFactura();
       
       return valorTotalFactura;
    }

    public void ponerMesasDisponiblesFactura(int idMesa) {
       this.repositorioFactura.ponerMesasDisponiblesFacturas(idMesa);
    }

    public void ponerPedidoPasivo(int idPedido) {
       this.repositorioFactura.ponerPedidoPasivo(idPedido);
    }

    public void ponerElTotal(double totalFacturaUltimo) {
       this.repositorioFactura.poneerElTotal(totalFacturaUltimo);
    }

    public void verFactura() {
        Conexion conexion = new Conexion();
        Connection con = (Connection) conexion.getConection();
        try {
            JasperReport jasperRport = (JasperReport) JRLoader.loadObject(getClass().getResource("/reporter/report1.jasper"));//aca agregamos todas las librerias
            JasperPrint print = JasperFillManager.fillReport(jasperRport, null, con);
            JasperViewer view = new JasperViewer(print, false); //el jasper view nos va a permitir ver nuestro reporte
            view.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al generar el reporte" + e.getMessage());
        }
       
    }
    
}
