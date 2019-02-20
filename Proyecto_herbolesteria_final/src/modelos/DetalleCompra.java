/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author pablo
 */
public class DetalleCompra {
    private int cantidad;
    private int precioUnitario;

    public DetalleCompra(int cantidad, int precioUnitario) {
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }
    
    
    
    
}
