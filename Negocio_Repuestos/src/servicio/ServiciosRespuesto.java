/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.DetalleVenta;
import modelo.Proveedores;
import modelo.Repuesto;
import repositorio.RepositorioRepuesto;

/**
 *
 * @author pablo
 */
public class ServiciosRespuesto {
    
    private RepositorioRepuesto repositorioRepuesto;
    private ServiciosDetalle_Ventas serviciosDetalle_Ventas;

    public ServiciosRespuesto() {
        this.repositorioRepuesto =new RepositorioRepuesto();
        this.serviciosDetalle_Ventas = new ServiciosDetalle_Ventas();
    }
    
    

    public void guardarRespuesto(Proveedores proveedores, String nombre, String codigo, String precioSinIva, String stockActual, String stockMinimo) {
        double precioConvertido = validarPrecioSinIva(precioSinIva);
        int stockActualConvertido = validarStockActual(stockActual);
        int stockMinimoConvertido =validarStockMinimo(stockMinimo);
        
        
        
   
      
        
      
        
        

        Repuesto repuesto = new Repuesto(proveedores, nombre, codigo, precioConvertido, stockActualConvertido, stockMinimoConvertido);
        
        codigoRepetido(repuesto);
      
        
        this.repositorioRepuesto.guardarRespuesto(repuesto);
        
       
        
    }

    private double validarPrecioSinIva(String precioSinIva) {

        try {
            double precioSinIvaParseado = Double.valueOf(precioSinIva);

            return precioSinIvaParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("precio incorrecto");
        }

    }

    private int validarStockActual(String stockActual) {

        try {
            int stockActualParseado = Integer.valueOf(stockActual);

            return stockActualParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("stock actual equivocado");
        }

    }

    private int validarStockMinimo(String stockMinimo) {
        try {
            int stockMinimoParseado = Integer.valueOf(stockMinimo);

            return stockMinimoParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("stock minimo equivocado");
        }

    }

    public ArrayList<Repuesto> obtenerRepuestos() {
        ArrayList<Repuesto> arrayRepu = this.repositorioRepuesto.obtenerTodosRepuestos();
        
        return arrayRepu;
       
    }
    
    
       public Repuesto getRepuesto(int id_Repuesto){
         
               Repuesto repuesto = this.repositorioRepuesto.obtenerRepuestoGuardado(id_Repuesto);
        
               return repuesto;
               
           
         
               
               
           
          
            
             
           
       
    
    
    
       }
       
       
       public void codigoRepetido(Repuesto repuesto){
           
           ArrayList<Repuesto> arrayRepues = this.repositorioRepuesto.obtenerTodosRepuestos();
           
           for(Repuesto del : arrayRepues){
           if(del.getCodigo().equals(repuesto.getCodigo()))
               throw new IllegalArgumentException("codigo repetido");
           
           
           }
           
           
           
           
       
       
       
       }

    
    
   
    
   

 

  
    
  

}
