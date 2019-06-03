/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import repositorio.RepositorioCliente;

/**
 *
 * @author pablo
 */
public class ServicioCliente {
    
    private RepositorioCliente repositorioCliente;

    public ServicioCliente() {
        this.repositorioCliente = new RepositorioCliente();
    }
    
    
    
    public void guardarCliente(String nombre, String apellido, String telefono, String dni, String sexo) {
        this.validarNombre(nombre);
        this.validarApellido(apellido);
        this.validarTelefono(telefono);
        this.validarDni(dni);
      
        Cliente cliente = new Cliente(nombre, apellido, telefono, dni, sexo);
        
        this.repositorioCliente.guardarCliente(cliente);
        
    }
    
    private void validarNombre(String nombre) {
        if (nombre.length() == 0) {
            throw new IllegalArgumentException("nombre vacio");
            
        }
        
    }
    
    private void validarApellido(String apellido) {
        if (apellido.length() == 0) {
            
            throw new IllegalArgumentException("apellido vacio");
            
        }
        
    }
    
    private void validarTelefono(String telefono) {
        try {
            int telefonoParseado = Integer.parseInt(telefono);
            
            if (telefonoParseado <= 0) {
                throw new IllegalArgumentException("telefono incorrecto");
                
            }
            
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("telefono invalido");
        }
        
    }
    
    private void validarDni(String dni) {
        
        try {
            int dniParseado = Integer.parseInt(dni);
            if (dniParseado <= 0) {
                throw new IllegalArgumentException("dni incorrecto");
                
            }
            
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("dni invalido");
        }
        
    }
    
    public ArrayList<Cliente> obtenerTodosCliente(){
        
        ArrayList<Cliente> arrayCliente = this.repositorioCliente.obtenerTodos();
        
        return arrayCliente;
    
    
    
    
    }

    public void eliminarCliente(Cliente cliente) {
       this.repositorioCliente.eliminarCliente(cliente);
    }
    
   
    
}
