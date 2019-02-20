/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioVendedor;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Vendedor;
import repositorio.RepositorioVendedor;

/**
 *
 * @author pablo
 */
public class ServicioVendedor {
   private RepositorioVendedor repositorioVendedor;

    public ServicioVendedor() {
        this.repositorioVendedor = new RepositorioVendedor();
    }
    
    
    public void guardarVendedor(String nombre,  java.sql.Timestamp tiempo){
        
        Vendedor vendedor = new Vendedor(nombre, tiempo);
        
        this.repositorioVendedor.guardar(vendedor);
    
    
    
    
    }
    
    public void mostrarInformacion(){
    ArrayList<Vendedor> vendedores = this.repositorioVendedor.obtenerTodos();
    
    String mensaje = "";
    
    for(Vendedor vendedor : vendedores){
    mensaje += "Nombre: " + vendedor.getNombre() +" "+
            "Fecha " + vendedor.getHoraFecha() + "\n";
    
    
    }
    
     JOptionPane.showMessageDialog(null, mensaje);
    
    
    
    }

   
   
   
    
}
