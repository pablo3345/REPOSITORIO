/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.ArrayList;
import modelo.Bicicleta;
import repositorio.RepositorioBicicleta;

/**
 *
 * @author pablo
 */
public class ServicioBicicleta {
    
    private RepositorioBicicleta repositorioBicicleta;
    
    public ServicioBicicleta(){
        this.repositorioBicicleta = new RepositorioBicicleta();
    
    
    
    }
    
  
        
        public void guardarBicicleta(String tipo, String costo, String ganancia, String stockActual){
           double costoConvertido = this.validarCosto(costo);
           double gananciaConvertida = this.validarGanancia(ganancia);
           int stockActualConvertido = this.validarstockActualParseado(stockActual);
           this.validarTipo(tipo);
            
            Bicicleta bicicleta = new Bicicleta(tipo, costoConvertido, gananciaConvertida, stockActualConvertido);
            
            this.repositorioBicicleta.guardar(bicicleta);
            
            
        
        
        
        
        }
        
        private double validarCosto(String costo){
        
            try {
                double costoParseado = Double.parseDouble(costo);
                return costoParseado;
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("costo incorrecto");
            }
        
        
        }
        
        private double validarGanancia(String ganancia){
            
            try {
                double gananciaParseado = Double.parseDouble(ganancia);
                return gananciaParseado;
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("ganancia incorrecta");
            }
        
        
        
        
        
        }
        
        private int validarstockActualParseado(String stockActual){
            
            try {
                int stockActualParseado = Integer.parseInt(stockActual);
                return stockActualParseado;
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("stock actual equivocado");
            }
        
        
        
        
        }
        
        private void validarTipo(String tipo){
        
        if(tipo.length() == 0)
            throw new IllegalArgumentException("el tipo es vacio");
        
        
        }
        
        
        public ArrayList<Bicicleta> obtenerTodos(){
        
        ArrayList<Bicicleta> bici = (ArrayList<Bicicleta>) this.repositorioBicicleta.obtenerTodos();
        
        return bici;
        
        
        }

    
        
        
      

   
    
    
    
    
    
    
    
    
    
}
