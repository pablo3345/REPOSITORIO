/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.TipoDePuesto;
import repositorio.RepositorioTipo_de_Puesto;

/**
 *
 * @author pablo
 */
public class ServicioTipo_de_Puesto {
    private RepositorioTipo_de_Puesto repositorioTipo_de_Puesto;

    public ServicioTipo_de_Puesto() {
        this.repositorioTipo_de_Puesto = new RepositorioTipo_de_Puesto();
    }
    
    
 

    public void guardarTipo_de_puesto(String nombre, String camara_refrigerante) {
        this.validarNombre(nombre);
        
        TipoDePuesto tipoDePuesto = new TipoDePuesto(nombre, camara_refrigerante);
        this.repositorioTipo_de_Puesto.guardarTpoDePuesto(tipoDePuesto);
        
    }
    
    private void validarNombre(String nombre){
    if(nombre.length() ==0){
    throw new IllegalArgumentException("el nombre es invalido");
    
    }
    
    
    
    
    }
    
    public ArrayList<TipoDePuesto> obtenerTodosTipoDePuesto(){
        
        ArrayList<TipoDePuesto> tipoDePuestos = this.repositorioTipo_de_Puesto.obtenerTodos();
        
        return tipoDePuestos;
    
    
    
    
    }
    
  
    
}
