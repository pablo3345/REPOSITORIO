/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import javax.swing.JOptionPane;
import modelo.Mesa;
import repositorio.RepositorioMesa;

/**
 *
 * @author pablo
 */
public class ServicioMesa {
    
    private RepositorioMesa repositorioMesa;

    public ServicioMesa() {
        this.repositorioMesa = new RepositorioMesa();
    }

 

    public void guardarMesa(String numero, String estado) {
        this.validarNumero(numero);
        this.validarNumero2(numero);
       Mesa mesa = new Mesa(numero, estado);
       
       this.repositorioMesa.guardarMesa(mesa);
       
       
    }
    
    
    
    private void validarNumero(String numero){
        
        if(numero.length()==0){
        throw new IllegalArgumentException("numero de la mesa vacio");
        
        
        
        }
    
    
    
    
    }
    
    private void validarNumero2(String numero){
    
        try {
            int numeroParseado = Integer.valueOf(numero);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("numero equivocado");
        }
    
    
    }

   
    
}
