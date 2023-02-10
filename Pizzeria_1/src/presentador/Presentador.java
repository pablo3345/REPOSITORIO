/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Mesa;
import modelo.Pedido;
import modelo.Plato;
import servicios.ServicioCliente;
import servicios.ServicioFactura;
import servicios.ServicioMesa;
import servicios.ServicioPedido;
import servicios.ServicioPlato;
import vistaPrincipal.ClientesVista;
import vistaPrincipal.FacturaVista;
import vistaPrincipal.MesasVista;
import vistaPrincipal.PedidoVista;
import vistaPrincipal.PlatoVista;
import vistaPrincipal.PropietarioVista;
import vistaPrincipal.VistaPrincipal;

/**
 *
 * @author pablo
 */
public class Presentador {

    private VistaPrincipal vistaPrincipal;
    private PlatoVista platoVista;
    private MesasVista mesasVista;
    private ClientesVista clientesVista;
    private FacturaVista facturaVista;
    private PropietarioVista propietarioVista;
    private PedidoVista pedidoVista;
    private ServicioCliente servicioCliente;
    private ServicioPlato servicioPlato;
    private ServicioMesa servicioMesa;
    private ServicioPedido servicioPedido;
    private ServicioFactura servicioFactura;

    public Presentador(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;

    }

    public Presentador(PlatoVista platoVista) {
        this.platoVista = platoVista;
        this.servicioPlato = new ServicioPlato();

    }

    public Presentador(MesasVista mesasVista) {
        this.mesasVista = mesasVista;
        this.servicioMesa = new ServicioMesa();
    }

    public Presentador(ClientesVista clientesVista) {
        this.clientesVista = clientesVista;
        this.servicioCliente = new ServicioCliente();

    }

    public Presentador(FacturaVista facturaVista) {
        this.facturaVista = facturaVista;
        this.servicioMesa = new ServicioMesa();
        this.llenarComboMesasOcupadasFactura();
        this.servicioFactura = new ServicioFactura();
    }

    public Presentador(PropietarioVista propietarioVista) {
        this.propietarioVista = propietarioVista;
    }

    public Presentador(PedidoVista pedidoVista) {
        this.pedidoVista = pedidoVista;
        this.servicioPedido = new ServicioPedido();
        this.servicioCliente = new ServicioCliente();
        this.servicioPlato = new ServicioPlato();
        this.servicioMesa = new ServicioMesa();
        this.llenarComboCliente_pedido();
        this.llenarComboTipoPedido();
        this.llenarComboMesasPedido();

    }

    public void guardarClienteApretado() {

        String nombre = this.clientesVista.getjTextField1nombre_cliente().getText();
        String apellido = this.clientesVista.getjTextField2apellido_cliente().getText();
        String direccion = this.clientesVista.getjTextField3direccion_cliente().getText();
        String localidad = this.clientesVista.getjTextField1localidad_cliente().getText();

        try {
            this.servicioCliente.guardarCliente(nombre, apellido, direccion, localidad);

            this.clientesVista.getjTextField1nombre_cliente().setText("");
            this.clientesVista.getjTextField2apellido_cliente().setText("");
            this.clientesVista.getjTextField3direccion_cliente().setText("");
            JOptionPane.showMessageDialog(null, "El cliente se guardo correctamente");

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void mostrarTablaApretado() {
        ArrayList<Cliente> todosClientes = this.servicioCliente.obtenerTodosClientes();

        DefaultTableModel modeloTabla = (DefaultTableModel) this.clientesVista.getjTable1tabla_cliente().getModel();

        modeloTabla.setRowCount(0);

        for (Cliente cliente : todosClientes) {

            Object[] agrObjects = {cliente.getIdCliente(), cliente.getNombre(), cliente.getApellido(), cliente.getDireccion(), cliente.getLocalidad()};
            modeloTabla.addRow(agrObjects);

        }

    }

    public void modificarApretado() {
        int fila = this.clientesVista.getjTable1tabla_cliente().getSelectedRow();

        if (fila != -1) {
            this.clientesVista.getjTextField1id_cliente().setText(this.clientesVista.getjTable1tabla_cliente().getValueAt(fila, 0).toString());
            this.clientesVista.getjTextField1nombre_cliente().setText(this.clientesVista.getjTable1tabla_cliente().getValueAt(fila, 1).toString());
            this.clientesVista.getjTextField2apellido_cliente().setText(this.clientesVista.getjTable1tabla_cliente().getValueAt(fila, 2).toString());
            this.clientesVista.getjTextField3direccion_cliente().setText(this.clientesVista.getjTable1tabla_cliente().getValueAt(fila, 3).toString());
            this.clientesVista.getjTextField1localidad_cliente().setText(this.clientesVista.getjTable1tabla_cliente().getValueAt(fila, 4).toString());

        }
    }

    public void actualizarCliente_apretado() {
        int fila = this.clientesVista.getjTable1tabla_cliente().getSelectedRow();

        int idClienteConvertido = Integer.valueOf(this.clientesVista.getjTextField1id_cliente().getText());
        String nombre = this.clientesVista.getjTextField1nombre_cliente().getText();
        String apellido = this.clientesVista.getjTextField2apellido_cliente().getText();
        String direccion = this.clientesVista.getjTextField3direccion_cliente().getText();
        String localidad = this.clientesVista.getjTextField1localidad_cliente().getText();

        try {
            this.servicioCliente.actualizarCliente(idClienteConvertido, nombre, apellido, direccion, localidad);
            JOptionPane.showMessageDialog(null, "El cliente se actualizo correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void guardarPlatoApretado() {

        try {
            String nombre = this.platoVista.getjTextField2nombrePlato().getText();
            String costoDelPlato = platoVista.getjTextField1costoDelPlato().getText();
            String precioAlPublico = platoVista.getjTextField3precioAlPublicoPlato().getText();
            this.platoVista.getjRadioButton1caliente().setActionCommand("caliente");
            this.platoVista.getjRadioButton2fria().setActionCommand("fria");
            this.platoVista.getjRadioButton3bebidas().setActionCommand("bebidas");
            this.platoVista.getjRadioButton4ensaladas().setActionCommand("ensaladas");
            this.platoVista.getjRadioButton5postres().setActionCommand("postres");
            String tipo = this.platoVista.getButtonGroup1().getSelection().getActionCommand();

            try {
                this.servicioPlato.guardarPlato(nombre, costoDelPlato, precioAlPublico, tipo);

                this.platoVista.getjTextField2nombrePlato().setText("");
                this.platoVista.getjTextField1costoDelPlato().setText("");
                this.platoVista.getjTextField3precioAlPublicoPlato().setText("");
                JOptionPane.showMessageDialog(null, "el plato se guardo correctamente");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage()); 

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "debe ingresar un tipo");
        }
    }

    public void guardarMesaApretado() {
        String numero = this.mesasVista.getjTextField1numero_mesa().getText();
        this.mesasVista.getjRadioButton1disponible().setActionCommand("disponible");
        this.mesasVista.getjRadioButton2ocupada().setActionCommand("ocupada");
        String estado = this.mesasVista.getButtonGroup1().getSelection().getActionCommand();

        try {
            this.servicioMesa.guardarMesa(numero, estado);
            this.mesasVista.getjTextField1numero_mesa().setText("");
            JOptionPane.showMessageDialog(null, "la mesa se guardo correctamente");

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void mostrarTablaMesaApretado() {
        DefaultTableModel modeloTablaMesa = (DefaultTableModel) this.mesasVista.getjTable1mesa_mesa().getModel();

        ArrayList<Mesa> arrayMesa = this.servicioMesa.obtenerMesas();

        modeloTablaMesa.setRowCount(0);

        for (Mesa mesas : arrayMesa) {
            Object[] agregarMesas = {mesas.getIdMesa(), mesas.getNumero(), mesas.getEstado()};

            modeloTablaMesa.addRow(agregarMesas);

        }

    }

    private void llenarComboCliente_pedido() {
        ArrayList<Cliente> arrayCliente = this.servicioCliente.obtenerTodosClientes();
        DefaultComboBoxModel modeloCliente = new DefaultComboBoxModel(arrayCliente.toArray());
        this.pedidoVista.getjComboBox2cliente_pedido().setModel(modeloCliente);

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

        this.pedidoVista.getjComboBox1tipo_pedido().setModel(modelo2);

    }

    public void agregarComestiblesApretado() {
        String tipo = (String) this.pedidoVista.getjComboBox1tipo_pedido().getSelectedItem();

        ArrayList<Plato> agregarPlato = this.servicioPlato.obtenerComestibleSegunPedido(tipo);

        DefaultComboBoxModel modeloCombo1 = new DefaultComboBoxModel(agregarPlato.toArray());

        this.pedidoVista.getjComboBox3comestible_pedido().setModel(modeloCombo1);
    }

    public void llenarComboMesasPedido() {

        ArrayList<Mesa> obtenerMesasCombo = this.servicioMesa.obtenerMesas();

        DefaultComboBoxModel modeloMesas = new DefaultComboBoxModel(obtenerMesasCombo.toArray());

        this.pedidoVista.getjComboBox1mesa_pedido().setModel(modeloMesas);

    }

    public void guardarPedidoApretado() {
        Cliente cliente = (Cliente) this.pedidoVista.getjComboBox2cliente_pedido().getSelectedItem();
        Mesa mesa = (Mesa) this.pedidoVista.getjComboBox1mesa_pedido().getSelectedItem();
        Plato plato = (Plato) this.pedidoVista.getjComboBox3comestible_pedido().getSelectedItem();
        String demora = this.pedidoVista.getjTextField2demora_pedido().getText();
        String cantidad = this.pedidoVista.getjTextField3cantidad_pedido().getText();
        this.pedidoVista.getjRadioButton1activo_pedido().setActionCommand("activo");
        String estado = this.pedidoVista.getButtonGroup1().getSelection().getActionCommand();

        try {
            this.servicioPedido.guardarPedido(cliente, mesa, plato, demora, cantidad, estado);

            this.pedidoVista.getjTextField2demora_pedido().setText("");
            this.pedidoVista.getjTextField3cantidad_pedido().setText("");
            
            FacturaVista.jMenuItem1.doClick();
            this.llenarComboMesasPedido();

            JOptionPane.showMessageDialog(null, "el pedido se guardo correctamente");

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void cargarTablaPedido() {
        ArrayList<Pedido> arrayPedido = this.servicioPedido.obtenerTodoPedido();
        DefaultTableModel modeloPedido = (DefaultTableModel) this.pedidoVista.getjTable1pedido_pedido().getModel();
        modeloPedido.setRowCount(0);
        for (Pedido pedido : arrayPedido) {
            Object[] agregarPedido = {pedido.getIdPedido(), pedido.getCliente().getIdCliente(), pedido.getMesa().getIdMesa(), pedido.getPlato().getIdPlato(), pedido.getCantidad(),
                pedido.getDemora(), pedido.getEstado()};
            modeloPedido.addRow(agregarPedido);

        }

    }

    public void llenarComboMesasOcupadasFactura() {

        ArrayList<Mesa> mesasOcup = this.servicioMesa.mesasOcupadas();

        DefaultComboBoxModel modeloMesas = new DefaultComboBoxModel(mesasOcup.toArray());

        this.facturaVista.getjComboBox1mesasOcupadas_Factura().setModel(modeloMesas);

    }

    public void agregarATablaFactura() {
        try {
              Mesa mesa = (Mesa) this.facturaVista.getjComboBox1mesasOcupadas_Factura().getSelectedItem();
        int idMesa = mesa.getIdMesa();
        ArrayList<Object> gragarAtabla = this.servicioFactura.agregarATabla(idMesa);

        DefaultTableModel modeloTablaFactura = (DefaultTableModel) this.facturaVista.getjTable1pedidosFactura().getModel();

        modeloTablaFactura.setRowCount(0);

        for (Object object : gragarAtabla) {
            modeloTablaFactura.addRow((Object[]) object);

        }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no hay mesas ocupadas");
        }
        
        this.limpiarTablaFactura();
      

    }

    public void guardarFacturaApretado() {
        try {
             int fila = this.facturaVista.getjTable1pedidosFactura().getSelectedRow();
        String cliente = this.facturaVista.getjTable1pedidosFactura().getValueAt(fila, 1).toString();
        String platosYbebidas = this.facturaVista.getjTable1pedidosFactura().getValueAt(fila, 2).toString();
        String mesa = this.facturaVista.getjTable1pedidosFactura().getValueAt(fila, 3).toString();
        String precio = this.facturaVista.getjTable1pedidosFactura().getValueAt(fila, 4).toString();
        String cantidad = this.facturaVista.getjTable1pedidosFactura().getValueAt(fila, 5).toString();
        String total = this.facturaVista.getjTextField1total_factura().getText();

        try {
            this.servicioFactura.guardarFactura(cliente, platosYbebidas, mesa, precio, cantidad, total);

            this.facturaVista.getjTextField1montoAgregado().setText(precio);
            //////////////////////////////////////////////////////////////////////////////////////////////
            String idDelPedido = this.facturaVista.getjTable1pedidosFactura().getValueAt(fila, 0).toString();
            int idPedido = Integer.parseInt(idDelPedido);
            
            int idMesa = Integer.valueOf(mesa);
            
            
            this.servicioFactura.ponerPedidoPasivo(idPedido);
            this.servicioFactura.ponerMesasDisponiblesFactura(idMesa);
            this.llenarComboMesasOcupadasFactura();
            /////////////////////////////////////////////////////////////////////////////////////////////
            JOptionPane.showMessageDialog(null, "la factura se guardo correctamente");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
       
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "debe seleccionar un pedido");
        }
       

    }

    public void limpiarTablaFactura() {

        try {
            this.servicioFactura.truncarTablaFactura();
            JOptionPane.showMessageDialog(null, "la tabla se limpio correctamente");

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void verFacturaApretado() {
       
        
        try {
               ArrayList<Double> valorTotalFactura = this.servicioFactura.traerElTotalFactura();
        double totalFacturaUltimo = valorTotalFactura.get(valorTotalFactura.size() - 1);
       
        
        this.servicioFactura.ponerElTotal(totalFacturaUltimo);
        PedidoVista.jMenuItem1.doClick();
      

        ////////////////////////////////////////////////////////////////////////////////////
        int fila = this.facturaVista.getjTable1pedidosFactura().getSelectedRow();
        String mesa = this.facturaVista.getjTable1pedidosFactura().getValueAt(fila, 3).toString();
        int idMesa = Integer.valueOf(mesa);
        
         
        this.servicioFactura.ponerMesasDisponiblesFactura(idMesa);
        ///////////////////////////////////////////////////////////////////////////////////
       // this.servicioFactura.verFactura();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no guardo ningun pedido");
        }
        
        this.servicioFactura.verFactura();

     

    }
    
    
    
    
    

}
