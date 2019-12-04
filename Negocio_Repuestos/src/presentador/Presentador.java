/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javassist.compiler.TokenId;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.DetalleVenta;
import modelo.Proveedores;
import modelo.Repuesto;
import modelo.Ventas;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import servicio.ServiciosDetalle_Ventas;
import servicio.ServiciosFabrica;
import servicio.ServiciosProveedores;
import servicio.ServiciosRespuesto;
import servicio.ServiciosVentas;
import vista.VistaPrincipal;

/**
 *
 * @author pablo
 */
public class Presentador {

    private VistaPrincipal vistaPrincipal;
    private ServiciosProveedores serviciosProveedores;
    private ServiciosRespuesto serviciosRespuesto;
    private ServiciosVentas serviciosVentas;
    private ServiciosDetalle_Ventas serviciosDetalle_Ventas;
    private ServiciosFabrica serviciosFabrica;

    public Presentador(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        this.serviciosProveedores = new ServiciosProveedores();
        this.serviciosRespuesto = new ServiciosRespuesto();
        this.serviciosVentas = new ServiciosVentas();
        this.serviciosDetalle_Ventas = new ServiciosDetalle_Ventas();
        this.serviciosFabrica = new ServiciosFabrica();
        this.llenarComboProveedores();
        this.comboBoxRepuestos();
        this.llenarComboRepuestoVentas();
        llenarComboRepuesto_fabrica();

    }

    public void guardarProveedorApretado() {

        String nombre = this.vistaPrincipal.getNombre_proveedor().getText();
        String direccion = this.vistaPrincipal.getDireccion_proveedor().getText();
        try {
            this.serviciosProveedores.guardarProveedores(nombre, direccion);

            this.vistaPrincipal.getNombre_proveedor().setText("");
            this.vistaPrincipal.getDireccion_proveedor().setText("");

            JOptionPane.showMessageDialog(null, "el proveedor se guardo correctamente");

            llenarComboProveedores();

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void guardarRespuestoApretado() {
        Proveedores proveedores = (Proveedores) this.vistaPrincipal.getjComboBox1Proveedores_respuesto().getSelectedItem();
        String nombre = this.vistaPrincipal.getjTextField1NOMBRE_RESPUESTO().getText();
        String codigo = this.vistaPrincipal.getjTextField2CODIGO_RESPUESTO().getText();
        String precioSinIva = this.vistaPrincipal.getjTextField4PRECIO_RESPUESTO().getText();
        String stockActual = this.vistaPrincipal.getjTextField3STOCK_ACTUAL_RESPUESTO().getText();
        String stockMinimo = this.vistaPrincipal.getjTextField5STOCK_MINIMO_RESPUESTO().getText();

        try {
            this.serviciosRespuesto.guardarRespuesto(proveedores, nombre, codigo, precioSinIva, stockActual, stockMinimo);

            this.vistaPrincipal.getjTextField1NOMBRE_RESPUESTO().setText("");
            this.vistaPrincipal.getjTextField2CODIGO_RESPUESTO().setText("");
            this.vistaPrincipal.getjTextField4PRECIO_RESPUESTO().setText("");
            this.vistaPrincipal.getjTextField3STOCK_ACTUAL_RESPUESTO().setText("");
            this.vistaPrincipal.getjTextField5STOCK_MINIMO_RESPUESTO().setText("");

            JOptionPane.showMessageDialog(null, "el repuesto se guardo correctamente");
            this.comboBoxRepuestos();
            this.llenarComboRepuestoVentas();

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void guardarVentasApretado() {
        Calendar calendar = Calendar.getInstance();
        java.sql.Timestamp fecha = new java.sql.Timestamp(calendar.getTimeInMillis());
        String montoTotalConIva = this.vistaPrincipal.getjTextField1MONTO_TOTAL_IVA_VENTAS().getText();
        this.vistaPrincipal.getjRadioButton1().setActionCommand("si");
        this.vistaPrincipal.getjRadioButton2().setActionCommand("no");
        String efectuoElPago = this.vistaPrincipal.getButtonGroup1().getSelection().getActionCommand();
        Repuesto repuesto = (Repuesto) this.vistaPrincipal.getjComboBox1repuesto_ventas().getSelectedItem();

//       if(this.vistaPrincipal.getjRadioButton1().isSelected()==false && this.vistaPrincipal.getjRadioButton2().isSelected()==false){
//       JOptionPane.showMessageDialog(null, "gghghg");
//       
//       }
        try {

            this.serviciosVentas.guardarVentas(fecha, montoTotalConIva, efectuoElPago, repuesto);

            this.vistaPrincipal.getjTextField1MONTO_TOTAL_IVA_VENTAS().setText("");

            JOptionPane.showMessageDialog(null, "la venta se guardo correctamente");

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }

    }

    public void guardarDetalleVentaApretado() {
      

        try {
        String precioUnitarioConIva = this.vistaPrincipal.getjTextField1precioUnitario_detalleVenta().getText();
        String cantidad = this.vistaPrincipal.getjTextField2Cantidad_detalleVenta().getText();
        
          
       
        int id_repuesto = Integer.parseInt(this.vistaPrincipal.getjTextField1respuesto_detalleVenta().getText());
            
            
       
       
        

        this.serviciosRespuesto.getRepuesto(id_repuesto);
        Repuesto repuesto = this.serviciosRespuesto.getRepuesto(id_repuesto);

        int id_ventas = Integer.valueOf(this.vistaPrincipal.getjTextField2ventas_DetalleVenta().getText());
        Ventas ventas = this.serviciosVentas.getVentas(id_ventas);
            this.serviciosDetalle_Ventas.guardarDetalle_Venta(repuesto, ventas, precioUnitarioConIva, cantidad);

            int ultimoo = 0;

            this.vistaPrincipal.getjTextField1precioUnitario_detalleVenta().setText("");
            this.vistaPrincipal.getjTextField2Cantidad_detalleVenta().setText("");

            JOptionPane.showMessageDialog(null, "el detalle venta se guardo correctamente");
        } 
        
        
        catch(NumberFormatException s){
        JOptionPane.showMessageDialog(null, "ingrese un valor numerico");
        
        }
        
        catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
           
            
        }
       
     
        
        
    
       
    }

    public void guardarFabricaApretado() {
        
        Repuesto repuesto = (Repuesto) this.vistaPrincipal. getjComboBox1repuesto_fabrica().getSelectedItem();
        String nombre = this.vistaPrincipal.getjTextField3nombre_fabrica().getText();
        String localidad = this.vistaPrincipal.getjTextField2localidad_fabrica().getText();
        String costoDeEnvio = this.vistaPrincipal.getjTextField1costoDeEnvio_fabrica().getText();
        this.vistaPrincipal.getjRadioButton3().setActionCommand("si");
        this.vistaPrincipal.getjRadioButton4().setActionCommand("no");
        String necesitaEnvio = this.vistaPrincipal.getButtonGroup2().getSelection().getActionCommand();
        this.vistaPrincipal.getjRadioButton5().setActionCommand("si");
        this.vistaPrincipal.getjRadioButton6().setActionCommand("no");
        String efectuoElPago = this.vistaPrincipal.getButtonGroup3().getSelection().getActionCommand();
        
        try {
            this.serviciosFabrica.guardarFabrica(repuesto, nombre, localidad, costoDeEnvio, necesitaEnvio, efectuoElPago);
            
            this.vistaPrincipal.getjTextField3nombre_fabrica().setText("");
            this.vistaPrincipal.getjTextField2localidad_fabrica().setText("");
            this.vistaPrincipal.getjTextField1costoDeEnvio_fabrica().setText("");
            
            JOptionPane.showMessageDialog(null, "la fabrica se guardo correctamente");

          
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
     
        

    }

    public void llenarComboProveedores() {
        ArrayList<Proveedores> array = this.serviciosProveedores.obtenerTodosProveedores();

        DefaultComboBoxModel<Object> comboBoxProveedores = new DefaultComboBoxModel<>(array.toArray());
        this.vistaPrincipal.getjComboBox1Proveedores_respuesto().setModel(comboBoxProveedores);

    }

    public int controlarStockApretado() {

        ArrayList<Repuesto> arrayRepuesto = this.serviciosRespuesto.obtenerRepuestos();
        ArrayList<Object> stockActuall = new ArrayList<>();

        int ultimoElemento = 0;

        for (Repuesto repues : arrayRepuesto) {

            if (repues.getCodigo().equals(this.vistaPrincipal.getjTextField1codigo_repuesto().getText())) {

                stockActuall.add(repues.getStockActual());

            }

        }

        try {
            JOptionPane.showMessageDialog(null, stockActuall.get(stockActuall.size() - 1) + " cajas");

        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "¡codigo equivocado!, Intentelo nuevamente");
        }

        ultimoElemento = (int) stockActuall.get(stockActuall.size() - 1);

        if (ultimoElemento <= 10) {
            JOptionPane.showMessageDialog(null, "stock minimo");

        }

        return (int) stockActuall.get(stockActuall.size() - 1);

    }

    public void comboBoxRepuestos() {

        ArrayList<Repuesto> array = this.serviciosRespuesto.obtenerRepuestos();

        DefaultComboBoxModel<Object> modelo = new DefaultComboBoxModel<>(array.toArray());
        this.vistaPrincipal.getjComboBox1repuestos_Repuestos().setModel(modelo);
    }

    public void llenarComboRepuestoVentas() {
        ArrayList<Repuesto> repuestosVentas = this.serviciosRespuesto.obtenerRepuestos();

        DefaultComboBoxModel modeloRepuesto = new DefaultComboBoxModel(repuestosVentas.toArray());

        this.vistaPrincipal.getjComboBox1repuesto_ventas().setModel(modeloRepuesto);

    }

    public void cargarTablaVentas() {
        ArrayList<Ventas> arrayVen = this.serviciosVentas.obtenerTodoVentas();

        DefaultTableModel tablaVentas = (DefaultTableModel) this.vistaPrincipal.getjTable1Ventas_Ventas().getModel();

        tablaVentas.setRowCount(0);

        for (Ventas ventas : arrayVen) {
            Object[] delas = {ventas.getIdventas(), ventas.getFecha().toString(), ventas.getMontoTotalConIva(), ventas.getEfectuoElPago(), ventas.getRepuesto().getIdrepuesto()};
            tablaVentas.addRow(delas);

        }
    }
        
        public Repuesto getRepuesto(int id_repuestos){
            
         
        
            Repuesto repuestos = this.serviciosRespuesto.getRepuesto(id_repuestos);
            
            return repuestos;
            
            
          
        
        }
        
        public void llenarComboRepuesto_fabrica(){
        
        ArrayList<Repuesto> arrayRepuesto = this.serviciosRespuesto.obtenerRepuestos();
        
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel(arrayRepuesto.toArray());
        
        
        this.vistaPrincipal. getjComboBox1repuesto_fabrica().setModel(modeloCombo);
        
        }

    public void mostrarComprobanteApretado() {
       Conexion conexion = new Conexion();
       Connection con = conexion.getConexion();
       
       
        try {
            JasperReport jasperReport = (JasperReport)JRLoader.loadObject(getClass().getResource("/reportes/report1.jasper"));
            JasperPrint print = JasperFillManager.fillReport(jasperReport, null, con);
            JasperViewer jasperViewer = new JasperViewer(print, false);
            jasperViewer.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al generar el reporte" + e.getMessage());
        }
       
       
    }
    
    
   
 
    
   
    
 
    
    
            
    
  
    

}


