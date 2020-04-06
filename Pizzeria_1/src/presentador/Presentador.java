/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import javax.swing.JOptionPane;
import servicios.ServicioCliente;
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
    private VistaPrincipal  vistaPrincipal;
    private PlatoVista platoVista;
    private MesasVista mesasVista;
    private ClientesVista clientesVista;
    private FacturaVista facturaVista;
    private PropietarioVista propietarioVista;
    private PedidoVista pedidoVista;
    private ServicioCliente servicioCliente;
    

    public Presentador(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
       
       
       
    }

    public Presentador(PlatoVista platoVista) {
        this.platoVista = platoVista;
    }

    public Presentador(MesasVista mesasVista) {
        this.mesasVista = mesasVista;
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
    }

    public void guardarClienteApretado() {
     
      String nombre = this.clientesVista.getjTextField1nombre_cliente().getText();
      String apellido = this.clientesVista. getjTextField2apellido_cliente().getText();
      String direccion = this.clientesVista.getjTextField3direccion_cliente().getText();
      
        try {
          this.servicioCliente.guardarCliente( nombre, apellido, direccion);
            
        
          this.clientesVista.getjTextField1nombre_cliente().setText("");
          this.clientesVista. getjTextField2apellido_cliente().setText("");
          this.clientesVista.getjTextField3direccion_cliente().setText("");
          JOptionPane.showMessageDialog(null, "El cliente se guardo correctamente");
            
            
            
            
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

 
    
    
    
    
    

   
    
    

    
    
   
    
    
  
    
    
    
}
