/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import Repositorio.RepositorioEmpresa;
import javax.swing.ButtonModel;
import modelo.Empresa;

/**
 *
 * @author pablo
 */
public class ServicioEmpresa {
    private RepositorioEmpresa repositorioEmpresa;

    public ServicioEmpresa() {
        this.repositorioEmpresa =new RepositorioEmpresa();
    }
    
    
    
    public void guardarEmpresa(String nombre,  String pais){
        this.validarNombre(nombre);
       
        
        Empresa empresa = new Empresa(nombre, pais);
        
        this.repositorioEmpresa.guardar(empresa);
    
    
    
    
    }
    
    private void validarNombre(String nombre){
        if(nombre.length() == 0){
        throw new IllegalArgumentException("el nombre es vacio");
        
        }
    
    
    }
    
   

  

   
    
}
