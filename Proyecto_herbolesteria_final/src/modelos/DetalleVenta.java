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
public class DetalleVenta {
    private int cantidad;
    private double importe;
    private double precioUnitario;

    public DetalleVenta(int cantidad, double importe, double precioUnitario) {
        this.cantidad = cantidad;
        this.importe = importe;
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getImporte() {
        return importe;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }
    
    
    
    
}
