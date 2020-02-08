/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos_eliminar;

import java.awt.PageAttributes;
import java.util.Scanner;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class Genericos_eliminar {
    
      private static <E> E generics (E primerArgumento, E segundoArgumento){
        
        if(primerArgumento.equals(segundoArgumento)){
        return primerArgumento;
        
        }
        else
            return segundoArgumento;
    
    
    
    }

    public static void main(String[] args) {
        // TODO code application logic here

        String numero = "458";
        System.out.println(generics(5, "hola"));
        System.out.println(generics("gil", "puto"));
        System.out.println(generics(58, Integer.parseInt(numero)));
        Scanner entrada = new Scanner(System.in);

        GenericosClase objeto1 = new GenericosClase("Pablo", 42, "Lavalle 369");
        GenericosClase objeto2 = new GenericosClase("Ricardo", 32, "Libertad 458");

//        objeto1.mostrarDatos();
//        objeto1.ifCondicional();

        System.out.println("--------------------------------------------------");

//        objeto2.mostrarDatos();
//        objeto2.ifCondicional();

        GenericosClase objeto3 = new GenericosClase("Luis", 14, "Salta 47");
        GenericosClase objeto4 = new GenericosClase("Silvista", 25, "Mitre 475");
//
//        objeto3.ifCondicional();
//        objeto3.buscarLetra();
//        objeto1.buscarLetra();
//        objeto2.buscarLetra();
//        objeto4.buscarLetra();
//
//        objeto3.cantidadDeCaracteres();
//        objeto4.cantidadDeCaracteres();
//        objeto1.cantidadDeCaracteres();

        String colores[] = new String[4];
        colores[0] = "-----supero los 40 bancos disponibles----";
        colores[1] = "verde";
        colores[2] = "azul";
        colores[3] = "amarillo";

        int aulas[] = new int[4];
        aulas[0] = 41;
        aulas[1] = 35;
        aulas[2] = 40;
        aulas[3] = 30;

        int inscriptos = 0;
        int indice = 0;
         int capacidadMaxima = 40;

        System.out.println("ingrese la cantidad de alumnos");
        inscriptos = entrada.nextInt();
        
            
            
        
 
//         if(inscriptos>40){
//                System.out.println("el numero de inscriptos supero los 40 bancos, intentelo nuevamente!");
//                System.exit(0);
//                
//         }
         
         
        for (int i = 0; i <= 3; i++) {

            
            int auxliliar = 0;
           
            
            
            
            
            

            if (inscriptos <= aulas[i] && capacidadMaxima>=aulas[i]) {
                capacidadMaxima = aulas[i];
                indice = i;
              
                
               

            }
          
         
            

        }
        
          
                   
         System.out.println("el aula correspondiente es " + colores[indice]);
        }
    

    
    

}
