/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import javax.swing.JOptionPane;
import servicioVendedor.ServicioVendedor;
import vista.Vista;
import java.sql.Date;
import java.util.Calendar;

/**
 *
 * @author pablo
 */
public class Presentador {
    
    private Vista vista;
    private ServicioVendedor servicioVendedor;

    public Presentador(Vista vista) {
        this.vista = vista;
        this.servicioVendedor =new ServicioVendedor();
    }

    public void guardarApretado() {
       String nombre = this.vista.getjTextFieldNombre().getText();
       Calendar cal = Calendar.getInstance();
      
       java.sql.Timestamp tiempo = new java.sql.Timestamp(cal.getTimeInMillis());
      
    
     
       
             try {
      

            this.servicioVendedor.guardarVendedor(nombre, tiempo);
            
            this.vista.getjTextFieldNombre().setText("");

           

            JOptionPane.showMessageDialog(null, "el vendedor se guardo correctamente");

        } catch (IllegalArgumentException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage());

        }
    }

    public void MostrarInformacionApretado() {
       this.servicioVendedor.mostrarInformacion();
    }
    
    
    
}
