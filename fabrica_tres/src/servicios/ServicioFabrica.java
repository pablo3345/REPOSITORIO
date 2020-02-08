/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import modelo.Fabrica;
import repositorio.RepositorioFabrica;

/**
 *
 * @author pablo
 */
public class ServicioFabrica {
    
    private RepositorioFabrica repositorioFabrica;

    public ServicioFabrica() {
        this.repositorioFabrica = new RepositorioFabrica();
    }
    
    
    

    public void guardarFabrica(String nombre, String direccion) {
        
        this.validarNombre(nombre);
        
        Fabrica fabrica = new Fabrica(nombre, direccion);
        this.repositorioFabrica.guardarFabricaa(fabrica);
        
        
       
    }
    
    
    private void validarNombre(String nombre){
        
        if(nombre.length()==0){
        throw new IllegalArgumentException("nombre vacio");
        
        }
        
        
        
    
    
    
    }
    
    
       public ArrayList<Fabrica> obtenerTodos(){
        
        ArrayList<Fabrica> array = this.repositorioFabrica.obtenerTodos();
        
        
        return array;
    
    
    
    
    
    }
       
       public Fabrica obtenerFabrica(int id_Fabrica){
           
           
           
           return this.repositorioFabrica.obtenerFabricaGuardado(id_Fabrica);
       
       
       
       
       
       }
       
      
    
}
