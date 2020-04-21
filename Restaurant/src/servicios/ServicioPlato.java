/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import modelo.Platosybebidas;
import repositorio.RepositorioPlato;

/**
 *
 * @author pablo
 */
public class ServicioPlato {
    
    private RepositorioPlato repositorioPlato;

    public ServicioPlato() {
        this.repositorioPlato =new RepositorioPlato();
    }

    
    
    

    public void guardarComidasYbebidas(String nombre, String costoDelPlato, String precioAlPublico, String tipo, String ingredientes) {
        double costoDelPlatoConvertido = this.validarCostoDelPlato(costoDelPlato);
        double precioAlPublicoConvertido = this.validarPrecioAlPublico(precioAlPublico);
        this.validarIngredientes(ingredientes);
        this.validarNombre(nombre);
        
        Platosybebidas platosybebidas = new Platosybebidas(nombre, costoDelPlatoConvertido, precioAlPublicoConvertido, tipo, ingredientes);
        
        this.repositorioPlato.guardarPlato(platosybebidas);
       
        
       
      
      
    }
    
    
    
    private double validarCostoDelPlato(String costoDelPlato){
        
        try {
            double costoDelPlatoParseado = Double.valueOf(costoDelPlato);
            return costoDelPlatoParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("costo del plato equivocado");
        }
    
    
    
    
    }
    private double validarPrecioAlPublico(String precioAlPublico){
    
        try {
            double precioAlPublicoParseado = Double.valueOf(precioAlPublico);
            return  precioAlPublicoParseado;
        } catch (NumberFormatException e) {
           throw new IllegalArgumentException("precio al publico equivocado");
        }
    
    }
    


    private void validarNombre(String nombre) {
       if(nombre.length()==0){
       throw new IllegalArgumentException("debe completar el nombre");
       }
    }

    private void validarIngredientes(String ingredientes) {
       if(ingredientes.length()==0){
       throw new IllegalArgumentException("debe completar los ingredientes");
       
       }
    }

    public ArrayList<Platosybebidas> obtenerSegunTipo(String tipo) {
        ArrayList<Platosybebidas> array = this.repositorioPlato.obtenerTodos(tipo);
        
        return array;
    }
    

    
}
