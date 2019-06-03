/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Contrato;
import modelo.Puesto;
import repositorio.RepositorioContrato;

/**
 *
 * @author pablo
 */
public class ServicioContrato {
    private RepositorioContrato repositorioContrato;

    public ServicioContrato() {
        this.repositorioContrato = new RepositorioContrato();
    }
    
    
    
    
    
   

    public void guardarContrato(Cliente cliente,
            Puesto puesto,
            int diaInicio,
            int mesInicio,
            int añoInicio,
            int diaFin,
            int mesFin,
            int añoFin,
              String monto,
            String fechaDeCancelacion,
             String encargadoDelAlquiler)
            {
        
//        this.validarFechaDeCancelacion(fechaDeCancelacion);
        double montoConvertido = this.validarMonto(monto);
        
        Contrato contrato = new Contrato(cliente, puesto, diaInicio, mesInicio, añoInicio, diaFin, mesFin, añoFin, fechaDeCancelacion, montoConvertido, encargadoDelAlquiler);
       this.repositorioContrato.guardarContrato(contrato);
    }
    
    
//    private void validarFechaDeCancelacion(String fechaDeCancelacion){
//    if(fechaDeCancelacion.length() ==0){
//    throw new IllegalArgumentException("la fecha de cancelacion es vacia");
//    
//    }
//    
//    
//    }
    
    private double validarMonto(String monto){
   
    
        try {
             double montoParseado = Double.parseDouble(monto);
             if(montoParseado <= 0){
             throw new IllegalArgumentException("monto vacio");
             
            
             
             }
              return montoParseado;
            
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("monto incorrecto");
        }
    
    }
    
    public ArrayList<Contrato> obtenerTodosContrato(){
    
    ArrayList<Contrato> contratos = this.repositorioContrato.obtenerTodos();
    
    return contratos;
    
    
    
    }

    public void eliminarContrato(Contrato contrato) {
       this.repositorioContrato.eliminarContrato(contrato);
    }
    
   
    
}
