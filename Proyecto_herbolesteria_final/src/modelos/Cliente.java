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
public class Cliente {
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String cuit;

    public Cliente(String nombre, String apellido, String telefono, String direccion, String cuit) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCuit() {
        return cuit;
    }
    
    
    
    
    
}
