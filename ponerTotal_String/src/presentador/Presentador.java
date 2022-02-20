/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

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

    public Presentador(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        this.servicios = new Servicios();
        this.repositorio = new Repositorio();
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
             double ponerTotal = 10.5;
   
             this.repositorio.ponerDoubleAlTotalString(ponerTotal);
             
             JOptionPane.showMessageDialog(null, "el dato se actualizo correctamente");
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.getMessage());
       }
 
   
   
   }
   
    
    
    

  
    
    
    
}
