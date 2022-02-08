/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacerunatareaparamasadelante_contimer;

import java.util.Calendar;
import java.util.Timer;

/**
 *
 * @author pablo
 */
public class HacerUnaTareaParaMasAdelante_conTimer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Calendar calendar = Calendar.getInstance();
        
        calendar.set(Calendar.DAY_OF_MONTH, 8);
        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.HOUR_OF_DAY, 15);
        calendar.set(Calendar.MINUTE, 10);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        
        
        MiTarea tarea = new MiTarea(); //instancia de la clase que cree
        Timer timer = new Timer(); //la clase Timer
        
        timer.schedule(tarea, calendar.getTime());
    }

   



   
    
}
