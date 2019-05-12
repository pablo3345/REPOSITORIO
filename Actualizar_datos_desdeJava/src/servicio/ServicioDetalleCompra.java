/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import modelo.Bicicleta;
import modelo.Compra;
import modelo.Detallecompra;
import repositorio.RepositorioDetalleCompra;

/**
 *
 * @author pablo
 */
public class ServicioDetalleCompra {
    
    private RepositorioDetalleCompra repositorioDetalleCompra;
    
    public ServicioDetalleCompra(){
    this.repositorioDetalleCompra = new RepositorioDetalleCompra();
    
    }
    
    public void guardarDetalleCompra(Bicicleta bicicleta, Compra compra, String cantidad, String precioUnitario){
        int cantidadConvertida = this.validarCantidad(cantidad);
        double precioUnitarioConvertido = this.validarPrecioUnitario(precioUnitario);
    
        Detallecompra detallecompra = new Detallecompra(bicicleta, compra, cantidadConvertida, precioUnitarioConvertido);
        
        this.repositorioDetalleCompra.guardar(detallecompra);
        
        
        
    
    
    
    }
    
    
    private int validarCantidad(String cantidad){
        
        try {
            int cantidadParseado = Integer.parseInt(cantidad);
            
            if(cantidadParseado <=0){
            
            throw new IllegalArgumentException("cantidad vacia");
            
            }
            return cantidadParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("cantidad erronea");
        }
    
    
    
    }
    
    private double validarPrecioUnitario(String precioUnitario){
        try {
            double precioUnitarioParseado = Double.parseDouble(precioUnitario);
            return precioUnitarioParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("precio unitario erroneo");
        }
    
    
    
    }
    
}
