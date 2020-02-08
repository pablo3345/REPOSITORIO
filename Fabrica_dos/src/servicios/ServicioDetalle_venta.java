/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import modelo.DetalleVenta;
import modelo.Fabrica;
import modelo.Repuesto;
import repositorio.RepositorioDetalle_venta;

/**
 *
 * @author pablo
 */
public class ServicioDetalle_venta {

    private RepositorioDetalle_venta repositorioDetalle_venta;

    public ServicioDetalle_venta() {
        this.repositorioDetalle_venta = new RepositorioDetalle_venta();
    }

    public void guardarComprobante(Fabrica fabrica, Repuesto repuesto, String cantidad, String precioConIva, String total, String totalAPagar) {
        
        int cantidadConvertida = this.validarCantidad(cantidad);
        double precioConIvaConvertido =this.validarPrecioConIva(precioConIva);
        double totalConvertido = this.validarTotal(total);
        double totalAPagarConvertido = this.validarTotalApagar(totalAPagar);
        
        
      
        
        DetalleVenta detalleVenta = new DetalleVenta(fabrica, repuesto, cantidadConvertida, precioConIvaConvertido, totalConvertido, totalAPagarConvertido);
        
        this.repositorioDetalle_venta.guardar(detalleVenta);
        
        

    }
    
    
    private int validarCantidad(String cantidad){
        
        try {
            int cantidadParseada = Integer.valueOf(cantidad);
            
            return cantidadParseada;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("cantidad incorrecta");
        }
    
    
    
    
    
    }
    
    private double validarPrecioConIva(String precioConIva){
        
        try {
            double precioConIvaParseado = Double.valueOf(precioConIva);
            return precioConIvaParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("precio con iva equivocado");
        }
    
    
    
    
    
    }
    
    private double validarTotal(String total){
        
        try {
            double totalParseado = Double.valueOf(total);
            return totalParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("total equivocado");
            
        }
    
    
    
    
    
    }
    
    private double validarTotalApagar(String totalAPagar){
        
        try {
            
            double totalAPagarParseado = Double.parseDouble(totalAPagar);
        
            
         
            return totalAPagarParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("total a pagar equivocado, si no completa el total a pagar ahora ingrese cero");
        }
      
    
    
    
    
    }

    public Fabrica obtenerFabrica(int idFabrica) {

        Fabrica fabrica = this.repositorioDetalle_venta.obtenerFabricaGuardada(idFabrica);

        return fabrica;

    }
    
    
       public ArrayList<Double> obtenerConsulta(){
    
    ArrayList<Double> delas8 =  (ArrayList<Double>) this.repositorioDetalle_venta.obtenerConsulta();
    
   
    
    return delas8;
    
    
    
    
    
    
    
    
    }
    
 

}
