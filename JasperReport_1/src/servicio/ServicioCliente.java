/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

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
    
    public void guardarCliente(String nombre, String apellido, java.sql.Timestamp fecha) {
        
        Cliente cliente = new Cliente(nombre, apellido, fecha);
        
        this.repositorioCliente.guardar(cliente);
        
    }
    
}
