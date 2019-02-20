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
public class Producto {
    private String nombre;
    private double costo;
    private double ganancia;
    private int stockMinimo;
    private int stockActual;
    private String tipo;
    private String detalle;
   

    public Producto(String nombre, double costo, double ganancia, int stockMinimo, int stockActual, String tipo, String detalle) {
        this.nombre = nombre;
        this.costo = costo;
        this.ganancia = ganancia;
        this.stockMinimo = stockMinimo;
        this.stockActual = stockActual;
        this.tipo = tipo;
       
        
       
        
    }

    

    public String getNombre() {
        return nombre;
    }

    public double getCosto() {
        return costo;
    }

    public double getGanancia() {
        return ganancia;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public int getStockActual() {
        return stockActual;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDetalle() {
        return detalle;
    }
    
    
    
    
}
