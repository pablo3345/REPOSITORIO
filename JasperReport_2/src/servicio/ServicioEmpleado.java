/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import modelo.Area;
import modelo.Empleado;
import repositorio.RepositorioArea;
import repositorio.RepositorioEmpleado;

/**
 *
 * @author pablo
 */
public class ServicioEmpleado {
    private RepositorioEmpleado repositorioEmpleado;
    private RepositorioArea repositorioArea;

    public ServicioEmpleado() {
        this.repositorioEmpleado = new RepositorioEmpleado();
        this.repositorioArea = new RepositorioArea();
    }
    
   
    
    
    
    
    public void guardarEmpleado(Area area, String nombre, String apellido, java.sql.Timestamp fecha){
        
        Empleado empleado = new Empleado(area, nombre, apellido, fecha);
        
        this.repositorioEmpleado.guardar(empleado);
        
      
        
        
    
    
    
    }
    
  
    
   
    
}
