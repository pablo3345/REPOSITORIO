/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programarunatarea_while;

import java.util.Calendar;

/**
 *
 * @author Administrador
 */
public class MTarea_dos extends Thread {
    
    
    public MTarea_dos(String msg){
    
    super(msg);
    
    
    }
    
    
    
     Calendar calendar = Calendar.getInstance();
    
     
    @Override
    public void run(){
        
         System.out.println("este es un tarea con while");
         int contador =calendar.get(Calendar.DAY_OF_MONTH);
         System.out.println(contador);
    
    }
    
}




