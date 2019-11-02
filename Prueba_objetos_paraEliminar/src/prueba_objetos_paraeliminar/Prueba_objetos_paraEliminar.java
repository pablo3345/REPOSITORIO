/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_objetos_paraeliminar;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Prueba_objetos_paraEliminar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // TODO code application logic here
        Cuerpo cuerpo = new Cuerpo(1.82, 80);
        Cuerpo cuerpo1 = new Cuerpo(1.73, 75);
        Fecha fecha = new Fecha(5, 10, 2014);
        TipoDeDeporte tipoDeDeporte = new TipoDeDeporte("futbol");
        Persona persona = new Persona("Pablo", 28, cuerpo, fecha, tipoDeDeporte);
        String palabra = "Graciela";
        boolean mostrar = false;
        mostrarInformacion(persona);
        int capacidadMaxima = 70;
        int indiceAuxiliar = 0;
        ArrayList<Cuerpo> arrayCuerpo = new ArrayList<>();
        arrayCuerpo.add(cuerpo);
        arrayCuerpo.add(cuerpo1);
        centinela();
        multiplicar();
        prueba();

        mostrarArrayCuerpo(arrayCuerpo);

        int[] bancos = new int[3];
        String aulas[] = new String[3];

        bancos[0] = 30;
        bancos[1] = 35;
        bancos[2] = 40;

        aulas[0] = "valentino";
        aulas[1] = "Graciela";
        aulas[2] = "Pablo";

        try {

            System.out.println("ingrese los inscriptos");
            int inscriptos = entrada.nextInt();

            for (int i = 0; i < 3; i++) {

                if (bancos[i] >= inscriptos && capacidadMaxima >= bancos[i]) {

                    capacidadMaxima = bancos[i];
                    indiceAuxiliar = i;

                } else if (inscriptos > 40) {
                    System.out.println("numero mayor a 40");
                    System.exit(0);

                }

            }
        } catch (RuntimeException e) {
            System.out.println("debe ingresar un numero");
            System.out.println(e.getMessage());
            System.exit(0);
        }

        System.out.println(indiceAuxiliar);

        System.out.println(palabra.length());

    }

    private static void mostrarInformacion(Persona persona) {
        Cuerpo cuerpo = persona.getCuerpoDeLaPersona();

        System.out.println(cuerpo.getAltura());

        Fecha fecha = persona.getInicioDeDeporte();

        System.out.println(fecha.getAño());

        TipoDeDeporte tipoDeDeporte = persona.getTipoDeDeporte();

        System.out.println(tipoDeDeporte.getNombre());

    }

    private static void mostrarArrayCuerpo(ArrayList<Cuerpo> arrayCuerpo) {
        String mensaje = "";
        for (Cuerpo cuerpos : arrayCuerpo) {

            mensaje += cuerpos.getPeso() + " " + cuerpos.getAltura() + "\n";

        }
        System.out.println(mensaje);
        //vamos a traer el ultimo elemento del arrayList

        System.out.println(arrayCuerpo.get(arrayCuerpo.size() - 1).getAltura());
       

    }

    private static void centinela() {
        Scanner entrada = new Scanner(System.in);
        int sueldo = 0;
        double total =1;
        double total2=0;

        while (sueldo != -1) {

            System.out.println("ingrese un sueldo");
            sueldo = entrada.nextInt();
                total += sueldo;
        }
       

        System.out.println(total);
        total2 = total *0.05;
        System.out.println(total-total2);
        
        

    }
    
    private static void multiplicar(){
        Scanner entrada = new Scanner(System.in);
    
    int numero =0;
    int multiplicar = 0;
    int total =0;
    
        System.out.println("ingrese el numero a multiplicar");
        numero = entrada.nextInt();
        
        System.out.println("ingrese el multiplicador");
        multiplicar = entrada.nextInt();
        
        for(int i =1; i<= multiplicar; i++){
            total = numero*i;
            
            System.out.println(numero +"x" + i +"=" +total);
            
          
        
        
        }
    
    
    }
    
    private static void prueba(){
        String nombre = "Pablooo";
        
        System.out.println(nombre.length());
    
    
    
    
    }

}
