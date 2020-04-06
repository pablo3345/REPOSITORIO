/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import com.mysql.jdbc.Statement;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.DetalleVenta;
import modelo.Fabrica;
import modelo.Nombrerepuesto;
import modelo.Repuesto;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import servicios.ServicioDetalle_venta;
import servicios.ServicioFabrica;
import servicios.ServicioNombreRepuesto;
import servicios.ServicioRepuesto;
import vistaPrincipal.VistaPrincipal;

/**
 *
 * @author pablo
 */
public class Presentador {

    private VistaPrincipal vistaprincipal;
    private ServicioFabrica servicioFabrica;
    private ServicioRepuesto servicioRepuesto;
    private ServicioDetalle_venta servicioDetalle_venta;
    private ServicioNombreRepuesto servicioNombreRepuesto;

    public Presentador(VistaPrincipal vistaprincipal) {
        this.vistaprincipal = vistaprincipal;
        this.servicioFabrica = new ServicioFabrica();
        this.servicioRepuesto = new ServicioRepuesto();
        this.servicioDetalle_venta = new ServicioDetalle_venta();
        this.servicioNombreRepuesto = new ServicioNombreRepuesto();
        llenarComboboxNombreRepuesto();
        llenarComboRepuestoFabrica();
        llenarComboFabrica();

    }

    public void guardarRepuestoApretado() {
        Nombrerepuesto nombrerepuesto = (Nombrerepuesto) this.vistaprincipal.getjComboBox1nombre_Repuesto().getSelectedItem();
        String nombreEmpleado = this.vistaprincipal.getjTextField1NombreEmpleado_repuesto().getText();
        String codigo = this.vistaprincipal.getjTextField2Codigo().getText();
        String precioDeLista = this.vistaprincipal.getjTextField3PrecioDeLista_repuesto().getText();
        String stockActual = this.vistaprincipal.getjTextField4StockActual().getText();
        String stockMinimo = this.vistaprincipal.getjTextField5StockMinimo().getText();

        try {

            this.servicioRepuesto.guardarRepuesto(nombrerepuesto, nombreEmpleado, codigo, precioDeLista, stockActual, stockMinimo);

            this.vistaprincipal.getjTextField2Codigo().setText("");
            this.vistaprincipal.getjTextField1NombreEmpleado_repuesto().setText("");
            this.vistaprincipal.getjTextField3PrecioDeLista_repuesto().setText("");
            this.vistaprincipal.getjTextField4StockActual().setText("");
            this.vistaprincipal.getjTextField5StockMinimo().setText("");

            JOptionPane.showMessageDialog(null, "el repuesto se guardo correctamente");

            this.llenarComboRepuestoFabrica();

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }

    }

    public void guardarFabricaApretado() {

        Repuesto repuesto = (Repuesto) this.vistaprincipal.getjComboBox1Repuesto_Fabrica().getSelectedItem();

        Calendar calendar = Calendar.getInstance();
        java.sql.Timestamp fecha = new java.sql.Timestamp(calendar.getTimeInMillis());

        String nombre = this.vistaprincipal.getjTextField6NombreFabrica().getText();
        String direccion = this.vistaprincipal.getjTextField5Direccion().getText();

        String costoDeEnvio = this.vistaprincipal.getjTextField4CostoDeEnvio().getText();
        String costoConIva = this.vistaprincipal.getjTextField2PrecioConIva_fabrica().getText();
        String cantidadRepuestos = this.vistaprincipal.getjTextField1CantidadDeRepuestos_fabrica().getText();
        String total = this.vistaprincipal.getjTextField3Total_fabrica().getText();
        
    
       //  int cantidadRepuestosStock = Integer.valueOf(this.vistaprincipal.getjTextField1CantidadDeRepuestos_fabrica().getText());
         
        try {
            this.servicioFabrica.guardarFabrica(repuesto, fecha, nombre, direccion, costoDeEnvio, costoConIva, cantidadRepuestos, total);
            this.cargarTablaApretado();
           
            this.controlarStock();
         
            
          
            

            JOptionPane.showMessageDialog(null, "La fabrica se guardo correctamente");

            this.llenarComboFabrica();

            this.vistaprincipal.getjTextField6NombreFabrica().setText("");
            this.vistaprincipal.getjTextField5Direccion().setText("");

            this.vistaprincipal.getjTextField4CostoDeEnvio().setText("");
            this.vistaprincipal.getjTextField2PrecioConIva_fabrica().setText("");
            this.vistaprincipal.getjTextField1CantidadDeRepuestos_fabrica().setText("");
            this.vistaprincipal.getjTextField3Total_fabrica().setText("");
            
        

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void guardarComprobanteApretado() {
        
        

        int idFabrica = Integer.valueOf(this.vistaprincipal.getjTextField1Fabrica_comprobante().getText());
       

        Fabrica fabrica = this.servicioDetalle_venta.obtenerFabrica(idFabrica);
        
        
        Repuesto repuesto = (Repuesto) this.vistaprincipal.getjComboBox1Repuesto_comprobante().getSelectedItem();
        String cantidad = this.vistaprincipal.getjTextField1Cantidad_comprobante().getText();
        String precioConIva = this.vistaprincipal.getjTextField2precioUnitarioConIva_comprobante().getText();
        String total = this.vistaprincipal.getjTextField3total_comprobante().getText();
        String totalAPagar = this.vistaprincipal.getjTextField4TotalApagar_comprobante().getText();
        
        try {
            this.servicioDetalle_venta.guardarComprobante(fabrica, repuesto, cantidad, precioConIva, total, totalAPagar);
            {

                this.vistaprincipal.getjTextField1Cantidad_comprobante().setText("");
                this.vistaprincipal.getjTextField2precioUnitarioConIva_comprobante().setText("");
                this.vistaprincipal.getjTextField3total_comprobante().setText("");
                this.vistaprincipal.getjTextField4TotalApagar_comprobante().setText("");

                JOptionPane.showMessageDialog(null, "el comprobante se guardo correctamente");

            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void guardarNombre_Apretado() {
        String nombre = this.vistaprincipal.getjTextField1nombre_nombreRepuesto().getText();

        try {
            this.servicioNombreRepuesto.guardarNombreRepuesto(nombre);
            JOptionPane.showMessageDialog(null, "el nombre del producto se guardo correctamente");

            this.llenarComboboxNombreRepuesto();

            this.vistaprincipal.getjTextField1nombre_nombreRepuesto().setText("");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void llenarComboboxNombreRepuesto() {
        ArrayList<Nombrerepuesto> arrayNombrerepuestos = this.servicioNombreRepuesto.obtenerTodos();
        


        DefaultComboBoxModel<Object> modelo = new DefaultComboBoxModel<>(arrayNombrerepuestos.toArray());
        this.vistaprincipal.getjComboBox1nombre_Repuesto().setModel(modelo);

    }

    public void llenarComboRepuestoFabrica() {

        ArrayList<Repuesto> arrayRepuesto = this.servicioRepuesto.obtenerTodos();
        
        

        DefaultComboBoxModel modelo2 = new DefaultComboBoxModel<>(arrayRepuesto.toArray());

        this.vistaprincipal.getjComboBox1Repuesto_Fabrica().setModel(modelo2);

        this.vistaprincipal.getjComboBox1Repuesto_comprobante().setModel(modelo2);

    }

    public void cargarTablaApretado() {
        ArrayList<Repuesto> delas5 = this.servicioRepuesto.obtenerTodos();
       

        DefaultTableModel modeloTabla = (DefaultTableModel) this.vistaprincipal.getjTable1Repuestos().getModel();
        modeloTabla.setRowCount(0);

        for (Repuesto respuesRepuesto : delas5) {
            // int a = Integer.parseInt(this.vistaprincipal.getjTextField1CantidadDeRepuestos_fabrica().getText());

            Object[] array = {respuesRepuesto.getIdrepuesto(), respuesRepuesto.getNombrerepuesto().getIdnombreRepuesto(), respuesRepuesto.getCodigo(), respuesRepuesto.getPrecioDeLista(),
                respuesRepuesto.getStockActual(), respuesRepuesto.getStockMinimo(), respuesRepuesto.getNombre()};

            modeloTabla.addRow(array);

        }
    }

    public void calcularTotalFabricaApretado() {

        try {
            double totalConIva = Double.valueOf(this.vistaprincipal.getjTextField2PrecioConIva_fabrica().getText());
            double cantidadRepuesto = Double.valueOf(this.vistaprincipal.getjTextField1CantidadDeRepuestos_fabrica().getText());
            double costoDeEnvio = Double.valueOf(this.vistaprincipal.getjTextField4CostoDeEnvio().getText());

            double total1 = totalConIva * 0.05 + totalConIva;

            double total = total1 * cantidadRepuesto;
            double totalConEnvio = total + costoDeEnvio;

            JOptionPane.showMessageDialog(null, "el total con iva incluido es: " + totalConEnvio);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "todavia no ha ingresado los campos correspondientes");
        }

    }

    public void llenarComboFabrica() {

        ArrayList<Fabrica> delas10 = this.servicioFabrica.obtenerTodos();

        DefaultComboBoxModel modelo8 = new DefaultComboBoxModel<>(delas10.toArray());

        this.vistaprincipal.getjComboBox1Fabrica_comprobante().setModel(modelo8);

    }

    public void controlarStock() {

        ArrayList<Repuesto> delas11 = this.servicioRepuesto.obtenerTodos();
       
       

        for (Repuesto repues : delas11) {
            if (repues.getStockActual() <= 10) {
                JOptionPane.showMessageDialog(null, "hay stock minimo " + repues.getCodigo());

            }

        }

    }



    public void calcularTotalAPagar() {

        // ArrayList<Object> agregar = new ArrayList<>();
        try {
            ArrayList<Double> dellass = this.servicioDetalle_venta.obtenerConsulta();
            double total = Double.parseDouble(this.vistaprincipal.getjTextField3total_comprobante().getText());
            double ultimo = dellass.get(dellass.size() - 1);

            double totalSuma = total + ultimo;
            DecimalFormat formato = new DecimalFormat("#.00");

            JOptionPane.showMessageDialog(null, formato.format(totalSuma));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "debe haber guardado uno o mas registros y poner el valor en total");
        }

    }

    public void limpiarTablaApretado() {

        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();

        String sql = "DELETE from detalle_venta ";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "la tabla se limpio correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
      

    }
    
    public Repuesto obtenerRepuesto(int id){
     
         
         Repuesto repuesto =this.servicioRepuesto.getRepuesto(id);
    
    
    
    return repuesto;
    
    
    }

    public void generarComprobanteApretado() {
       Conexion conexion = new Conexion();
       Connection con = conexion.getConexion();
       
       
          try {
            JasperReport jasperReport = (JasperReport)JRLoader.loadObject(getClass().getResource("/reporter/report1.jasper"));
            JasperPrint print = JasperFillManager.fillReport(jasperReport, null, con);
            JasperViewer jasperViewer = new JasperViewer(print, false);
            jasperViewer.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al generar el reporte" + e.getMessage());
        }
    
    
    
    
    
    
    
    
    
    
    }
    
  
    
  
  
}
