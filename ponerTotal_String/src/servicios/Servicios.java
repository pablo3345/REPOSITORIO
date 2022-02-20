/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import modelo.TotalString;
import repositorio.Repositorio;

/**
 *
 * @author pablo
 */
public class Servicios {
    
    private Repositorio repositorio;

    public Servicios() {
        this.repositorio = new Repositorio();
    }
    
    
    

    public void guardar(String total) {
        
       // this.validarTotal(total);
        TotalString modeloString = new TotalString(total);
        this.repositorio.guardarTotal(modeloString);
       
    }
    
    
    
//     private void validarTotal(String total) {
//       if(total.length()==0){
//       throw new IllegalArgumentException("debe completar el nombre");
//       }
//    }

  
}
