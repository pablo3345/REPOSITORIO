/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Timestamp;



/**
 *
 * @author pablo
 */
public class Empleado {

    private String nombre;
    private String apellido;
    private Timestamp fecha;

    public Empleado(String nombre, String apellido, Timestamp fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Timestamp getFecha() {
        return fecha;
    }

}
