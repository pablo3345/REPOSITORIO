/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package para_practicar;

import java.util.InputMismatchException;
import java.util.Scanner;
import javafx.application.Platform;

/**
 *
 * @author pablo
 */
public class While_con_Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[2];
        int auxiliar;
        int posicion;

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("ingrese los valores");
            numeros[i] = entrada.nextInt();

        }
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {

                if (numeros[j] > numeros[j + 1]) {
                    auxiliar = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = auxiliar;

                }

            }

        }

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("los valores son " + numeros[i]);
        }
        int total = 0;
        int a = 0;
        int b = 0;

        while (true) {
            Scanner entrada1 = new Scanner(System.in);

            try {

                System.out.println("ingrese el primer numero a dividir");
                a = entrada1.nextInt();
                System.out.println("ingrese el segundo numero a dividir");
                b = entrada1.nextInt();

                total = a / b;

                break;

            } catch (InputMismatchException e) {
                System.out.println("numero incorrecto, Intentele nuevamente");

            } catch (RuntimeException d) {
                System.out.println("no se puede dividir por cero, Intentelo nuevamente");

            }

        }

        System.out.println(total);

    }

}
