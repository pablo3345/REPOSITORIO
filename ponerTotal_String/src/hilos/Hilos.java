/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import repositorio.Repositorio;

/**
 *
 * @author pablo
 */
public class Hilos extends Thread{
    
//    private Repositorio repositorio;
//
//    public Hilos() {
//        this.repositorio = new Repositorio();
//    }
    
    public Hilos(String msg){
    
    super(msg); // esto va siempre aca es el contructor, msg puede tener cualquier nombre
    
    }
    
    
     @Override
    public void run() {
        
        try {
            Thread.sleep(100);
            
           // this.repositorio.ponerDoubleAlTotalString(MIN_PRIORITY);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       
    }
    
    
    
    
    
   
    
}
