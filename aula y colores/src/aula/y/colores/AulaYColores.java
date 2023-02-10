/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.y.colores;

import java.util.*;

/**
 *
 * @author Administrador
 */
public class AulaYColores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int indiceAux = 0;

        int inscriptos;
        int capacidadMax = 40;

        String[] color = new String[3];

        color[0] = "azul";
        color[1] = "verde";
        color[2] = "amarillo";
        int[] bancos = new int[3];

        bancos[0] = 40;
        bancos[1] = 35;
        bancos[2] = 30;

        System.out.println("ingrese la cantidad de alumnos");
        inscriptos = entrada.nextInt();

        for (int i = 0; i <= 2; i++) {
            if (inscriptos <= bancos[i] && capacidadMax >= bancos[i]) {
                capacidadMax = bancos[i];
                indiceAux = i;

            }
            

        }
        System.out.println("el aula corresondiente es " + color[indiceAux]);

    }
}
