/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programarunatarea_while;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static java.lang.Thread.sleep;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class ProgramarUnaTarea_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Calendar calendar = Calendar.getInstance();
        //  MTarea_dos tarea = new MTarea_dos();
        int contador = 0;
        int dia = calendar.get(Calendar.DAY_OF_WEEK);
        String diasString = "";
        int dias = 0;
        
        
        


        switch (dia) {

            case 1:
                diasString = "Domingo";
                break;
            case 2:
                diasString = "Lunes";
                break;

            case 3:
                diasString = "Martes";
                break;
            case 4:
                diasString = "Miercoles";
                break;

            case 5:
                diasString = "Jueves";
                break;

            case 6:
                diasString = "Viernes";
                break;

            case 7:
                diasString = "Sabados";
                break;
//
//            default:
//                System.out.println("El numero ingresado no es ni 1 ni 2");
//
//                break;
        }

        while (contador < 1) {

           

            Thread hilos = new MTarea_dos("proceso 1");
          

            if (diasString.equals("Jueves")) {
                 System.out.println(diasString);
               // contador++;
                hilos.start();
            } else {
                hilos.stop();
                System.out.println("todavia no llego a la fecha de ejecucion");
                System.out.println(diasString);
               // contador++;
            }
             contador++;
        }

    }

}
