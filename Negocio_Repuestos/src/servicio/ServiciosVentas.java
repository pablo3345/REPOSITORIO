/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.sql.Timestamp;
import java.util.ArrayList;
import modelo.Repuesto;
import modelo.Ventas;
import repositorio.RepositorioVentas;

/**
 *
 * @author pablo
 */
public class ServiciosVentas {
    private RepositorioVentas repositorioVentas;
    private Ventas ventass;
   

    public ServiciosVentas() {
        this.repositorioVentas = new RepositorioVentas();
        this.ventass = new Ventas();
    }
    
    
    

    public void guardarVentas(Timestamp fecha, String montoTotalConIva, String efectuoElPago, Repuesto repuesto) {
       double montoTotalConvertido =validarMontoTotalConIva(montoTotalConIva);
       
       montoTotalConvertido = repuesto.getPrecioSinIva() + repuesto.getPrecioSinIva() *22 /100;
       
        Ventas ventas = new Ventas(repuesto, fecha, montoTotalConvertido, efectuoElPago);
        
      
        
        
        
       
       
       this.repositorioVentas.guardarVentas(ventas);
       
       
       
       
       
       
     
      
     
     
    
       
       
       
      
        
    }
    
    
    
    private double validarMontoTotalConIva(String montoTotalConIva){
        
        try {
            double montoTotalParseado = Double.valueOf(montoTotalConIva);
            if(montoTotalParseado <= 0){
            throw new IllegalArgumentException("monto vacio");
           
            
            }
            
            
            
            
            
      
           
           
           
            
            return montoTotalParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("monto incorrecto");
        }
        
        
        
       
        
        
       
    
    
    
    
    }
    
    public ArrayList<Ventas> obtenerTodoVentas(){
        
        ArrayList<Ventas> arrayVentas = this.repositorioVentas.obtenerTodosVentas();
        
        
        
        return arrayVentas;
    
    
    
    
    
    
    }
      public Ventas getVentas(int id_Ventas){
        
        Ventas ventas = this.repositorioVentas.obtenerVentasGuardado(id_Ventas);
        
        
        return ventas;
    
    
    
    }
      
    
      
   

   
    
   
 
}