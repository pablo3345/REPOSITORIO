/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import modelo.Plato;
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

    
    
    

    public void guardarComidasYbebidas(String nombre, String costoDelPlato, String precioAlPublico, String ingredientes) {
        double costoDelPlatoConvertido = this.validarCostoDelPlato(costoDelPlato);
        double precioAlPublicoConvertido = this.validarPrecioAlPublico(precioAlPublico);
        this.validarIngredientes( ingredientes);
        
        Plato plato = new Plato(nombre, costoDelPlatoConvertido, precioAlPublicoConvertido, ingredientes);
        
        this.repositorioPlato.guardarPlato(plato);
      
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
    
    private void validarIngredientes(String ingredientes){{
    
    if(ingredientes.length()==0){
    throw new IllegalArgumentException("ingredientes vacio");
    
    
    }
    
    
    }
    
    
    
    }
    
}
