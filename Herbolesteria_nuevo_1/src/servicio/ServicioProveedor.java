/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;


import java.util.List;
import modelo.Compra;
import modelo.Proveedor;
import repositorio.RepositorioProveedor;

/**
 *
 * @author pablo
 */
public class ServicioProveedor {
    
    private RepositorioProveedor repositorioProveedor;
   

    public ServicioProveedor() {
        this.repositorioProveedor = new RepositorioProveedor();
    }
    
  public void guardarProveedor(String nombreApellido, String localidad, String rubro){
      
      Proveedor proveedor = new Proveedor(nombreApellido, localidad, rubro);
      
      this.repositorioProveedor.guardar(proveedor);
  
  
  
  
  
  }
  
     public List<Proveedor> obtenerTodosProveedor() {
        List<Proveedor> proveedors = this.repositorioProveedor.obtenerTodos();

        return proveedors;

    }
    
  
    
    
    
}
