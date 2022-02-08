/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacerunatareaparamasadelante_contimer;

import java.util.Date;
import java.util.TimerTask;

/**
 *
 * @author pablo
 */
public class MiTarea extends TimerTask { //clase abstracta TimerTask con su respectivo metodo abajo

    @Override
    public void run() {
        System.out.println("esta es mi tarea "+new Date());
    }
    
}
