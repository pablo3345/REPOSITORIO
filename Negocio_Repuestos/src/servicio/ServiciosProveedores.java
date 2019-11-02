/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.ArrayList;
import modelo.Proveedores;
import repositorio.RepositorioProveedores;





/**
 *
 * @author pablo
 */
public class ServiciosProveedores {
    
    private RepositorioProveedores repositorioProveedores; 

    public ServiciosProveedores() {
        this.repositorioProveedores = new RepositorioProveedores();
    }
    
    
    
    
    
    
    public void guardarProveedores(String nombre, String direccion){
        validarNombre(nombre);
        validarDireccion(direccion);
        
        Proveedores proveedor = new Proveedores(nombre, direccion);
        this.repositorioProveedores.guardarProveedor(proveedor);
        
        
        
        
    
    
    
    
    }
    
    private void validarNombre(String nombre){
        
        if(nombre.length()== 0){
            throw new IllegalArgumentException("nombre vacio");
        
        
        }
        
   
          
    
    
    
    }
    
   private void validarDireccion(String direccion){
       if(direccion.length()==0){
       throw new IllegalArgumentException("direccion vacia");
       }
   
   
   
   }
   
   public ArrayList<Proveedores> obtenerTodosProveedores(){
   
       ArrayList<Proveedores> arrayProveedores = this.repositorioProveedores.obtenerTodos();
       
       return arrayProveedores;
   
   
   }
    
   
   
   
   
   
    
}
