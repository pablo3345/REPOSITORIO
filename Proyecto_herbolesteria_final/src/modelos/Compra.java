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
public class Compra {
    private double montoTotal;
    private Date fecha;

    public Compra(double montoTotal) {
        this.montoTotal = montoTotal;
        this.fecha = new Date();
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public Date getFecha() {
        return fecha;
    }
    
    
    
    
    
}
