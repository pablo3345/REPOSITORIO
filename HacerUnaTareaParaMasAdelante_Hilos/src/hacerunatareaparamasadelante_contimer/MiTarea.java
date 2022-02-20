/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacerunatareaparamasadelante_contimer;

import java.util.Date;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pablo
 */
public class MiTarea extends Thread { //clase abstracta TimerTask con su respectivo metodo abajo

    @Override
    public void run() {
        
        try {
            Thread.sleep(5000);
             System.out.println("esta es mi tarea hecha con hilos "+new Date());
        } catch (InterruptedException ex) {
            Logger.getLogger(MiTarea.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       
    }
    
}
