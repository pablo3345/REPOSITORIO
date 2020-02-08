/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import modelo.Nombrerepuesto;
import repositorio.RepositorioNombreRepuesto;

/**
 *
 * @author pablo
 */
public class ServicioNombreRepuesto {
    
    RepositorioNombreRepuesto repositorioNombreRepuesto;

    public ServicioNombreRepuesto() {
        this.repositorioNombreRepuesto =new  RepositorioNombreRepuesto();
        
        
    }
    
    
    

    public void guardarNombreRepuesto(String nombre) {
        this.validarNombre(nombre);
        
        Nombrerepuesto nombrerepuesto = new Nombrerepuesto(nombre);
        
        this.nombreRepetido(nombrerepuesto);
        
        this.repositorioNombreRepuesto.guardar(nombrerepuesto);
        
        
        
       
    }
    
    
    private void validarNombre(String nombre){
        
        if(nombre.length()==0){
        throw new IllegalArgumentException("el nombre esta vacio");
        
        }
    
    
    
    
    }

    private void nombreRepetido(Nombrerepuesto nombrerepuesto) {
        ArrayList<Nombrerepuesto> arrayNombrerepuestos = (ArrayList<Nombrerepuesto>) this.repositorioNombreRepuesto.obtenerTodos();
        
        for(Nombrerepuesto delas : arrayNombrerepuestos){
        if(delas.getNombre().equals(nombrerepuesto.getNombre())){
        throw new IllegalArgumentException("nombre de producto repetido");
        
        }
        
        
        
        }
        
        
       
    }
    
    public ArrayList<Nombrerepuesto> obtenerTodos(){
    
    ArrayList<Nombrerepuesto> delas2 = (ArrayList<Nombrerepuesto>) this.repositorioNombreRepuesto.obtenerTodos();
    
    
    return delas2;
    
    }
    
    
    
    
}
