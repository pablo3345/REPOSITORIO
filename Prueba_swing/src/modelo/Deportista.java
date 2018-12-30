/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author pablo
 */
public class Deportista {

    private String nombre;
    private String apellido;
    private String dni;

   

    public Deportista(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
       
    }

  

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return  nombre + " "+ apellido+" " +" El DNI es: "+ dni+ "\n";
    }
    
   
    
    
    

   

}
