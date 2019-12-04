/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import modelo.Fabricas;
import modelo.Repuesto;
import repositorio.RepositorioFabricas;

/**
 *
 * @author pablo
 */
public class ServiciosFabrica {
    
    private RepositorioFabricas repositoriosFabricas;

    public ServiciosFabrica() {
        this.repositoriosFabricas = new RepositorioFabricas();
    }
    
    

    public void guardarFabrica(Repuesto repuesto, String nombre, String localidad, String costoDeEnvio, String necesitaEnvio, String efectuoElPago) {
       validarNombre(nombre);
       validarLocalidad(localidad);
       validarCostoDeEnvio(costoDeEnvio);
       double costoConvertido = this.validarCostoDeEnvio(costoDeEnvio);
       
       Fabricas fabrica = new Fabricas(repuesto, nombre, localidad, costoConvertido, necesitaEnvio, efectuoElPago);
       
       this.repositoriosFabricas.guardar(fabrica);
       
       
       
      
        
    }
    
    
    private void validarNombre(String nombre){
    
    if(nombre.length()==0){
    throw new IllegalArgumentException("el nombre es vacio");
    }
    
    }
    
    private void validarLocalidad(String localidad){
        
        if(localidad.length()==0){
        throw new IllegalArgumentException("localidad vacia");
        
        
        }
    
    
    
    }
    
    private double validarCostoDeEnvio(String costoDeEnvio){
        
        try {
            double costoEnvioParseado = Double.valueOf(costoDeEnvio);
            return costoEnvioParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("costo de envio incorrecto");
        }
    
    
    
    
    
    }
    
}
