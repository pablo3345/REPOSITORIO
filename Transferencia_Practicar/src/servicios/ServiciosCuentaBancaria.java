/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import modelo.Cuentabancaria;
import repositorio.RepositorioCuentaBancaria;

/**
 *
 * @author pablo
 */
public class ServiciosCuentaBancaria {
    
    private RepositorioCuentaBancaria repositorioCuentaBancaria;

    public ServiciosCuentaBancaria() {
        this.repositorioCuentaBancaria =new  RepositorioCuentaBancaria();
    }
    
    

    public void guardarCuenta(String nombre, String apellido, String dni, String saldo) {
        this.validarDni(dni);
        double saldoConvertido =this.validarSaldo(saldo);
        
        Cuentabancaria cuentabancaria = new Cuentabancaria(nombre, apellido, dni, saldoConvertido);
        
        this.repositorioCuentaBancaria.guardarCuenta(cuentabancaria);
        
        
       
    }

    
    

private void validarDni(String dni){
    try {
        int dniParseado =0;
         dniParseado =Integer.valueOf(dni);
        
    } catch (NumberFormatException e) {
        throw new IllegalArgumentException("dni incorrecto");
    }


 


}

private double validarSaldo(String saldo){
    
    try {
        double saldoParseado = Double.valueOf(saldo);
        return saldoParseado;
    } catch (NumberFormatException e) {
        throw new IllegalArgumentException("saldo incorrecto");
    }



}

public ArrayList<Cuentabancaria> obtenerTodos(){

ArrayList<Cuentabancaria> obtenerTodo = this.repositorioCuentaBancaria.obtenerTodos();

return obtenerTodo;



}

   
    
    
    
    
    
    
    
    
 
    
}
