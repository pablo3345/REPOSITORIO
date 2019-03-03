/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import java.util.Calendar;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Compra;
import modelo.Producto;
import modelo.Proveedor;
import servicio.ServicioCompra;
import servicio.ServicioCompraProducto;
import servicio.ServicioProducto;
import servicio.ServicioProveedor;
import vista.VistaPrincipal;

/**
 *
 * @author pablo
 */
public class Presentador {

    private VistaPrincipal vistaPrincipal;
    private ServicioProveedor servicioProveedor;
    private ServicioCompra servicioCompra;
    private ServicioProducto servicioProducto;
    private ServicioCompraProducto servicioCompraProducto;

    public Presentador(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        this.servicioProveedor = new ServicioProveedor();
        this.servicioCompra = new ServicioCompra();
        this.servicioProducto = new ServicioProducto();
        this.servicioCompraProducto = new ServicioCompraProducto();
        this.rellenarComboBoxCompra_compraProducto();
        this.rellenarComboBoxProductos__Productocompra();
        this.rellenarComboBoxProveedor_compra();
    }

    public void guardarProveedorApretado() {
        String nombreApellido = this.vistaPrincipal.getjTextFieldNombre_apellido_provee().getText();
        String localidad = this.vistaPrincipal.getjTextFieldLocalidad_provee().getText();
        String rubro = this.vistaPrincipal.getjTextFieldRubro_provee().getText();

        try {
            this.servicioProveedor.guardarProveedor(nombreApellido, localidad, rubro);
            this.vistaPrincipal.getjTextFieldNombre_apellido_provee().setText("");
            this.vistaPrincipal.getjTextFieldLocalidad_provee().setText("");
            this.vistaPrincipal.getjTextFieldRubro_provee().setText("");

            JOptionPane.showMessageDialog(null, "el proveedor se guardo correctamente");

            this.rellenarComboBoxProveedor_compra();

        } catch (IllegalArgumentException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage());

        }
    }

    private void rellenarComboBoxProveedor_compra() {
        //Obtener todos los albunes de la base de datos
        List<Proveedor> comprass = this.servicioProveedor.obtenerTodosProveedor();

        //Crear el modelo con todos los albunes.
        DefaultComboBoxModel<Object> modeloComboBox = new DefaultComboBoxModel<>(comprass.toArray());

        //Setearle el modelo
        this.vistaPrincipal.getjComboBoxProveedor_compra().setModel(modeloComboBox);

    }

    public void guardarCompraApretado() {
        Proveedor proveedor = (Proveedor) this.vistaPrincipal.getjComboBoxProveedor_compra().getSelectedItem();
        String montoTotal = this.vistaPrincipal.getjTextFieldMonto_Total_compra().getText();
        Calendar cal = Calendar.getInstance();

        java.sql.Timestamp fecha = new java.sql.Timestamp(cal.getTimeInMillis());
        
        try {
            this.servicioCompra.guardarCompra(proveedor, montoTotal, fecha);
            
           this.vistaPrincipal.getjTextFieldMonto_Total_compra().setText("");
           
           this.rellenarComboBoxCompra_compraProducto();
           
           JOptionPane.showMessageDialog(null, "la compra se guardo correctamente");
        } catch (IllegalArgumentException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage());
        }
    }

    public void guardarProductoApretado() {
        String nombre = this.vistaPrincipal. getjTextFieldNombre_producto().getText();
        String costo = this.vistaPrincipal.getjTextFieldCosto_producto().getText();
        String ganancia = this.vistaPrincipal.getjTextFieldGanancia_producto().getText();
        String stockMinimo = this.vistaPrincipal.getjTextFieldStockMinimo_producto().getText();
        String stockActual = this.vistaPrincipal. getjTextFieldStockActual_producto().getText();
        String tipo = this.vistaPrincipal. getjTextFieldTipo_producto().getText();
        
        try {
            this.servicioProducto.guardarProducto(nombre, costo, ganancia, stockMinimo, stockActual, tipo);
            
        this.vistaPrincipal. getjTextFieldNombre_producto().setText("");
        this.vistaPrincipal.getjTextFieldCosto_producto().setText("");
        this.vistaPrincipal.getjTextFieldGanancia_producto().setText("");
        this.vistaPrincipal.getjTextFieldStockMinimo_producto().setText("");
        this.vistaPrincipal. getjTextFieldStockActual_producto().setText("");
        this.vistaPrincipal. getjTextFieldTipo_producto().setText("");
        
        this.rellenarComboBoxProductos__Productocompra();
        
        JOptionPane.showMessageDialog(null, "el producto se guardo correctamente");
            
            
        } catch (IllegalArgumentException e) {
            JOptionPane.showInternalMessageDialog(null, e.getMessage());
        }
       
    }
    
      private void rellenarComboBoxCompra_compraProducto() {
        //Obtener todos los albunes de la base de datos
        List<Compra> comprass = this.servicioCompra.obtenerCompra();

        //Crear el modelo con todos los albunes.
        DefaultComboBoxModel<Object> modeloComboBox = new DefaultComboBoxModel<>(comprass.toArray());

        //Setearle el modelo
        this.vistaPrincipal.getjComboBoxCompra_compraProducto().setModel(modeloComboBox);
      
    }
      
      
        private void rellenarComboBoxProductos__Productocompra() {
        //Obtener todos los albunes de la base de datos
        List<Producto> productosss = this.servicioProducto.obtenerProductos();

        //Crear el modelo con todos los albunes.
        DefaultComboBoxModel<Object> modeloComboBox = new DefaultComboBoxModel<>(productosss.toArray());

        //Setearle el modelo
        this.vistaPrincipal. getjComboBoxProducto_compraProducto().setModel(modeloComboBox);
      

    }

    public void guardarCompraProducto_apretado() {
        Compra compras = (Compra) this.vistaPrincipal. getjComboBoxCompra_compraProducto().getSelectedItem();
        Producto productos = (Producto) this.vistaPrincipal.getjComboBoxProducto_compraProducto().getSelectedItem();
        String cantidad = this.vistaPrincipal.getjTextFieldCantidad_compra_producto().getText();
        String precioUnitarioo = this.vistaPrincipal.getjTextFieldPrecioUnitario_compra_producto().getText();
        
        try {
            this.servicioCompraProducto.guardarCompraProducto(compras, productos, cantidad, precioUnitarioo);
            
            this.vistaPrincipal.getjTextFieldCantidad_compra_producto().setText("");
            this.vistaPrincipal.getjTextFieldPrecioUnitario_compra_producto().setText("");
            
             JOptionPane.showMessageDialog(null, "el detalle compra producto se guardo exitosamente!");
           
        } catch (IllegalArgumentException exception) {
             JOptionPane.showMessageDialog(null, exception.getMessage());
            
        }
      
        
    }

    

}
