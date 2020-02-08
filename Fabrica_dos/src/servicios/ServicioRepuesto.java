/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Nombrerepuesto;
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
    
    
    
    

    public void guardarRepuesto(Nombrerepuesto nombrerepuesto, String nombreEmpleado, String codigo, String precioDeLista, String stockActual, String stockMinimo) {
       
     double precioDeListaConvertido =this.validarPrecioDeLista(precioDeLista);
     int stockActualConvertido=   this.validarStockActual(stockActual);
     int stockMinimoConvertido = this.validarStockMinimo(stockMinimo);
     
     
     Repuesto repuesto = new Repuesto(nombrerepuesto, nombreEmpleado, codigo, precioDeListaConvertido, stockActualConvertido, stockMinimoConvertido);
       if(stockActualConvertido<=10){
                JOptionPane.showMessageDialog(null, "actualmente stock minimo! Vuelva a cargar el stock");
            
            
            
            }
    
     this.codigoRepetido(repuesto);
     this.repositorioRepuesto.guardar(repuesto);
     
     
     
     
    }

    private double validarPrecioDeLista(String precioDeLista) {
        try {
            double precioDeListaParseado = Double.valueOf(precioDeLista);
            return precioDeListaParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("precio de lista incorrecto");
            
        }
    }
    
    private int validarStockActual(String stockActual){
        try {
            int stockActualParseado = Integer.valueOf(stockActual);
            
          
            return stockActualParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("stock actual equivocado");
        }
    
    
    }
    
      private int validarStockMinimo(String stockMinimo){
        try {
            int stockMinimoParseado = Integer.valueOf(stockMinimo);
            return stockMinimoParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("stock minimo equivocado");
        }
    
    
    }
      
      public ArrayList<Repuesto> obtenerTodos(){
          
          ArrayList<Repuesto> delas3 = (ArrayList<Repuesto>) this.repositorioRepuesto.obtenerTodos();
          
          return delas3;
      
      
      
      
      }
      
      
      public void codigoRepetido(Repuesto repuesto){
      
      ArrayList<Repuesto> delas4 = (ArrayList<Repuesto>) this.repositorioRepuesto.obtenerTodos();
      
      for(Repuesto respues : delas4){
      if(respues.getCodigo().equals(repuesto.getCodigo())){
      throw new IllegalArgumentException("codigo repetido");
      
      
      
      }
      
      
      }
      
      
      
      
      }
      
      public Repuesto getRepuesto(int idRepuesto){
          
          Repuesto repuesto = this.repositorioRepuesto.obtenerRepuestoGuardado(idRepuesto);
      
      
      return repuesto;
      
      }
      
     
    
}
