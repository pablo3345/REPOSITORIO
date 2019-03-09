/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.CompraProducto;
import modelo.Producto;
import repositorio.RepositorioProducto;

/**
 *
 * @author pablo
 */
public class ServicioProducto {
    
    private RepositorioProducto repositorioProducto;

    public ServicioProducto() {
        this.repositorioProducto =  new RepositorioProducto();
    }
    
    public void guardarProducto(String nombre, String costo, String ganancia, String stockMinimo, String stockActual, String tipo){
        double costoConvertido = this.validarCosto(costo);
        double gananciaConvertida = this.validarGanancia(ganancia);
        int stockMinimoConvertido = this.validarStockMinimo(stockMinimo);
        int stockActtualParseado = this.validarStockActual(stockActual);
        Producto producto = new Producto(nombre,costoConvertido, gananciaConvertida, stockMinimoConvertido, stockActtualParseado, tipo);
        
        this.repositorioProducto.guardarProducto(producto);
    
    
    
    }
    
    private double validarCosto(String costo){
    
        try {
            double costoParseado = Double.parseDouble(costo);
            return costoParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("costo incorrecto");
        }
    
    
    
    }
    
    private double validarGanancia(String ganancia){
        
        try {
            double gananciaParseada = Double.parseDouble(ganancia);
            return gananciaParseada;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("ganancia incorrecta");
        }
    
    
    }
    
    private int validarStockMinimo(String stockMinimo){
        
        try {
            int stockMinimoParseado = Integer.parseInt(stockMinimo);
            return stockMinimoParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("stock minimo incorrecto");
        }
    
    
    
    
    }
    
    private int validarStockActual(String stockactual){
        try {
            int stockActualConvertido = Integer.parseInt(stockactual);
            return stockActualConvertido;
        } catch (IllegalArgumentException e) {
           throw new IllegalArgumentException("stock actual incorrecto");
        }
    
    
    
    
    }
    
    public List<Producto> obtenerProductos(){
        List<Producto> productos = this.repositorioProducto.obtenerTodosProductos();
        return productos;
    
    
    
    
    
    }
    
      public void eliminarCompraProducto(Producto producto){
    
    
    this.repositorioProducto.eliminarProducto(producto);
    
    }
    
  
    
   
    
    
    
}
