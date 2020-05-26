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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;
import javafx.scene.control.ComboBox;
import javax.swing.Action;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Factura;
import modelo.Mesa;
import modelo.Pedido;
import modelo.Platosybebidas;

import servicios.ServicioCliente;
import servicios.ServicioFactura;
import servicios.ServicioMesa;
import servicios.ServicioPedido;
import servicios.ServicioPlato;
import servicios.ServicioPropietario;
import vistas.ClientesVistas;
import vistas.FacturaVistas;
import vistas.MesaVistas;
import vistas.PedidoVistas;
import vistas.PlatoVistas;
import vistas.PropietarioVistas;
import vistas.vistaPrincipal;

/**
 *
 * @author pablo
 */
public class Presentador {

    private ClientesVistas clientesVistas;
    private PlatoVistas platoVistas;
    private MesaVistas mesaVistas;
    private PedidoVistas pedidoVistas;
    private FacturaVistas facturaVistas;
    private PropietarioVistas propietarioVistas;
    private vistaPrincipal vistaPrincipal;
    ////////////////////////////////////////////////////////
    private ServicioCliente servicioCliente;
    private ServicioPlato servicioPlato;
    private ServicioPedido servicioPedido;
    private ServicioMesa servicioMesa;
    private ServicioFactura servicioFactura;
    private ServicioPropietario servicioPropietario;
   // private  JComboBox jComboBox1mesasOcupadasFactura;

    public Presentador(vistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;

    }

    public Presentador(ClientesVistas clientesVistas) {
        this.clientesVistas = clientesVistas;
        this.servicioCliente = new ServicioCliente();
    }

    public Presentador(PlatoVistas platoVistas) {
        
        this.platoVistas = platoVistas;
        this.servicioPlato = new ServicioPlato();
        llenarComboTipo();

    }

    public Presentador(MesaVistas mesaVistas) {
        this.mesaVistas = mesaVistas;
        this.servicioMesa = new ServicioMesa();
        this.servicioFactura = new ServicioFactura();
        this.servicioPedido = new ServicioPedido();
        
        
       
       
                

    }

    public Presentador(PedidoVistas pedidoVistas) {
      
        this.pedidoVistas = pedidoVistas;
      
        this.servicioPedido = new ServicioPedido();
        
        this.servicioPlato = new ServicioPlato();//lo agregue recien
        this.servicioCliente = new ServicioCliente();
        this.servicioMesa = new ServicioMesa();
        this.servicioFactura = new ServicioFactura();
        this.llenarComboTipoPedido();
        this.llenarComboClientePedido();
       
     

    }

    public Presentador(FacturaVistas facturaVistas) {
        this.facturaVistas = facturaVistas;
        this.servicioFactura = new ServicioFactura();
        this.servicioPedido = new ServicioPedido();
        this.servicioMesa = new ServicioMesa();
        this.ComboMesasOcupadas_Factura();
       
       
       
       

    }

    public Presentador(PropietarioVistas propietarioVistas) {
        this.propietarioVistas = propietarioVistas;
        this.servicioPropietario = new ServicioPropietario();
        this.servicioPedido = new ServicioPedido();

    }

  

   

    public void guardarClienteApretado() {
        String nombre = this.clientesVistas.getjTextField2nombreCliente().getText();
        String apellido = this.clientesVistas.getjTextField1apellidoCliente().getText();
        String direccion = this.clientesVistas.getjTextField3direccionCliente().getText();
        String localidad = this.clientesVistas.getjTextField1localidad_cliente().getText();

        try {
            this.servicioCliente.guardarCliente(nombre, apellido, direccion, localidad);

            JOptionPane.showMessageDialog(null, "El cliente se guardo correctamente");

            this.clientesVistas.getjTextField2nombreCliente().setText("");
            this.clientesVistas.getjTextField1apellidoCliente().setText("");
            this.clientesVistas.getjTextField3direccionCliente().setText("");
            this.clientesVistas.getjTextField1localidad_cliente().setText("");
            this.clientesVistas.getjTextField1localidad_cliente().setText("");

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void guardarComidasYbebidasApretado() {

        try {

            try {
                String nombre = this.platoVistas.getjTextField2nombre_plato().getText();
                String costoDelPlato = this.platoVistas.getjTextField3costoDelPlato_plato().getText();
                String precioAlPublico = this.platoVistas.getjTextField1precioAlPublico_plato().getText();
                String ingredientes = this.platoVistas.getjTextArea1ingredientes_plato().getText();
                this.platoVistas.getjRadioButton1calientes_plato().setActionCommand("caliente");
                this.platoVistas.getjRadioButton2fria_plato().setActionCommand("fria");
                this.platoVistas.getjRadioButton3ensaladas_plato().setActionCommand("ensaladas");
                this.platoVistas.getjRadioButton4postres_plato().setActionCommand("postres");
                this.platoVistas.getjRadioButton5bebidas_plato().setActionCommand("bebidas");
                String tipo = this.platoVistas.getButtonGroup1().getSelection().getActionCommand();

                this.servicioPlato.guardarComidasYbebidas(nombre, costoDelPlato, precioAlPublico, tipo, ingredientes);

                this.platoVistas.getjTextField2nombre_plato().setText("");
                this.platoVistas.getjTextField3costoDelPlato_plato().setText("");
                this.platoVistas.getjTextField1precioAlPublico_plato().setText("");
                this.platoVistas.getjTextArea1ingredientes_plato().setText("");

                JOptionPane.showMessageDialog(null, "Los platos o bebidas se guardaron correctamente");

            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "debe completar el tipo");

        }

    }

    public void guardarMesaApretado() {

        try {
            String numero = this.mesaVistas.getjTextField1numeroMesa().getText();

            this.mesaVistas.getjRadioButton1disponible().setActionCommand("disponible");
            this.mesaVistas.getjRadioButton2ocupado().setActionCommand("ocupada");
            String estado = this.mesaVistas.getButtonGroup1().getSelection().getActionCommand();

            try {
                this.servicioMesa.guardarMesa(numero, estado);
                //this.llenarComboMesasOcupadas_Factura();

                this.mesaVistas.getjTextField1numeroMesa().setText("");
                JOptionPane.showMessageDialog(null, "La mesa se guardo correctamente");

            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "debe ingresar un estado");
        }

    }

    public void guardarPedidoApretado() {
       
        Cliente cliente = (Cliente) this.pedidoVistas.getjComboBox1cliente_pedido().getSelectedItem();
        Mesa mesa = (Mesa) this.pedidoVistas.getjComboBox1mesa_pedido().getSelectedItem();
        Platosybebidas platosybebidas = (Platosybebidas) this.pedidoVistas.getjComboBox1comidasTbebidas_pedido().getSelectedItem();

        Calendar calendar = Calendar.getInstance();
        java.sql.Timestamp horaDelPedido = new java.sql.Timestamp(calendar.getTimeInMillis());

        String cantidad = this.pedidoVistas.getjTextField1cantidad_pedido().getText();
        String demora = this.pedidoVistas.getjTextField1demora_pedido().getText();

        try {
            this.servicioPedido.guardarPedido(cliente, mesa, platosybebidas, horaDelPedido, cantidad, demora);
          

            this.pedidoVistas.getjTextField1cantidad_pedido().setText("");
            this.pedidoVistas.getjTextField1demora_pedido().setText("");

            JOptionPane.showMessageDialog(null, "el pedido se guardo correctamente");
           // this.llenarComboMesaPedido();
            //llenarComboMesasOcupadas_Factura();
//            JComboBox modeloCombo = new JComboBox();
//            this.ComboMesasOcupadas_Factura();
              

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void llenarComboTipo() {

        ArrayList llenarCombo = new ArrayList();
        llenarCombo.add("fria");
        llenarCombo.add("caliente");
        llenarCombo.add("ensaladas");
        llenarCombo.add("postres");
        llenarCombo.add("bebidas");

        DefaultComboBoxModel modelo = new DefaultComboBoxModel(llenarCombo.toArray());

        this.platoVistas.getjComboBox1tipo_plato().setModel(modelo);

    }

    public void buscarPorTipoApretado() {
        DefaultTableModel tabla = (DefaultTableModel) this.platoVistas.getjTable1comidasYbebidas_plato().getModel();
        String tipo = (String) this.platoVistas.getjComboBox1tipo_plato().getSelectedItem();

        ArrayList<Platosybebidas> platos = this.servicioPlato.obtenerSegunTipo(tipo);

        tabla.setRowCount(0);

        for (Platosybebidas arraPlatosybebidas : platos) {

            Object[] agregarArray = {arraPlatosybebidas.getIdplato(), arraPlatosybebidas.getNombre(), arraPlatosybebidas.getCosto(), arraPlatosybebidas.getPrecioAlPublico(),
                arraPlatosybebidas.getTipo(), arraPlatosybebidas.getIngredientes()};
            tabla.addRow(agregarArray);

        }

    }

    public void llenarComboTipoPedido() {

        ArrayList tipoArrayList = new ArrayList();

        ArrayList arrayTipo = new ArrayList();
        arrayTipo.add("fria");
        arrayTipo.add("caliente");
        arrayTipo.add("ensaladas");
        arrayTipo.add("postres");
        arrayTipo.add("bebidas");

        DefaultComboBoxModel modelo2 = new DefaultComboBoxModel(arrayTipo.toArray());

        this.pedidoVistas.getjComboBox1tipo_pedido().setModel(modelo2);

    }

    public void buscarPorTipoPedidoApretado() {

        String tipo = (String) this.pedidoVistas.getjComboBox1tipo_pedido().getSelectedItem();

        ArrayList<Platosybebidas> array3 = this.servicioPlato.obtenerSegunTipo(tipo);

        DefaultComboBoxModel comboplatos = new DefaultComboBoxModel(array3.toArray());
        this.pedidoVistas.getjComboBox1comidasTbebidas_pedido().setModel(comboplatos);

    }

    private void llenarComboClientePedido() {

        ArrayList cliente = this.servicioCliente.obtenerTodosCliente();

        DefaultComboBoxModel modeloCliente = new DefaultComboBoxModel(cliente.toArray());

        this.pedidoVistas.getjComboBox1cliente_pedido().setModel(modeloCliente);

    }



    public void mostrarTablaPropietario_apretado() {
        ArrayList<Object> arrayPedidos = this.servicioPropietario.obtenerConsultaHQL();

        DefaultTableModel modeloTabla2 = (DefaultTableModel) this.propietarioVistas.getjTable1pedido_propietario().getModel();
        modeloTabla2.setRowCount(0);

        for (Object object : arrayPedidos) {
            modeloTabla2.addRow((Object[]) object);

        }

    }

    public void cargarTablaConsultaHQLPedido() {
        ArrayList<Double> listPedido = this.servicioPedido.calcularTotalPrecioAlPublico();
        ArrayList total = new ArrayList();
        for (Double del : listPedido) {

        }

        JOptionPane.showMessageDialog(null, total);

    }

    public void calcularCostoApretadoPropietario() {
        ArrayList<Double> del = this.servicioPedido.calcularTotalPrecioAlPublico();

        double total = del.get(del.size() - 1);

        JOptionPane.showMessageDialog(null, total + " pesos ");
    }

    public void totalPrecioDeCostoApretado() {
        ArrayList<Double> precioAlCosto = this.servicioPedido.calcularTotalPrecioDeCosto();

        double total2 = precioAlCosto.get(precioAlCosto.size() - 1);

        JOptionPane.showMessageDialog(null, total2 + " pesos");
    }

    public void gananciaTotalApretado() {

        ArrayList<Double> del = this.servicioPedido.calcularTotalPrecioAlPublico();

        double totalAlPublico = del.get(del.size() - 1);

        /////////////////////////////////////////////////
        ArrayList<Double> precioAlCosto = this.servicioPedido.calcularTotalPrecioDeCosto();

        double precioDeCosto = precioAlCosto.get(precioAlCosto.size() - 1);

        double totalGanancias = totalAlPublico - precioDeCosto;

        JOptionPane.showMessageDialog(null, totalGanancias + " es la ganancias en limpio hasta el dia de la fecha");

    }

    public void modificarClienteApretado() {

        int fila = this.clientesVistas.getjTable1Clientes_modificar().getSelectedRow();

        if (fila != -1) {

            this.clientesVistas.getjTextField1id_cliente_paraActualizar().setText(this.clientesVistas.getjTable1Clientes_modificar().getValueAt(fila, 0).toString());
            this.clientesVistas.getjTextField2nombreCliente().setText(this.clientesVistas.getjTable1Clientes_modificar().getValueAt(fila, 1).toString());
            this.clientesVistas.getjTextField1apellidoCliente().setText(this.clientesVistas.getjTable1Clientes_modificar().getValueAt(fila, 2).toString());
            this.clientesVistas.getjTextField3direccionCliente().setText(this.clientesVistas.getjTable1Clientes_modificar().getValueAt(fila, 3).toString());
            this.clientesVistas.getjTextField1localidad_cliente().setText(this.clientesVistas.getjTable1Clientes_modificar().getValueAt(fila, 4).toString());
            ////////////////////////////////////////////////////////////////////////////////////
            this.clientesVistas.getjTextField1id_cliente_paraActualizar().setEditable(false);
        } else {

            JOptionPane.showMessageDialog(null, "ocurrio un error");

        }
    }

    public void cargarTablaClienteApretado() {

        ArrayList<Cliente> cliente = this.servicioCliente.obtenerTodosCliente();
        DefaultTableModel modeloTabla = (DefaultTableModel) this.clientesVistas.getjTable1Clientes_modificar().getModel();

        modeloTabla.setRowCount(0);

        for (Cliente clien : cliente) {

            Object[] agregarALaTabla = {clien.getIdcliente(), clien.getNombre(), clien.getApellido(), clien.getDireccion(), clien.getLocalidad()};
            modeloTabla.addRow(agregarALaTabla);

        }
    }
    
  

  

    public void agregarPedidosDeMesaOcupadas() {
        
        
        
        
    
        //////////////////////////////////////////////////////////////////////////////////////////////
        Mesa mesa = (Mesa) this.facturaVistas. getjComboBox1comboMesasOcupadas().getSelectedItem();

        int idMesa = mesa.getIdmesa();
        
         // ArrayList<Object> arrays = this.servicioFactura.mandarMesaOcupadaAfactura(idMesa);

        ArrayList<Object> arrays = this.servicioFactura.mandarMesaOcupadaAfactura(idMesa);

        DefaultTableModel modeloTabla3 = (DefaultTableModel) this.facturaVistas.getjTable1pedido_factura().getModel();
        modeloTabla3.setRowCount(0);

        for (Object array : arrays) {

            modeloTabla3.addRow((Object[]) array);

        }
    }

    public void guardarFacturaApretado() {

        try {
            int fila = this.facturaVistas.getjTable1pedido_factura().getSelectedRow();

            String cliente = (String) this.facturaVistas.getjTable1pedido_factura().getValueAt(fila, 1).toString();
            String platosyBebidas = (String) this.facturaVistas.getjTable1pedido_factura().getValueAt(fila, 3).toString();
            String cantidad = (String) this.facturaVistas.getjTable1pedido_factura().getValueAt(fila, 5).toString();
            String precio = (String) this.facturaVistas.getjTable1pedido_factura().getValueAt(fila, 6).toString();
            String mesa = (String) this.facturaVistas.getjTable1pedido_factura().getValueAt(fila, 2).toString();
            //String total =  (String) this.facturaVistas.getjTable1pedido_factura().getValueAt(fila, 6);
            String total = this.facturaVistas.getjTextField2total_factura().getText();

            try {
                this.servicioFactura.guardarFacturaDedeLaTabla(cliente, platosyBebidas, cantidad, precio, mesa, total);
                JOptionPane.showMessageDialog(null, "el pedido se guardo correctamente en la factura");

                //////////////////////////////////////////////////////////////////////////
                this.facturaVistas.getjTextField1costoAgregado().setText(precio);
                /////////////////////////////////////////////////////////////////////////////
                
              
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "debe seleccionar un pedido");
        }
  
        // this.llenarComboMesaPedido();
    }

    public void verFacturaApretado() {
        //poner las mesas disponibles cuando ejecuto la factura

        try {
            ArrayList<Double> botonTotal = this.servicioFactura.obtenerTotalFactura();

            // ArrayList<Double> menor = new ArrayList<>();
            String ultimoParaGuardae = "";
            double min = 1000000000;

            for (int i = 0; i < botonTotal.size(); i++) {
                if (botonTotal.get(i) < min) {
                    min = botonTotal.get(i);

                    ultimoParaGuardae = String.valueOf(min);

                }

            }
            try {
                this.servicioFactura.verComprobanteReporter(ultimoParaGuardae);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            this.facturaVistas.getjTextField2total_factura().setEditable(false);

            ///////////////////////////////////////////////////////////////////////////
            int idMesa = 0;


            int fila = this.facturaVistas.getjTable1pedido_factura().getSelectedRow();
            String idMesaa = (String) this.facturaVistas.getjTable1pedido_factura().getValueAt(fila, 2);

            idMesa = Integer.valueOf(idMesaa);
            this.servicioFactura.actualizarMesasDespuesDeLaFactura(idMesa);
            
            
            this.ComboMesasOcupadas_Factura();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "debe guardar algun pedido");
        }

    }

    public void limpiarFacturaApretado() {
        this.servicioFactura.limpiarFactura();
    }

    public void cargarTablaPedido_Pedido() {

        ArrayList<Pedido> arrayPedidos = this.servicioPedido.obtenerTodosPedidos();

        DefaultTableModel modeloTabla2 = (DefaultTableModel) this.pedidoVistas.getjTable1Pedido_pedido().getModel();
        
     
                

        modeloTabla2.setRowCount(0);
        for (Pedido pedido : arrayPedidos) {

            Object[] agregarPedido = {pedido.getIdpedido(), pedido.getCliente().getIdcliente(), pedido.getMesa().getIdmesa(), pedido.getPlatosybebidas().getIdplato(),
                pedido.getCantidad(), pedido.getDemora(), pedido.getHoraDelPedido()};

            modeloTabla2.addRow(agregarPedido);

        }

    }

    public void modificarPedido_pedido() {

        try {
            int fila = this.pedidoVistas.getjTable1Pedido_pedido().getSelectedRow();

            int index1 = (int) this.pedidoVistas.getjTable1Pedido_pedido().getValueAt(fila, 1);
            int index2 = (int) this.pedidoVistas.getjTable1Pedido_pedido().getValueAt(fila, 2);
            // int index3 = (int) this.pedidoVistas. getjTable1Pedido_pedido().getValueAt(fila, 3);

            if (fila != -1) {
                this.pedidoVistas.getjComboBox1mesa_pedido().setSelectedIndex(index2 - 1);
                this.pedidoVistas.getjComboBox1cliente_pedido().setSelectedIndex(index1 - 1);
                this.pedidoVistas.getjTextField1cantidad_pedido().setText((String) this.pedidoVistas.getjTable1Pedido_pedido().getValueAt(fila, 4).toString());
                //this.pedidoVistas.getjComboBox1comidasTbebidas_pedido().addItem(index3);
                this.pedidoVistas.getjTextField1demora_pedido().setText(this.pedidoVistas.getjTable1Pedido_pedido().getValueAt(fila, 5).toString());

            }
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "debe elegir un pedido y seleccionar todos los campos");
        }

    }

    public void actualizarPedido_Pedido() {
        try {
            Cliente cliente = (Cliente) this.pedidoVistas.getjComboBox1cliente_pedido().getSelectedItem();
            Mesa mesa = (Mesa) this.pedidoVistas.getjComboBox1mesa_pedido().getSelectedItem();
            Platosybebidas platosybebidas = (Platosybebidas) this.pedidoVistas.getjComboBox1comidasTbebidas_pedido().getSelectedItem();

            Double cantidad = Double.valueOf(this.pedidoVistas.getjTextField1cantidad_pedido().getText());
            // String cantidad = this.pedidoVistas.getjTextField1cantidad_pedido().getText();

            Double demora = Double.valueOf(this.pedidoVistas.getjTextField1demora_pedido().getText());
            // String demora = this.pedidoVistas.getjTextField1demora_pedido().getText();

            ///////////////////////////////////////////////////////////////////////////////////////////
            int fila = this.pedidoVistas.getjTable1Pedido_pedido().getSelectedRow();

            int idPedido = (int) this.pedidoVistas.getjTable1Pedido_pedido().getValueAt(fila, 0);

            this.servicioPedido.actulizarPedido(idPedido, cliente, mesa, platosybebidas, cantidad, demora);

            // this.llenarComboMesasOcupadas_Factura();
           // this.llenarComboMesaPedido();
//            JComboBox modeloCombo = new JComboBox();
             //  this.ComboMesasOcupadas_Factura();
          
             
             FacturaVistas.jMenuItem1.doClick();
            
            this.cargarMesasPedidoApretado();
            
            
           
          
            
             
              
              
             
           
          
           

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "debe seleccionar los comestibles y los demas campos");

        }
        
        
     
         
           
          

      
    }


    public void mesasDisponiblesApretado() {
        ArrayList<Mesa> mesasDisponibles = this.servicioMesa.obtenerMesasDisponibles();
        DefaultTableModel modeloTabla = (DefaultTableModel) this.mesaVistas.getjTable1tablaMesa_mesa().getModel();
        modeloTabla.setRowCount(0);
        for (Mesa mesas : mesasDisponibles) {
            Object[] agregaObjects = {mesas.getIdmesa(), mesas.getNumero(), mesas.getEstado()};

            modeloTabla.addRow(agregaObjects);

        }

    }

    public void mesasOcupadaspretado() {
        ArrayList<Mesa> mesasOcupadas = this.servicioPedido.obtenerMesasOcupadas();
        DefaultTableModel modeloTabla = (DefaultTableModel) this.mesaVistas.getjTable1tablaMesa_mesa().getModel();
        modeloTabla.setRowCount(0);
        for (Mesa mesas : mesasOcupadas) {
            Object[] agregaObjects = {mesas.getIdmesa(), mesas.getNumero(), mesas.getEstado()};

            modeloTabla.addRow(agregaObjects);

        }
    }
    


    public void cargarMesasPedidoApretado() {
          ArrayList<Mesa> mesas = this.servicioMesa.obtenerTodosMesa();

        DefaultComboBoxModel modeloMesa = new DefaultComboBoxModel(mesas.toArray());

        this.pedidoVistas.getjComboBox1mesa_pedido().setModel(modeloMesa);
    }

    public void ComboMesasOcupadas_Factura() {
         ArrayList<Mesa> agragarAcombosMesas = this.servicioPedido.mesasOcupadas_Factura();

        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel(agragarAcombosMesas.toArray());

        this.facturaVistas. getjComboBox1comboMesasOcupadas().setModel(modeloCombo);
        
      
    }
  
    

        
        
    
    
    
    
    
    
    

}
