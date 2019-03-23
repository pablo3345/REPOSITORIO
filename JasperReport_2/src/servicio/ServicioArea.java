/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import modelo.Area;

/**
 *
 * @author pablo
 */
public class ServicioArea {
    
    public void guardarArea(String nombre, String cantidad){
        int cantidadConvertida = this.validarCantidad(cantidad);
        
        Area area = new Area(nombre,cantidadConvertida);
    
        
    
    
    
    
    
    }
    
    private int validarCantidad(String cantidad){
        
        try {
            int cantidadParseado = Integer.parseInt(cantidad);
            return cantidadParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("cantidad incorrecta");
        }
    
    
    
    }
    
}
