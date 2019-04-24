/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicar_tateti_eliminar;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Practicar_taTeTi_eliminar {

    static final char UNO = '1';
    static final char LIMPIAR = ' ';

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char arreglo[][] = new char[3][3];
        int filaA, columnaC;
       

        boolean hay_ganador = false;
         limpiarTablero(arreglo);

        while (hay_ganador == false) {
            

            System.out.println("ingrese la fila");
            filaA = entrada.nextInt();
            System.out.println("ingrese la columna");
            columnaC = entrada.nextInt();
            arreglo[filaA][columnaC] = UNO;
            mostrarTablero(arreglo);

        }

    }

    private static void limpiarTablero(char arreglo[][]) {
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {

                arreglo[fila][columna] = LIMPIAR;

               

            }

        }

    }
    
    private static void mostrarTablero(char arreglo[][]){
    for(int fila =0; fila<3; fila ++){
    for(int columna =0; columna <3 ; columna++){
         System.out.print("│" + arreglo[fila][columna]);
    
    
    
    
    }
        System.out.println("│");
    
    
    }
    
    
    }

}
