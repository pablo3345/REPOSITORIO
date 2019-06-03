/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import modelo.Sector;
import repositorio.RepositorioSector;

/**
 *
 * @author pablo
 */
public class ServicioSector {
    
    private RepositorioSector repositorioSector;

    public ServicioSector() {
        this.repositorioSector = new RepositorioSector();
    }
    
    

    public void guardarSector(String nombre) {
        this.validarSector(nombre);
        Sector sector = new Sector(nombre);
        this.repositorioSector.guardarSector(sector);
        
  
       
    }
    
    private void validarSector(String nombre){
    
    if(nombre.length() == 0){
    throw new IllegalArgumentException("nombre invalido");
    
    
    }
    
    }
    
    public ArrayList<Sector> obtenerTodosSector(){
    
    ArrayList<Sector> arraySector = this.repositorioSector.obtenerTodos();
    
    return arraySector;
    
    }

   

    public void eliminarSector(Sector sector) {
       this.repositorioSector.eliminarSector(sector);
    }
    
   
    
}
