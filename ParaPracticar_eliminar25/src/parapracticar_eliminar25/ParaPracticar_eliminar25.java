/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parapracticar_eliminar25;

import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class ParaPracticar_eliminar25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        // TODO code application logic here
        
         int auxiliar2 =40;
            int indice =0;
            int indice2=0;
            int auxiliar3=0;
            boolean esta = false;
            int auxiliar4=0;
        
        
        int[] numeros = new int[12];
        
        numeros[0] =5;
        numeros[1] =12;
        numeros[2] =33;
        numeros[3] =0;
        numeros[4] =55;
        numeros[5] =66;
        numeros[6] =8;
        numeros[7] =10;
        numeros[8] =21;
        numeros[9] =66;
        numeros[10] =6;
        numeros[11] =1;
       
    
        int[] arrayAux = new int[12];
    
      
        
           
            for(int i =0; i<12; i++){
                arrayAux[i]=numeros[i];
              
                for(int j=0; j<i; j++){
                   
                    if(arrayAux[i]==numeros[j]){
                       System.out.println("el numero repetido es "+ numeros[j]); 
                
                
             
                    }
                            
                
      
               
                
                
            }
         
         
              
            
                } 
                
                
    }
    
    
}
