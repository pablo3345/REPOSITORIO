/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponerfecha_parajava8;

import com.sun.org.apache.bcel.internal.generic.DDIV;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javafx.util.converter.LocalDateStringConverter;
import javax.print.attribute.Size2DSyntax;

/**
 *
 * @author pablo
 */
public class PonerFecha_paraJava8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();

        LocalTime hora = LocalTime.now();

        System.out.println(fecha.getDayOfMonth() + " " + fecha.getMonthValue() + " " + fecha.getYear() + " y la hora es: " + hora);

        //////////////////////////////////////////////con formato///////////////////////////////////////////////////
        LocalDate fecha1 = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaConFormato = fecha1.format(formato);
        System.out.println(fechaConFormato);

    }

}
