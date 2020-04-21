/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import modelo.Cliente;
import repositorio.RepositorioCliente;



/**
 *
 * @author pablo
 */
public class ServicioCliente {
    
    private RepositorioCliente repositorioCliente;

    public ServicioCliente() {
        this.repositorioCliente =new  RepositorioCliente();
    }
    
    
 

  
    
    
    
    

    public void guardarCliente(String nombre, String apellido, String direccion, String localidad) {
        this.validarNombre(nombre);
        this.validarApellido(apellido);
        this.validarDireccion(direccion);
        this.validarLocalidad(localidad);
        
        Cliente cliente = new Cliente(nombre, apellido, direccion, localidad);
        
        this.repositorioCliente.guardarCliente(cliente);
       
        
    }
    
    
    
    private void validarNombre(String nombre){
        
        if(nombre.length()==0){
        throw new IllegalArgumentException("Debe completar el nombre");
        
        
        
        }
        
      
    
    
    
    
    
    
    }
    private void validarApellido(String apellido){
    
    if(apellido.length()==0){
    throw new IllegalArgumentException("Debe completar el apellido");
    }
    
    }
    
    private void validarDireccion(String direccion){
        if(direccion.length()==0){
        throw new IllegalArgumentException("Debe completar la direccion");
        
        
        }
    
    
    
    }
    
    private void validarLocalidad(String localidad){
        
        if(localidad.length()==0){
        throw new IllegalArgumentException("debe completar la localidad");
        
        }
    
    
    
    
    }

    public ArrayList obtenerTodosCliente() {
      ArrayList dela = this.repositorioCliente.obtenerTodosCliente();
      
      return dela;
    }
    
}
