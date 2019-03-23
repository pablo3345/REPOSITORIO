/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author pablo
 */
public class Area {
    private String nombre;
    private int cantidadEmpleados;

    public Area(String nombre, int cantidadEmpleados) {
        this.nombre = nombre;
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }
    
    
    
}
