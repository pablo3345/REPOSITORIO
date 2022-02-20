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
        MiTarea tarea = new MiTarea(); //instancia de la clase que cree
//        
//        calendar.set(Calendar.DAY_OF_MONTH, 8);
//        calendar.set(Calendar.YEAR, 2022);
//        calendar.set(Calendar.HOUR_OF_DAY, 15);
//        calendar.set(Calendar.MINUTE, 10);
//        calendar.set(Calendar.SECOND, 0);
//        calendar.set(Calendar.MILLISECOND, 0);
        
       ///////////hora a que programo//////////////////
       int horas =19;
       int minutos=06;
       int dia =20;
       
       
       ////////////7fecha actual///////////
       int horas2 = calendar.get(Calendar.HOUR_OF_DAY);
       int minutos2 = calendar.get(Calendar.MINUTE);
       int diaDelMes = calendar.get(Calendar.DAY_OF_MONTH);
       
       
       if(horas == horas2 && minutos== minutos2 && dia == diaDelMes){
       
       tarea.start();
       
       
       }
       else{
       
       tarea.stop();
       
       }
       
       
        
        
        
    }

   



   
    
}
