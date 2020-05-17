/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Mesa;
import modelo.Plato;
import servicios.ServicioCliente;
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
    }

    public Presentador(PropietarioVista propietarioVista) {
        this.propietarioVista = propietarioVista;
    }

    public Presentador(PedidoVista pedidoVista) {
        this.pedidoVista = pedidoVista;
        this.servicioPedido = new ServicioPedido();
        this.servicioCliente = new ServicioCliente();
        this.servicioPlato = new ServicioPlato();
        this.llenarComboCliente_pedido();
        this.llenarComboComestiblePedido();
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
    
    private void llenarComboComestiblePedido(){
    
    ArrayList<Plato> arrayPlato = this.servicioPlato.obtenerTodosPlato();
    
    DefaultComboBoxModel modeloPlato = new DefaultComboBoxModel(arrayPlato.toArray());
    
    this.pedidoVista. getjComboBox3comestible_pedido().setModel(modeloPlato);
    
    }

    public void guardarPedidoApretado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
