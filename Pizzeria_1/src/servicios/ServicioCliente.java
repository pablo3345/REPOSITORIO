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
        this.repositorioCliente = new RepositorioCliente();
    }
    
    

    public void guardarCliente(String nombre, String apellido, String direccion, String localidad) {
        Cliente cliente = new Cliente(nombre, apellido, direccion, localidad);
        
        this.repositorioCliente.guardarCliente(cliente);
        
        
    }

    public ArrayList<Cliente> obtenerTodosClientes() {
       ArrayList<Cliente> obtenerClientes = this.repositorioCliente.obtenerTodosCliente();
       
       return obtenerClientes;
    }

    public void actualizarCliente(int idClienteConvertido, String nombre, String apellido, String direccion, String localidad) {
        this.repositorioCliente.actualizarCliente( idClienteConvertido, nombre, apellido, direccion, localidad);
    }

    
   
    
    

   

   
}
