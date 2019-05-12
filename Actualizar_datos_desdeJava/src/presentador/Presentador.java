/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import com.sun.jndi.cosnaming.CNCtx;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Bicicleta;
import modelo.Compra;
import modelo.Detallecompra;
import servicio.ServicioBicicleta;
import servicio.ServicioCompra;
import servicio.ServicioDetalleCompra;
import vistaPrincipal.VistaPrincipal;

/**
 *
 * @author pablo
 */
public class Presentador {

    private VistaPrincipal vistaPrincipal;
    private ServicioCompra servicioCompra;
    private ServicioBicicleta servicioBicicleta;
    private ServicioDetalleCompra servicioDetalleCompra;

    public Presentador(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        this.servicioCompra = new ServicioCompra();
        this.servicioBicicleta = new ServicioBicicleta();
        this.servicioDetalleCompra = new ServicioDetalleCompra();
        this.rellenarComboBicicleta();
        this.rellenarComboCompra();
        this.rellenarTable();
    }

    public void guardarCompraApretado() {
        String montoTotal = this.vistaPrincipal.getjTextField1MontoTotal().getText();

        Calendar cal = Calendar.getInstance();
        java.sql.Timestamp fechaTimestamp = new Timestamp(cal.getTimeInMillis());

        String proveedor = this.vistaPrincipal.getjTextField2Proveedor().getText();

        try {
            this.servicioCompra.guardarCompra(montoTotal, fechaTimestamp, proveedor);

            JOptionPane.showMessageDialog(null, "la compra se guardo correctamente");

            this.vistaPrincipal.getjTextField1MontoTotal().setText("");
            this.vistaPrincipal.getjTextField2Proveedor().setText("");

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void guardarBicicletaApretado() {
        String tipo = this.vistaPrincipal.getjTextField1Tipo().getText();
        String costo = this.vistaPrincipal.getjTextField2Costo().getText();
        String ganancia = this.vistaPrincipal.getjTextField3Ganancia().getText();
        String stockActual = this.vistaPrincipal.getjTextField4StockActual().getText();

        try {
            this.servicioBicicleta.guardarBicicleta(tipo, costo, ganancia, stockActual);

            JOptionPane.showMessageDialog(null, "la bicicleta se guardo correctamente");
            this.rellenarTable();

            this.vistaPrincipal.getjTextField1Tipo().setText("");
            this.vistaPrincipal.getjTextField2Costo().setText("");
            this.vistaPrincipal.getjTextField3Ganancia().setText("");
            this.vistaPrincipal.getjTextField4StockActual().setText("");

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void guardarDetalleCompra_apretado() {
        Bicicleta bicicleta = (Bicicleta) this.vistaPrincipal.getjComboBox2Bicicleta().getSelectedItem();
        Compra compra = (Compra) this.vistaPrincipal.getjComboBox1Compra().getSelectedItem();
        String cantidad = this.vistaPrincipal.getjTextFieldCantidad_DC().getText();
        String precioUnitario = this.vistaPrincipal.getjTextField2PrecioUnitario_DC().getText();

        try {
            this.servicioDetalleCompra.guardarDetalleCompra(bicicleta, compra, cantidad, precioUnitario);

            JOptionPane.showMessageDialog(null, "el detalle de compra se guardo exitosamente");

            this.vistaPrincipal.getjTextFieldCantidad_DC().setText("");
            this.vistaPrincipal.getjTextField2PrecioUnitario_DC().setText("");

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void rellenarComboBicicleta() {
        ArrayList<Bicicleta> bicis = this.servicioBicicleta.obtenerTodos();

        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel(bicis.toArray());

        this.vistaPrincipal.getjComboBox2Bicicleta().setModel(modeloCombo);

    }

    public void rellenarComboCompra() {
        ArrayList<Compra> comprass = this.servicioCompra.obtenerTodosCompra();

        DefaultComboBoxModel modeloCompra = new DefaultComboBoxModel(comprass.toArray());

        this.vistaPrincipal.getjComboBox1Compra().setModel(modeloCompra);

    }

    public void rellenarTable() {
        ArrayList<Bicicleta> bicis = this.servicioBicicleta.obtenerTodos();

        //obtenemos el modelo de la tabla
        DefaultTableModel modeloTabla = (DefaultTableModel) this.vistaPrincipal.getjTable1Tabla_Bicicleta().getModel();

        //limpiar los movimientos mostrados anteriormente
        for (int fila = 0; fila < modeloTabla.getRowCount(); fila++) {
            modeloTabla.setRowCount(0);

        }
        //agregar cada transferencia a la tabla
        //para la tabla que hicimos,  por cada fila voy a tener que agregar un array de la clase padre objet[] para llenar cada columna de la tabla.
        for (Bicicleta bici : bicis) {
            Object[] datosBicicleta = {bici.getIdbicicleta(), bici.getTipo(), bici.getCosto(), bici.getGanancia(), bici.getStockActual()};
            modeloTabla.addRow(datosBicicleta);

        }
        
       

    }

//    public void modificarApretado() {
//
//        DefaultTableModel modeloTabla = (DefaultTableModel) this.vistaPrincipal.getjTable1Tabla_Bicicleta().getModel();
//        //seleccionamos la fila de la tabla
//        int fila = this.vistaPrincipal.getjTable1Tabla_Bicicleta().getSelectedRow();
//        if (fila >= 0) {
//            //ahora pasamos los datos de la tabla al texfield
//            this.vistaPrincipal.getjTextField_id_bicicleta().setText(modeloTabla.getValueAt(fila, 0).toString());
//         
//            this.vistaPrincipal.getjTextField1Tipo().setText(modeloTabla.getValueAt(fila, 1).toString());
//            this.vistaPrincipal.getjTextField2Costo().setText(modeloTabla.getValueAt(fila, 2).toString());
//            this.vistaPrincipal.getjTextField3Ganancia().setText(modeloTabla.getValueAt(fila, 3).toString());
//            this.vistaPrincipal.getjTextField4StockActual().setText(modeloTabla.getValueAt(fila, 4).toString());
//            
//       
//
//        } else {
//            JOptionPane.showMessageDialog(null, "fila no seleccionada");
//
//        }
//        
//      
//    }

 
    
    
    
  



  

  
    
  

   

}
