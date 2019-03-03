/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;


import java.util.List;
import modelo.Compra;
import modelo.Proveedor;
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
    
    public void guardarCompra(Proveedor proveedor, String montoTotal, java.sql.Timestamp fecha){
        double montoTotalConvertido = this.validarMontoTootal(montoTotal);
        
        Compra compra = new Compra(proveedor, montoTotalConvertido, fecha);
        
        this.repositorioCompra.guardarCompra(compra);
    
    
    
    }
    
    private double validarMontoTootal(String montoTotal){
    
        try {
            double montoTotalParseado = Double.parseDouble(montoTotal);
            return montoTotalParseado;
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("monto total incorrecto");
        }
    
    
    
    }
    
    public List<Compra> obtenerCompra(){
        List<Compra> compras = this.repositorioCompra.obtenerTodosCompra();
        return compras;
    
    
    
    
    }
    
   
    
    
    
    
}
