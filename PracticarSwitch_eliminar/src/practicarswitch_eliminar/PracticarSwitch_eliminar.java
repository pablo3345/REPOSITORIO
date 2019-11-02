/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicarswitch_eliminar;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class PracticarSwitch_eliminar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//        String nombre = "";
//        int edad = 0;
//        String apellido = "";
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Ingrese 1] Nombre, 2] Apellido, 3] Edad, 4] Salir");
//            int opcion = entrada.nextInt();
//
//            switch (opcion) {
//                case 1:
//                    System.out.println("ingrese el nombre");
//                    nombre = entrada.next();
//                    if(nombre.equals("Pablo")){
//                        System.out.println("Pablo eres un genio");
//                    
//                    }
//                    break;
//
//                case 2:
//                    System.out.println("ingrese el apellido");
//                    apellido = entrada.next();
//                    break;
//
//                case 3:
//
//                    System.out.println("ingrese la edad");
//                    edad = entrada.nextInt();
//                    break;
//                case 4:
//
//                    System.exit(0);
//
//            }
//
//        }
//        System.out.println("el nombre es " + nombre + " el apellido es " + apellido + " la edad es " + edad);
        int capacidadMaxima = 60;
        int indiceAuxiliar = 0;
        String[] colores = new String[3];
        colores[2] = "amarillo";
        colores[1] = "verde";
        colores[0] = "azul";
        
        int[] bancos = new int[3];
        bancos[2] = 30;
        bancos[1] = 35;
        bancos[0] = 40;
        
        
        System.out.println("ingrese los inscriptos");
        int inscriptos = entrada.nextInt();
        
        for (int i = 0; i <= 2; i++) {
            if (bancos[i] >= inscriptos && capacidadMaxima >= bancos[i]) {
                capacidadMaxima = bancos[i];
                indiceAuxiliar = i;
                
            }
           
              
           
            
        }
        System.out.println("el aula correspondiente es " + colores[indiceAuxiliar]);
        
    }
    
}
