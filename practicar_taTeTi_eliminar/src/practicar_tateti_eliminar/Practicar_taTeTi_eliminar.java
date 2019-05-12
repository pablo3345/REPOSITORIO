/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicar_tateti_eliminar;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class Practicar_taTeTi_eliminar {

//    private static char UNO = '1';
//    private static char LIMPIAR = ' ';
    
    private static <E> E metodoGenerico(E primerParametro, E segundoParametro){
        
        if(primerParametro.equals(segundoParametro)){
       return primerParametro;
        
        
        
        }
        else
            return segundoParametro;
    
    
    
    }

//   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println(metodoGenerico("hola", "chau"));
        System.out.println(metodoGenerico(5, 6));
        System.out.println(metodoGenerico(100,  "hola soy pablo y soy programador me fascina, me encanta"));
//        Scanner entrada = new Scanner(System.in);
//        char arreglo[][] = new char[3][3];
////        int numeros[][] = {
////            {14, 254, 147},
////            {5, 25, 36},
////            {1024, 125, 36}
////        };
//        int filaA, columnaC;
//
//        boolean hay_ganador = false;
//        limpiarTablero(arreglo);
//        try {
//              while (hay_ganador == false) {
//           
//            System.out.println("ingrese la fila");
//            filaA = entrada.nextInt();
//            System.out.println("ingrese la columna");
//            columnaC = entrada.nextInt();
//          
//              arreglo[filaA][columnaC] = UNO;
//
//                
//           
//         
//            
//                  mostrarTablero(arreglo);
//        
//           
//           
//
//        }
//            
//        } catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//            System.out.println("opcion incorrecta");
//        }
//      
//
//    }
//
//    private static void limpiarTablero(char arreglo[][]) {
//        for (int fila = 0; fila < 3; fila++) {
//            for (int columna = 0; columna < 3; columna++) {
//
//                arreglo[fila][columna] = LIMPIAR;
//
//            }
//
//        }
//
//    }
//
//    private static void mostrarTablero(char arreglo[][]) {
//        for (int fila = 0; fila < 3; fila++) {
//            for (int columna = 0; columna < 3; columna++) {
//                System.out.print("│" + arreglo[fila][columna]);
//
//            }
//            System.out.println("│");
//
//        }
//        ArrayList<Integer> delas = new ArrayList<>();
//
//        delas.add(2);
//        delas.add(256);
//        delas.add(1024);
//        delas.add(457);
//
//        System.out.println(delas.get(delas.size() - 1));
//       
//
//    }
//        for (int fila = 0; fila < 3; fila++) {
//
//            for (int columna = 0; columna < 3; columna++) {
//                System.out.printf("El valor de la fila %d columna %d es %d\n", fila, columna, numeros[fila][columna]);
//            }
//
//           
//        }

//        for (int fila = 0; fila < 3; fila++) {
//
//            for (int columna = 0; columna < 3; columna++) {
////                System.out.print(arreglo[fila][columna]+" ");
//                System.out.printf("El valor de la fila %d columna %d es %d\n", fila, columna, arreglo[fila][columna]);
//            }
//
//        }
    }

}
