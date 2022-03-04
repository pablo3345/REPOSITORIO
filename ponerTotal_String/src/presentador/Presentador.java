/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import hilos.Hilos;
import java.util.Calendar;
import javax.swing.JOptionPane;
import repositorio.Repositorio;
import servicios.Servicios;
import vista.VistaPrincipal;

/**
 *
 * @author pablo
 */
public class Presentador {
    
    private VistaPrincipal vistaPrincipal;
    private Servicios servicios;
    private Repositorio repositorio;
   // private Hilos hilos;
    
     double ponerTotal = 0.0;

    public Presentador(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        this.servicios = new Servicios();
        this.repositorio = new Repositorio();
       // this.hilos = new Hilos();
       this.tareaProgramada(ponerTotal);
      
    }
    
    
     
    
    
    
    
   public void guardarApretado(){
       String total = this.vistaPrincipal. getjTextField1Total().getText();
   
       try {
           this.servicios.guardar(total);
           JOptionPane.showMessageDialog(null, "el total se guardo correctamente");
          
           
           this.vistaPrincipal. getjTextField1Total().setText("");
           
           
           
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage());
       }
   
   
   
   
   }
   
   
   public void actualizar(){
   
       try {
           //  double ponerTotal = 10.5;
   
             this.repositorio.ponerDoubleAlTotalString(ponerTotal);
             
             JOptionPane.showMessageDialog(null, "el dato se actualizo correctamente");
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage());
       }
 
   
   
   }
   
   public void tareaProgramada(double ponerTotal){
       
       Calendar calendar = Calendar.getInstance();
       
        Thread hilos = new Hilos("proceso 1"); //instancia de la clase Hilos
     //   Thread hilosThread = new Hilos(); // en un video vi que asi de declara con Thread
        
         int horas =23;
       int minutos=26;
       int dia =21;
       
       
       ////////////7fecha actual/////////////
       int horas2 = calendar.get(Calendar.HOUR_OF_DAY);
       int minutos2 = calendar.get(Calendar.MINUTE);
       int diaDelMes = calendar.get(Calendar.DAY_OF_MONTH);
       
       
       if(horas == horas2 && minutos== minutos2 && dia == diaDelMes){
           
           this.repositorio.ponerDoubleAlTotalString(ponerTotal);
       
       hilos.start();
       
       
       }
       else{
       
       hilos.stop();
       
       }
   
   
   }
   
   
   
   
   
    
    

  
    
    
    
}
