/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import javax.swing.JOptionPane;
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
    }

    public Presentador(MesaVistas mesaVistas) {
        this.mesaVistas = mesaVistas;
        this.servicioMesa = new ServicioMesa();
    }

    public Presentador(PedidoVistas pedidoVistas) {
        this.pedidoVistas = pedidoVistas;
    }

    public Presentador(FacturaVistas facturaVistas) {
        this.facturaVistas = facturaVistas;
        this.servicioFactura = new ServicioFactura();
    }

    public Presentador(PropietarioVistas propietarioVistas) {
        this.propietarioVistas = propietarioVistas;
        this.servicioPropietario = new ServicioPropietario();
    }

    public void guardarClienteApretado() {
      String nombre = this.clientesVistas.getjTextField2nombreCliente().getText();
      String apellido = this.clientesVistas.getjTextField1apellidoCliente().getText();
      String direccion = this.clientesVistas. getjTextField3direccionCliente().getText();
      
      
        try {
            this.servicioCliente.guardarCliente(nombre, apellido, direccion);
            
            JOptionPane.showMessageDialog(null, "El cliente se guardo correctamente");
            
            this.clientesVistas.getjTextField2nombreCliente().setText("");
            this.clientesVistas.getjTextField1apellidoCliente().setText("");
            this.clientesVistas. getjTextField3direccionCliente().setText("");
            
            
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void guardarComidasYbebidasApretado() {
       String nombre = this.platoVistas.getjTextField2nombre_plato().getText();
       String costoDelPlato = this.platoVistas.getjTextField3costoDelPlato_plato().getText();
       String precioAlPublico = this.platoVistas.getjTextField1precioAlPublico_plato().getText();
       String ingredientes = this.platoVistas.getjTextArea1ingredientes_plato().getText();
       
       
        try {
             this.servicioPlato.guardarComidasYbebidas(nombre, costoDelPlato, precioAlPublico, ingredientes);
             
             this.platoVistas.getjTextField2nombre_plato().setText("");
             this.platoVistas.getjTextField3costoDelPlato_plato().setText("");
             this.platoVistas.getjTextField1precioAlPublico_plato().setText("");
             this.platoVistas.getjTextArea1ingredientes_plato().setText("");
             
             JOptionPane.showMessageDialog(null, "Los platos o bebidas se guardaron correctamente");
            
            
            
            
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    

    public void guardarMesaApretado() {
       String numero = this.mesaVistas.getjTextField1numeroMesa().getText();
      
       this.mesaVistas. getjRadioButton1disponible().setActionCommand("disponible");
       this.mesaVistas.getjRadioButton2ocupado().setActionCommand("ocupada");
       String estado = this.mesaVistas. getButtonGroup1().getSelection().getActionCommand();
       
        try {
            this.servicioMesa.guardarMesa(numero, estado);
            
            this.mesaVistas.getjTextField1numeroMesa().setText("");
            JOptionPane.showMessageDialog(null, "La mesa se guardo correctamente");
            
            
            
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    

   
    
    


   
   
    
    
}

