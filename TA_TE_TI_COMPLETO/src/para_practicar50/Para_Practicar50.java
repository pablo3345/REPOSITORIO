/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package para_practicar50;

import com.sun.javafx.css.SizeUnits;
import com.sun.org.apache.bcel.internal.generic.SWAP;
import com.sun.org.apache.xalan.internal.xsltc.compiler.NodeTest;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.awt.PageAttributes;
import java.util.Scanner;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.parser.TokenType;
import sun.swing.MenuItemLayoutHelper;

/**
 *
 * @author pablo
 */
public class Para_Practicar50 {

    static final char PRIMERO = 'x';
    static final char VACIO = ' ';
    static final char SEGUNDO = 'o';

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int fila = 0;
        int columna = 0;
        boolean esGanador = false;
        boolean sw = false;
        int contador = 0;
        boolean sinRepetir = false;
        int numero = 0;
        boolean sinRepetir2 = false;

        char array[][] = new char[3][3];
        String x = " ";
        // mostrar_tablero(array);
        limpiarTablero(array);
        try {

            do {

                sw = esGanador;

                mostrar_tablero(array);

                // System.out.println("ingrese el jugador x");
                System.out.println("ingrese la fila");
                // fila = entrada.nextInt();
                System.out.println("JUGADOR X");
                fila = Integer.parseInt(JOptionPane.showInputDialog("ingrese la fila del-------- JUGADOR X--------"));

                columna = Integer.parseInt(JOptionPane.showInputDialog("ingrese la columna del-------- JUGADOR X--------"));

                mostrar_tablero(array);
                if ( array[fila - 1][columna - 1] == VACIO) {
                     array[fila - 1][columna - 1] = PRIMERO;
                    
                }
                else{
                       do {
                             System.out.println("--------casillero ocupado----------");
                        fila = Integer.parseInt(JOptionPane.showInputDialog("ingrese la fila del-------- JUGADOR X--------"));

                        columna = Integer.parseInt(JOptionPane.showInputDialog("ingrese la columna del-------- JUGADOR X--------"));
                           mostrar_tablero(array);
                         
                        
                        
                    } while ( array[fila - 1][columna - 1] == PRIMERO ||  array[fila - 1][columna - 1] == SEGUNDO);
                     array[fila - 1][columna - 1] = PRIMERO;
                     mostrar_tablero(array);
                    
                }
                
                
                
          

//
//                switch (array[fila - 1][columna - 1]) {
//                    case VACIO:
//
//                        array[fila - 1][columna - 1] = PRIMERO;
//
//                        break;
//                    case PRIMERO:
//
//                        System.out.println("--------casillero ocupado----------");
//                        do {
//                            fila = Integer.parseInt(JOptionPane.showInputDialog("ingrese la fila del-------- JUGADOR X--------"));
//
//                            columna = Integer.parseInt(JOptionPane.showInputDialog("ingrese la columna del-------- JUGADOR X--------"));
//
//                          
//                        } while (array[fila - 1][columna - 1] == PRIMERO || array[fila - 1][columna - 1] == SEGUNDO);
//
//                        array[fila - 1][columna - 1] = PRIMERO;
//                      
//
//                        break;
//                    case SEGUNDO:
//                         System.out.println("--------casillero ocupado----------");
//                        do { 
//                              fila = Integer.parseInt(JOptionPane.showInputDialog("ingrese la fila del-------- JUGADOR X--------"));
//
//                            columna = Integer.parseInt(JOptionPane.showInputDialog("ingrese la columna del-------- JUGADOR X--------"));
//                            
//                        } while (array[fila - 1][columna - 1] == SEGUNDO || array[fila - 1][columna - 1] == PRIMERO);
//                        
//                         array[fila - 1][columna - 1] = PRIMERO;
//                       
//                        break;
//                    default:
//
//                        break;
//                }

                if (esGanadorr(array, sw, PRIMERO, SEGUNDO) == true) {
                    System.out.println("ha ganado el jugador x");

                    break;

                }
                mostrar_tablero(array);
                contador++;

//                if (contador == 13) {
//                    System.out.println("hubo empate");
//
//                    break;
//                }

                 empate(array);

                 System.out.println("ingrese el jugador o");
                // System.out.println("ingrese la fila");
                System.out.println("JUGADOR O");

                fila = Integer.parseInt(JOptionPane.showInputDialog("ingrese la fila del-------- JUGADOR O--------"));
                // fila = entrada.nextInt();
                //System.out.println("ingrese la columna");
                //columna = entrada.nextInt();
                columna = Integer.parseInt(JOptionPane.showInputDialog("ingrese la columna del-------- JUGADOR O--------"));
                
                 if ( array[fila - 1][columna - 1] == VACIO) {
                     array[fila - 1][columna - 1] = SEGUNDO;
                    
                }
                else{
                       do {
                             System.out.println("--------casillero ocupado----------");
                        fila = Integer.parseInt(JOptionPane.showInputDialog("ingrese la fila del-------- JUGADOR O--------"));

                columna = Integer.parseInt(JOptionPane.showInputDialog("ingrese la columna del-------- JUGADOR O--------"));
                           mostrar_tablero(array);
                         
                        
                    } while ( array[fila - 1][columna - 1] == PRIMERO ||  array[fila - 1][columna - 1] == SEGUNDO);
                     array[fila - 1][columna - 1] = SEGUNDO;
                     mostrar_tablero(array);
                    
                }
                

//                switch (array[fila - 1][columna - 1]) {
//                    case VACIO:
//                        array[fila - 1][columna - 1] = SEGUNDO;
//                        mostrar_tablero(array);
//                        break;
//                    case PRIMERO:
//                         System.out.println("-------casillero ocupado----------");
//                        do {
//                           
//                            fila = Integer.parseInt(JOptionPane.showInputDialog("ingrese la fila del-------- JUGADOR O--------"));
//                            
//                            columna = Integer.parseInt(JOptionPane.showInputDialog("ingrese la columna del-------- JUGADOR O--------"));
//                            
//                        } while (array[fila-1][columna-1]== PRIMERO || array[fila - 1][columna - 1] == SEGUNDO);
//                        array[fila-1][columna-1]= SEGUNDO;
//                      
//                        break;
//                    case SEGUNDO:
//                         System.out.println("--------casillero ocupado----------");
//                        do {
//                           
//                            fila = Integer.parseInt(JOptionPane.showInputDialog("ingrese la fila del-------- JUGADOR O--------"));
//                            
//                            columna = Integer.parseInt(JOptionPane.showInputDialog("ingrese la columna del-------- JUGADOR O--------"));
//                            
//                        } while (array[fila-1][columna-1]== SEGUNDO || array[fila - 1][columna - 1] == PRIMERO);
//                        array[fila-1][columna-1]= SEGUNDO;
//                      
//                        break;
//                    default:
//                        break;
//                }
//                
                

                if (esGanadorr(array, sw, PRIMERO, SEGUNDO) == true) {
                    System.out.println("ha ganado el jugador o");
                 

                   break;

                }

                contador++;

//                if (contador == 13) {
//                    System.out.println("hubo empate");
//
//                    break;
//
//                }
                empate(array);

                contador++;

            } while (sw == false);

        } catch (RuntimeException e) {
            System.out.println("OPCION INGRESADA INCORRECTA... INTENTALO NUEVAMENTE!!!");
            
        }

    }

    private static void mostrar_tablero(char array[][]) {

        for (int fila = 0; fila < 3; fila++) {

            for (int columna = 0; columna < 3; columna++) {

                System.out.print("│" + array[fila][columna]);

            }

            System.out.println("│");

        }
        System.out.println(" ");

    }

    private static void limpiarTablero(char arreglo[][]) {
        int fila, columna;
        for (fila = 0; fila <= 2; fila++) {
            for (columna = 0; columna <= 2; columna++) {

                arreglo[fila][columna] = VACIO; // limpio el tablero sin caracteres

            }

        }
    }

    private static boolean esGanadorr(char array[][], boolean sw, char PRIMERO, char SEGUNDO) {

        if (array[0][0] == PRIMERO && array[0][1] == PRIMERO && array[0][2] == PRIMERO) {
            // System.out.println("ha ganado el jugador x FELICITACIONES!!!!!");
            sw = true;
        }
        else if (array[1][0] == PRIMERO && array[1][1] == PRIMERO && array[1][2] == PRIMERO) {
            sw= true;
            
        }
        else if (array[2][0] == PRIMERO && array[2][1] == PRIMERO && array[2][2] == PRIMERO) {
            sw = true;
            
        }
        
        else if (array[2][0] == SEGUNDO && array[2][1] == SEGUNDO && array[2][2] == SEGUNDO) {

            sw = true;
            
            
        }
        else if (array[0][0] == SEGUNDO && array[0][1] == SEGUNDO && array[2][2] == SEGUNDO) {
            sw = true;
            
        }
        
        else if (array[1][0] == SEGUNDO && array[1][1] == SEGUNDO && array[1][2] == SEGUNDO) {
            sw = true;
            
        }
        
        // diagonales
        
        else if (array[0][0] == SEGUNDO && array[1][1] == SEGUNDO && array[2][2] == SEGUNDO) {
            sw = true;
        }
        
        else if (array[0][2] == SEGUNDO && array[1][1] == SEGUNDO && array[2][0] == SEGUNDO) {
            sw = true;
        }
        
        
         else if (array[0][0] == PRIMERO && array[1][1] == PRIMERO && array[2][2] == PRIMERO) {
            sw = true;
        }
        
        else if (array[0][2] == PRIMERO && array[1][1] == PRIMERO && array[2][0] == PRIMERO) {
            sw = true;
        }
        mostrar_tablero(array);

        return sw;

    }
    
    private static void empate(char array[][]){
    
        if (array[0][0] != VACIO && array[0][1] != VACIO && array[0][2] != VACIO && array[1][0] != VACIO && array[1][1] != VACIO && array[1][2] != VACIO &&
               array[2][0] != VACIO && array[2][1] != VACIO && array[2][2] != VACIO) {
            System.out.println("Hubo empate!!!...");
            
             System.exit(0);
        }
        
        
        
    
    }

}
