/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import modelo.Dimension;
import modelo.Puesto;
import modelo.Sector;
import modelo.TipoDePuesto;
import repositorio.RepositorioPuesto;

/**
 *
 * @author pablo
 */
public class ServicioPuesto {
    private RepositorioPuesto repositorioPuesto;

    public ServicioPuesto() {
        this.repositorioPuesto = new RepositorioPuesto();
    }

  
    
    

    public void guardarPuesto(Dimension dimension, TipoDePuesto tipoDePuesto, Sector sector) {
        
        Puesto puesto = new Puesto(dimension, sector, tipoDePuesto);
        this.repositorioPuesto.guardarCliente(puesto);
        
        
       
    }
    
    public ArrayList<Puesto> obtenerTodos(){
    
    ArrayList<Puesto> puestos = this.repositorioPuesto.obtenerTodosPuesto();
    
    return puestos;
    }
    
}
