/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.ArrayList;
import modelo.Vendedor;
import repositorio.RepositorVendedor;

/**
 *
 * @author pablo
 */
public class ServicioVendedor {
    private RepositorVendedor repositorVendedor;

    public ServicioVendedor() {
        this.repositorVendedor = new RepositorVendedor();
    }
    
    public void guardarVendedor(String nombre, String apellido, String edad, String sueldo){
        int edadConvertido = this.validarEdad(edad);
        double sueldoConvertido = this.validarSueldo(sueldo);
        
        Vendedor vendedor = new Vendedor(nombre, apellido, edadConvertido, sueldoConvertido);
        
        this.repositorVendedor.guardar(vendedor);
        
    
    
    
    
    }
    
    private int validarEdad(String edad){
    
        try {
            int edadParseado = Integer.parseInt(edad);
            return edadParseado;
        } catch (NumberFormatException e) {
             throw new IllegalArgumentException("la edad es incorrecta");
        }
    
    }
    
    private double validarSueldo(String sueldo){
    
        try {
            double sueldoParseado = Double.parseDouble(sueldo);
            return  sueldoParseado;
        } catch (NumberFormatException e) {
             throw new IllegalArgumentException("El sueldo es incorrecto");
        }
    
    
    }
    
   public ArrayList<Vendedor> mostrarVendedor(){
   
   ArrayList<Vendedor> mostrarVendedor = this.repositorVendedor.obtenerTodos();
   
   return mostrarVendedor;
   
   
   }
    
    

    
    
    
    
}
