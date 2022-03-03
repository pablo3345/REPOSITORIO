/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacerunatareaparamasadelante_hilos;

import java.util.Calendar;
import java.util.Timer;

/**
 *
 * @author pablo
 */
public class HacerUnaTareaParaMasAdelante_conHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Calendar calendar = Calendar.getInstance();
        //MiTarea tarea = new MiTarea(); //instancia de la clase que cree
        
        Thread tarea = new MiTarea("tarea 1"); //dos objetos de la misma clase
        Thread tarea2 = new MiTarea("tarea 2");
        
    //    Thread hilo = new MiTarea(); asi lo declaran en un video que vi
//        
//        calendar.set(Calendar.DAY_OF_MONTH, 8);
//        calendar.set(Calendar.YEAR, 2022);
//        calendar.set(Calendar.HOUR_OF_DAY, 15);
//        calendar.set(Calendar.MINUTE, 10);
//        calendar.set(Calendar.SECOND, 0);
//        calendar.set(Calendar.MILLISECOND, 0);
        
       ///////////hora a que programo//////////////////
       int horas =19;
       int minutos=48;
       int dia =24;
       
       
       ////////////7fecha actual///////////
       int horas2 = calendar.get(Calendar.HOUR_OF_DAY);
       int minutos2 = calendar.get(Calendar.MINUTE);
       int diaDelMes = calendar.get(Calendar.DAY_OF_MONTH);
       
       
       if(horas == horas2 && minutos== minutos2 && dia == diaDelMes){
       
       tarea.start();
       tarea2.start();
       
       
       }
       else{
       
       tarea.stop();
       tarea2.stop();
       
       }
       
       
        
        
        
    }

   



   
    
}
