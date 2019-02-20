/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class Proveedor {
    private String nombre;
    private String apellido;
    private String cuit;
    private String telefono;
    private String direccion;
    private String localidad;
    private String rubro;
    private ArrayList<String> cantidadDeRubros;

    public Proveedor(String nombre, String apellido, String cuit, String telefono, String direccion, String localidad, String rubro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuit = cuit;
        this.telefono = telefono;
        this.direccion = direccion;
        this.localidad = localidad;
        this.rubro = rubro;
        this.cantidadDeRubros = new ArrayList<>();
        
    }

    
    

   
    

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCuit() {
        return cuit;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getRubro() {
        return rubro;
    }

    public ArrayList<String> getCantidadDeRubros() {
        return cantidadDeRubros;
    }

   
    
    
    
    
    
}
