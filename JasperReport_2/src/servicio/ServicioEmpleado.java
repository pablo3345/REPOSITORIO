/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import modelo.Empleado;

/**
 *
 * @author pablo
 */
public class ServicioEmpleado {
    
    public void guardarEmpleado(String nombre, String apellido, java.sql.Timestamp fecha){
        
        Empleado empleado = new Empleado(nombre, apellido, fecha);
    
    
    
    }
    
}
