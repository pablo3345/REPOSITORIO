/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Date;

/**
 *
 * @author pablo
 */
public class Venta {
    
    private Date fechaDeCreacion;
    private double montoTotal;
    private String cliente;
    private int descuento;

    public Venta(double montoTotal, String cliente, int descuento) {
        this.montoTotal = montoTotal;
        this.cliente = cliente;
        this.descuento = descuento;
        this.fechaDeCreacion = new Date();
        
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

   

    public double getMontoTotal() {
        return montoTotal;
    }

    public String getCliente() {
        return cliente;
    }

    public int getDescuento() {
        return descuento;
    }
    
    
    
    
    
    
}
