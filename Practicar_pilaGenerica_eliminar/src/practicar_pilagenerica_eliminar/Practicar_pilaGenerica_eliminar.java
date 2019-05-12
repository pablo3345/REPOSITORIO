/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicar_pilagenerica_eliminar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pablo
 */
public class Practicar_pilaGenerica_eliminar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pila<String> pilaDeString = new Pila<>(new String[3]);
        Pila<Empleado> pilaDeEmpleado = new Pila<>(new Empleado[4]);
        
        //ahora agregamos elementos a la pila
        
        pilaDeString.agregarElemento("hola mundo");
        pilaDeString.agregarElemento("hola marte");
        pilaDeString.agregarElemento("hola jupiter");
        
        //ahora le quitamos un elemento
        
        String stringQuitado = pilaDeString.quitarElemento();
        
        System.out.println("el elemento quitado fue: "+stringQuitado);
        
        pilaDeEmpleado.agregarElemento(new Empleado("Juan"));
        pilaDeEmpleado.agregarElemento(new Empleado("Rocio"));
        
        Empleado empleadoQuitado = pilaDeEmpleado.quitarElemento();
        
        System.out.println("el empleado quitado es "+empleadoQuitado);
        
        
        pilaDeString.mostrarArreglo();
                

      
       
            
            
       
     
    
       
        
                 
         
       
       
       
       
       
    }
    
   

}
