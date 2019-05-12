/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.ArrayList;
import modelo.Compra;
import repositorio.RepositorioCompra;

/**
 *
 * @author pablo
 */
public class ServicioCompra {
    
    private RepositorioCompra repositorioCompra;

    public ServicioCompra() {
        this.repositorioCompra = new RepositorioCompra();
    }
    
    

    public void guardarCompra(String montoTotal, java.sql.Timestamp fechaRegistrada, String proveedor) {

        double montoTotalConvertido = this.validarMontoTotal(montoTotal);
        this.validarProveedor(proveedor);

        Compra compra = new Compra(montoTotalConvertido, fechaRegistrada, proveedor);
        
        this.repositorioCompra.guardar(compra);

    }

    private double validarMontoTotal(String montoTotal) {

        try {
            double montoTotalParseado = Double.parseDouble(montoTotal);

            if (montoTotalParseado <= 0) {
                throw new IllegalArgumentException("monto total vacio");

            }

            return montoTotalParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("monto total equivocado");
        }

    }
    
    private void validarProveedor(String proveedor){
        
        if(proveedor.length() == 0){
        throw new IllegalArgumentException("el proveedor es vacio");
        
        
        }
    
   
    
    
    }
    
    public ArrayList<Compra> obtenerTodosCompra(){
        
        ArrayList<Compra> compras = (ArrayList<Compra>) this.repositorioCompra.obtenerTodosCompra();
        
        return compras;
    
    
    
    }

}
