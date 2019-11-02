/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertir_centigradosenfahrenheit;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class Convertir_centigradosEnFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gradosCentigradosss = 0;
        while (true) { 
        try {
                          
                
            
            String gradosCentigrados = JOptionPane.showInputDialog("Introfuzca los grados centigrados");

            double gradosCentigradoss = Double.parseDouble(gradosCentigrados);

            if (gradosCentigradoss == 0) {
                gradosCentigradoss = 32;

                JOptionPane.showMessageDialog(null, "Los grados Faherenheit son de: " + gradosCentigradoss);
            } else {
                gradosCentigradosss = (gradosCentigradoss * 9 / 5) + 32;
                JOptionPane.showMessageDialog(null, "Los grados Faherenheit son de: " + gradosCentigradosss);
                
               
                
            }
            break;
          
            
            
            }
            
            

         catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, "numero ingresado incorrecto, Ingrese los nuevos valores");
        }
        }
        

    }

}
