/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
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
    }

    public Presentador(PedidoVistas pedidoVistas) {
        this.pedidoVistas = pedidoVistas;
        this.servicioPedido = new ServicioPedido();
        this.servicioPlato = new ServicioPlato();//lo agregue recien
        this.servicioCliente = new ServicioCliente();
        this.servicioMesa = new ServicioMesa();
        this.llenarComboTipoPedido();
        this.llenarComboClientePedido();
        this.llenarComboMesaPedido();

    }

    public Presentador(FacturaVistas facturaVistas) {
        this.facturaVistas = facturaVistas;
        this.servicioFactura = new ServicioFactura();
        this.servicioPedido = new ServicioPedido();
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

        try {

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
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "debe completar las comidas, bebidas y postres");
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

    private void llenarComboMesaPedido() {

        ArrayList mesas = this.servicioMesa.obtenerTodosMesa();

        DefaultComboBoxModel modeloMesa = new DefaultComboBoxModel(mesas.toArray());

        this.pedidoVistas.getjComboBox1mesa_pedido().setModel(modeloMesa);

    }

    public void mostrarTablaMesas() {

        ArrayList<Mesa> mesa = this.servicioMesa.obtenerTodosMesa();

        DefaultTableModel modeloTabla = (DefaultTableModel) this.mesaVistas.getjTable1tablaMesa_mesa().getModel();

        modeloTabla.setRowCount(0);
        for (Mesa mesitas : mesa) {

            Object[] agregarMesas = {mesitas.getIdmesa(), mesitas.getNumero(), mesitas.getEstado()};

            modeloTabla.addRow(agregarMesas);

        }
    }

  

    public void mostrarTablaPropietario_apretado() {
        ArrayList<Pedido> arrayPedidos = this.servicioPedido.obtenerTodosPedidos();

        DefaultTableModel modeloTabla2 = (DefaultTableModel) this.propietarioVistas.getjTable1pedido_propietario().getModel();
        modeloTabla2.setRowCount(0);
        for (Pedido pedido : arrayPedidos) {

            Object[] agregarPedido = {pedido.getIdpedido(), pedido.getCliente().getIdcliente(), pedido.getMesa().getIdmesa(), pedido.getPlatosybebidas().getIdplato(),
                pedido.getHoraDelPedido(), pedido.getCantidad()};

            modeloTabla2.addRow(agregarPedido);

        }

    }


    public void cargarTablaConsultaHQLPedido() {
        ArrayList<Double> listPedido = this.servicioPedido.calcularTotalPrecioAlPublico();
        ArrayList total = new ArrayList();
        for(Double del : listPedido){
            
           
          
        
        
        
        }
        
         JOptionPane.showMessageDialog(null, total);
        
       
        
        


    }

    public void calcularCostoApretadoPropietario() {
       ArrayList<Double> del = this.servicioPedido.calcularTotalPrecioAlPublico();
       
       double total= del.get(del.size()-1);
       
       
       JOptionPane.showMessageDialog(null, total + " pesos " );
    }

    public void totalPrecioDeCostoApretado() {
        ArrayList<Double> precioAlCosto = this.servicioPedido.calcularTotalPrecioDeCosto();
        
         double total2= precioAlCosto.get(precioAlCosto.size()-1);
        
        
        JOptionPane.showMessageDialog(null, total2 + " pesos");
    }

    public void gananciaTotalApretado() {
        
         ArrayList<Double> del = this.servicioPedido.calcularTotalPrecioAlPublico();
       
       double totalAlPublico= del.get(del.size()-1);
       
       /////////////////////////////////////////////////
       
          ArrayList<Double> precioAlCosto = this.servicioPedido.calcularTotalPrecioDeCosto();
        
         double precioDeCosto= precioAlCosto.get(precioAlCosto.size()-1);
         
         double totalGanancias = totalAlPublico-precioDeCosto;
         
         JOptionPane.showMessageDialog(null, totalGanancias + " es la ganancias en limpio hasta el dia de la fecha");
       
    }

    public void modificarClienteApretado() {
      
        
        int fila =  this.clientesVistas. getjTable1Clientes_modificar().getSelectedRow();
        
        
        if(fila != -1){
            
            this.clientesVistas.getjTextField1id_cliente_paraActualizar().setText(this.clientesVistas. getjTable1Clientes_modificar().getValueAt(fila, 0).toString());
            this.clientesVistas.getjTextField2nombreCliente().setText(this.clientesVistas.getjTable1Clientes_modificar().getValueAt(fila, 1).toString());
            this.clientesVistas.getjTextField1apellidoCliente().setText(this.clientesVistas. getjTable1Clientes_modificar().getValueAt(fila, 2).toString());
            this.clientesVistas. getjTextField3direccionCliente().setText(this.clientesVistas. getjTable1Clientes_modificar().getValueAt(fila, 3).toString());
            this.clientesVistas.getjTextField1localidad_cliente().setText(this.clientesVistas.getjTable1Clientes_modificar().getValueAt(fila, 4).toString());
             ////////////////////////////////////////////////////////////////////////////////////
            this.clientesVistas.getjTextField1id_cliente_paraActualizar().setEditable(false);
        }
        else{
        
        JOptionPane.showMessageDialog(null, "ocurrio un error");
        
        }
    }

   

    public void cargarTablaClienteApretado() {
        
        
        ArrayList<Cliente> cliente = this.servicioCliente.obtenerTodosCliente();
        DefaultTableModel modeloTabla = (DefaultTableModel) this.clientesVistas.getjTable1Clientes_modificar().getModel();
        
        modeloTabla.setRowCount(0);
        
        for(Cliente clien : cliente){
        
        Object[] agregarALaTabla = {clien.getIdcliente(), clien.getNombre(), clien.getApellido(), clien.getDireccion(), clien.getLocalidad()};
        modeloTabla.addRow(agregarALaTabla);
        
        
        
        }
    }

    public void cargarTablaFacturaApretado() {
        
        
        ArrayList<Object> arrayPedidoss = this.servicioPedido.arrayConsultaHQL();
           
        DefaultTableModel modeloTabla2 = (DefaultTableModel) this.facturaVistas.getjTable1pedido_factura().getModel();
        modeloTabla2.setRowCount(0);
     
        
        
         
         for(Object array : arrayPedidoss ){
             
             modeloTabla2.addRow((Object[]) array);
         
       
         
         
         
         }
         
         
         
         
    }
         
      
        

    public void cargarFacturaApretado() {
       int fila = this.facturaVistas.getjTable1pedido_factura().getSelectedRow();
       
       
       if(fila != -1){
       
       this.facturaVistas. getjTextField3cliente_factura().setText(this.facturaVistas.getjTable1pedido_factura().getValueAt(fila, 1).toString());

       
       
       }


    }

}
