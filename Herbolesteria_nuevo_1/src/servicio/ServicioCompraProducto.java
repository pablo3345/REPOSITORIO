/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.List;
import modelo.Compra;
import modelo.CompraProducto;
import modelo.Producto;
import repositorio.RepositorioCompraProducto;

/**
 *
 * @author pablo
 */
public class ServicioCompraProducto {
    private RepositorioCompraProducto repositorioCompraProducto;

    public ServicioCompraProducto() {
        this.repositorioCompraProducto = new RepositorioCompraProducto();
        
    }
    
    public void guardarCompraProducto(Compra compras, Producto productos, String cantidad, String precioUnitarioo){
        int cantidadConvertida = this.validarCantidad(cantidad);
        double precioUnitarioConvertido = this.validarPrecioUnitario(precioUnitarioo);
        
        CompraProducto compraProducto = new CompraProducto(compras, productos, cantidadConvertida, precioUnitarioConvertido);
        
        this.repositorioCompraProducto.guardarcompraProducto(compraProducto);
        
        
    
    
    
    }
    
    private int validarCantidad(String cantidad){
    
        try {
            int cantidadParseada = Integer.parseInt(cantidad);
            return cantidadParseada;
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("cantidad incorrecta");
        }
    
    }
    
    private double validarPrecioUnitario(String precioUnitario){
    
        try {
            double precioUnitarioParseado = Double.parseDouble(precioUnitario);
            return precioUnitarioParseado;
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("precio unitario incorrecto");
        }
    
    
    }
    
    public List<CompraProducto> obtenerTodosCompraProducto(){
        
        List<CompraProducto> todos = this.repositorioCompraProducto.obtenerTodosCompraProductos();
        
        return todos;
    
    
    
    
    }
    
     public void eliminarCompraProducto(CompraProducto compraProductoseleccionado){
    
    
    this.repositorioCompraProducto.eliminarCompraProducto(compraProductoseleccionado);
    
    }
    
    
    
    
    
}
