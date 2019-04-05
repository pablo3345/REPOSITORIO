/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.ArrayList;
import modelo.Persona;
import repositorio.RepositorioPersona;

/**
 *
 * @author pablo
 */
public class ServicioPersona {
    
    private RepositorioPersona repositorioPersona;

    public ServicioPersona() {
        this.repositorioPersona = new RepositorioPersona();
    }
    
    

    public void guardarPersona(String nombre, String apellido, String edad, java.sql.Timestamp fecha) {
        int edadConvertida = this.validadEdad(edad);

        Persona persona = new Persona(nombre, apellido, edadConvertida, fecha);
        
        this.repositorioPersona.guardar(persona);
        
     

    }

    private int validadEdad(String edad) {
        try {
            int edadParseado = Integer.parseInt(edad);
            return edadParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("edad incorrecta");
        }

    }
    
    public Persona getPersona(int id_Persona){
    
    Persona persona =this.repositorioPersona.obtenerPersonaGuardado(id_Persona);
    
    return persona;
    
   
    
    }
    
    public ArrayList<Persona> obtenerTodos(){
     ArrayList<Persona> array = this.repositorioPersona.obtenerTodos();
     
     return array;
    
    
    
    
    }

}
