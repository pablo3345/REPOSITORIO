/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import modelo.Repuesto;
import repositorio.RepositorioRepuesto;

/**
 *
 * @author pablo
 */
public class ServicioRepuesto {
    
    private RepositorioRepuesto repositorioRepuesto;

    public ServicioRepuesto() {
        this.repositorioRepuesto = new RepositorioRepuesto();
    }
    
    

    public void guardarRepuesto(String nombre, String codigo, String precio, String stockActual, String estado) {
        
    double precioConvertido = this.validadrPrecio(precio);
    int stockConvertido = this.validarStockActual(stockActual);
    
        Repuesto repuesto = new Repuesto(nombre, codigo, precioConvertido, stockConvertido, estado);
       
        this.repositorioRepuesto.guardarRepuesto(repuesto);
        
     
        
        
    
    
    
       
        
    }
    
    
    private double validadrPrecio(String precio){
        try {
            double precioParseado = Double.parseDouble(precio);
            return precioParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("precio incorrecto");
        }
    
    
    
    }
    
    private int validarStockActual(String stockActual){
    
        try {
            int stockParseado = Integer.valueOf(stockActual);
            return stockParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("stock actual incorrecto");
        }
    
    
    }
    
  public ArrayList<Repuesto> obtenerTodosRepuesto(){
      ArrayList<Repuesto> dela = new ArrayList<>();
      
      dela = this.repositorioRepuesto.obtenerTodos();
      
      return dela;
  
  
  
  }
  
  public Repuesto obtenerRepuesto(int idRepuesto){
      
      
      
      
      return this.repositorioRepuesto.obtenerRepuestoGuardado(idRepuesto);
  
  
  
  
  
  }
  


  
    
}
