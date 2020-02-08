/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos_eliminar;

import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class GenericosClase <E> {
    
    private E nombre;
    private E anios;
    private E direccion;

    public GenericosClase(E nombre, E anios, E direccion) {
        this.nombre = nombre;
        this.anios = anios;
        this.direccion = direccion;
    }
    

   
    
    public void mostrarDatos(){
        System.out.println("el nombre es "+nombre + "los años son "+anios + "la direccion es "+direccion);
    
    }
    
    public void ifCondicional(){
    
        if((Integer)anios >41){
            JOptionPane.showMessageDialog(null,nombre+" "+ "eres un viejo");
        }
        else
            JOptionPane.showMessageDialog(null, nombre +" "+"eres joven tienes menor de 41");
    
    }
    
    public void buscarLetra(){
    String nombre1 = (String) nombre;
        if(nombre1.contains("s")){
        JOptionPane.showMessageDialog(null, "El nombre contiene s "+nombre1);
        
        }
        else{
        JOptionPane.showMessageDialog(null, "el nombre no contiene s "+nombre1);
        
        
        }
        
      
  
    
    
    }
    
    
    public void cantidadDeCaracteres(){
    String nombreCaracteres = (String) nombre;
    
    if(nombreCaracteres.length()==4){
    JOptionPane.showMessageDialog(null, nombreCaracteres + " este nombre tiene 4 caracteres");
    
    
    
    }
    else
        JOptionPane.showMessageDialog(null, nombreCaracteres +  " este nombre NO tiene 4 caracteres");
    
    
    }
    
    
    
    
    
  
    
  
    
    
  
    
    
    
    
    
 
    
   
    

    
}
