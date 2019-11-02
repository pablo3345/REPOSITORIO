/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import modelo.Articulo;
import modelo.Empleado;
import repositorios.RepositorioArticulo;

/**
 *
 * @author pablo
 */
public class ServicioArticulo {
    private RepositorioArticulo repositorioArticulo;

    public ServicioArticulo() {
        this.repositorioArticulo =new RepositorioArticulo();
    }
    
    

    public void guardarArticulo(Empleado empleado, String cantidadVendida, String precioUnitario) {
        int cantidadVendidaConvertida = this.validarCantidadVendida(cantidadVendida);
        double precioUnitarioConvertido = this.validarPrecioUnitario(precioUnitario);
        
        Articulo articulo = new Articulo(empleado, cantidadVendidaConvertida, precioUnitarioConvertido);
        
        this.repositorioArticulo.guardar(articulo);
       
        
    }
    
    private int validarCantidadVendida(String cantidadVendida){
    
        try {
            int cantidadVendidaParseado = Integer.parseInt(cantidadVendida);
            
            if(cantidadVendidaParseado <= 0){
            throw new IllegalArgumentException("cantidad vendida vacio");
            
            
            
            }
            return cantidadVendidaParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("la cantidad vendida es incorrecta");
        }
    
    
    }
    private double validarPrecioUnitario(String precioUnitario){
        try {
            double precioUnitarioParseado = Double.parseDouble(precioUnitario);
            
            if(precioUnitarioParseado <=0){
            throw new IllegalArgumentException("precio unitario vacio");
            
            }
            return precioUnitarioParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("precio unitario incorrecto");
        }
    
    }
    
}
