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
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Comprobante;
import modelo.Fabrica;
import modelo.Repuesto;
import modelo.Venta;
import servicios.ServicioComprobante;
import servicios.ServicioFabrica;
import servicios.ServicioRepuesto;
import servicios.ServicioVenta;
import vistaPrincipal.VistaPrincipal;

/**
 *
 * @author pablo
 */
public class Presentador {

    private VistaPrincipal vistaPrincipal;
    private ServicioRepuesto servicioRepuesto;
    private ServicioFabrica servicioFabrica;
    private ServicioVenta servicioVenta;
    private ServicioComprobante servicioComprobante;

    public Presentador(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        this.servicioRepuesto = new ServicioRepuesto();
        this.servicioFabrica = new ServicioFabrica();
        this.servicioVenta = new ServicioVenta();
        this.servicioComprobante = new ServicioComprobante();
        this.llenarComboBoxEstado();
        this.llenarComboAltaBaja();
        this.llenarComboBaja();
        this.llenarComboAltA();
        this.llenarComboFabrica_venta();
        this.llenarComboRepuesto_venta();

    }

    public void guardarRepuestoApretado() {
        String nombre = this.vistaPrincipal.getjTextField1Nombre_repuesto().getText();
        String codigo = this.vistaPrincipal.getjTextField1Codigo_repuesto().getText();
        String precio = this.vistaPrincipal.getjTextField1Precio_Repuesto().getText();
        String stockActual = this.vistaPrincipal.getjTextField1StockActual_repuesto().getText();
        String estado = (String) this.vistaPrincipal.getjComboBox1Estado_repuestos().getSelectedItem();

        try {

            this.servicioRepuesto.guardarRepuesto(nombre, codigo, precio, stockActual, estado);
            this.llenarComboBaja();
            this.llenarComboAltA();
            this.llenarComboRepuesto_venta();

            this.vistaPrincipal.getjTextField1Nombre_repuesto().setText("");
            this.vistaPrincipal.getjTextField1Codigo_repuesto().setText("");
            this.vistaPrincipal.getjTextField1Precio_Repuesto().setText("");
            this.vistaPrincipal.getjTextField1StockActual_repuesto().setText("");

            JOptionPane.showMessageDialog(null, "el repuesto se guardo correctamenta");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void llenarComboBoxEstado() {

        ArrayList<String> estado = new ArrayList<>();

        estado.add("ALTA");
        estado.add("BAJA");

        DefaultComboBoxModel<Object> comboEstado = new DefaultComboBoxModel<>(estado.toArray());

        this.vistaPrincipal.getjComboBox1Estado_repuestos().setModel(comboEstado);

    }

    public void altaBajaProducto() {

        try {
            int idBaja = Integer.parseInt(this.vistaPrincipal.getjTextField1ID_baja_Repuesto().getText());

            String altaBajaCombo = (String) this.vistaPrincipal.getjComboBox1AltaBaja_producto().getSelectedItem();

            Conexion conexion = new Conexion();
            Connection con = conexion.getConnection();
            //String baja = "BAJA";

            String sql = "UPDATE repuesto SET estado = '" + altaBajaCombo + "' WHERE idrepuesto = '" + idBaja + "'";

            try {

                PreparedStatement preparedStatement = con.prepareStatement(sql);
                preparedStatement.executeUpdate();
                JOptionPane.showMessageDialog(null, "el estado se actualizo");

                this.llenarComboBaja();
                this.llenarComboAltA();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        } catch (NumberFormatException i) {
            JOptionPane.showMessageDialog(null, "debe ingresar el estado del repuesto");
        }

    }

    private void llenarComboAltaBaja() {
        ArrayList<String> altabaja = new ArrayList<>();

        altabaja.add("BAJA");
        altabaja.add("ALTA");

        DefaultComboBoxModel<Object> altabajaa = new DefaultComboBoxModel<>(altabaja.toArray());
        this.vistaPrincipal.getjComboBox1AltaBaja_producto().setModel(altabajaa);

    }

    public void repuestosDadosDeBaja() {
        ArrayList<Repuesto> delass = this.servicioRepuesto.obtenerTodosRepuesto();

        this.llenarComboAltaBaja();

    }

    private void llenarComboBaja() {

        ArrayList<Repuesto> delass = this.servicioRepuesto.obtenerTodosRepuesto();

        ArrayList<Repuesto> auxiliar2 = new ArrayList<>();

        for (Repuesto resp : delass) {

            if (resp.getEstado().equals("BAJA")) {
                auxiliar2.add(resp);

            }

        }

        DefaultComboBoxModel baja = new DefaultComboBoxModel<>(auxiliar2.toArray());

        this.vistaPrincipal.getjComboBox1DadosDebaja_repuestos().setModel(baja);

    }

    private void llenarComboAltA() {

        ArrayList<Repuesto> auxiliar = new ArrayList<>();

        ArrayList<Repuesto> delasss = this.servicioRepuesto.obtenerTodosRepuesto();

        for (Repuesto res : delasss) {
            if (res.getEstado().equals("ALTA")) {
                auxiliar.add(res);
            }

        }

        DefaultComboBoxModel alta = new DefaultComboBoxModel<>(auxiliar.toArray());

        this.vistaPrincipal.getjComboBox1ComboAlta_repuestos().setModel(alta);

    }

    public void guardarFabricaApretado() {
        String nombre = this.vistaPrincipal.getjTextField1Nombre_fabrica().getText();
        String direccion = this.vistaPrincipal.getjTextField2Direccion_fabrica().getText();

        try {
            this.servicioFabrica.guardarFabrica(nombre, direccion);

            this.vistaPrincipal.getjTextField1Nombre_fabrica().setText("");
            this.vistaPrincipal.getjTextField2Direccion_fabrica().setText("");

            JOptionPane.showMessageDialog(null, "la fabrica se guardo correctamente");

            this.llenarComboFabrica_venta();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void guardarVentaApretado() {
        Fabrica fabrica = (Fabrica) this.vistaPrincipal.getjComboBox1Fabrica_venta().getSelectedItem();
        Repuesto repuesto = (Repuesto) this.vistaPrincipal.getjComboBox2Repuesto_venta().getSelectedItem();
        String precio = this.vistaPrincipal.getjTextField1Precio_venta().getText();
        String cantidad = this.vistaPrincipal.getjTextField1CantidadRepuestos_venta().getText();
        String total = this.vistaPrincipal.getjTextField1Total_venta().getText();

        try {
            this.servicioVenta.guardarVenta(fabrica, repuesto, precio, cantidad, total);

            JOptionPane.showMessageDialog(null, "la venta se guardo correctamente");

            this.vistaPrincipal.getjTextField1Precio_venta().setText("");
            this.vistaPrincipal.getjTextField1CantidadRepuestos_venta().setText("");
            this.vistaPrincipal.getjTextField1Total_venta().setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void llenarComboFabrica_venta() {

        ArrayList<Fabrica> del = this.servicioFabrica.obtenerTodos();

        DefaultComboBoxModel modelo2 = new DefaultComboBoxModel<>(del.toArray());

        this.vistaPrincipal.getjComboBox1Fabrica_venta().setModel(modelo2);

    }

    public void llenarComboRepuesto_venta() {

        ArrayList<Repuesto> del5 = this.servicioRepuesto.obtenerTodosRepuesto();

        DefaultComboBoxModel modelo3 = new DefaultComboBoxModel<>(del5.toArray());

        this.vistaPrincipal.getjComboBox2Repuesto_venta().setModel(modelo3);

    }

    public void calcularTotalVenta() {
        double precio = Double.valueOf(this.vistaPrincipal.getjTextField1Precio_venta().getText());

        double cantidad = Double.valueOf(this.vistaPrincipal.getjTextField1CantidadRepuestos_venta().getText());
        double total = 0;
        total = precio * cantidad;

        DecimalFormat formato = new DecimalFormat("#.00");

        JOptionPane.showMessageDialog(null, formato.format(total));

    }

    public void guardarComprobanteApretado() {
        try {
             int idFabrica = Integer.valueOf(this.vistaPrincipal.getjTextField1Fabrica_comprobante().getText());
        Fabrica fabrica = this.servicioFabrica.obtenerFabrica(idFabrica);

        int idRepuesto = Integer.valueOf(this.vistaPrincipal.getjTextField2repuesto_comprobante().getText());
        Repuesto repuesto = this.servicioRepuesto.obtenerRepuesto(idRepuesto);

        String precioDelRepuesto = this.vistaPrincipal.getjTextField3precio_comprobante().getText();
        String cantidad = this.vistaPrincipal.getjTextField4cantidad_comprobante().getText();
        String total = this.vistaPrincipal.getjTextField5Total_comprobante().getText();
        String totalAPagar = this.vistaPrincipal.getjTextField6TotalAPagar_comprobante().getText();

        try {
            this.servicioComprobante.guardarComprobante(fabrica, repuesto, precioDelRepuesto, cantidad, total, totalAPagar);

            JOptionPane.showMessageDialog(null, "El comprobante se guardo correctamente");

            this.vistaPrincipal.getjTextField3precio_comprobante().setText("");
            this.vistaPrincipal.getjTextField4cantidad_comprobante().setText("");
            this.vistaPrincipal.getjTextField5Total_comprobante().setText("");
            this.vistaPrincipal.getjTextField6TotalAPagar_comprobante().setText("");

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "falta llenar campos");
        }
       

    }

    public void cargarTablaVentas() {

        ArrayList<Venta> arrayVentas = this.servicioVenta.obtenerArrayTodos();

        DefaultTableModel tabla = (DefaultTableModel) this.vistaPrincipal.getjTable1Tabla_comprobante().getModel();

        tabla.setRowCount(0);

        for (Venta ventas : arrayVentas) {

            Object[] agregarFilas = {ventas.getIdVenta().toString(), ventas.getFabrica().getIdfabrica().toString(), ventas.getRepuesto().getIdrepuesto().toString(), ventas.getPrecioDelRepuesto(), ventas.getCantidadDeRepuestos(), ventas.getTotal()};

            tabla.addRow(agregarFilas);

        }

    }

    public void totalApagarComprobante() {
        
        try {
              ArrayList<Comprobante> del9 = this.servicioComprobante.obtenerTodoComprobante();
        
        double total = 0;
      
        
        for (Comprobante comp : del9) {

            total += comp.getTotal();

        }
        
          
         double totalTextField = Double.valueOf(this.vistaPrincipal.getjTextField5Total_comprobante().getText());
        
       
     
       total = total + totalTextField;

        JOptionPane.showMessageDialog(null, total);
            
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "debe ingresar datos en total");
        }

      

    }

    public void obtenerTotalFabrica() {
          int idFabrica = Integer.valueOf(this.vistaPrincipal.getjTextField1idFabrica_venta().getText());
        
        this.servicioVenta.obtenerVentasSegunFabrica(idFabrica);
    }

    public void generarComprobante() {
       this.servicioComprobante.generarComprobantee();
    }

 

}
