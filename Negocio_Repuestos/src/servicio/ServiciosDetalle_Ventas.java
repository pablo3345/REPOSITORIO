/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.DetalleVenta;
import modelo.Repuesto;
import modelo.Ventas;
import presentador.Presentador;
import repositorio.RepositorioDetalle_Ventas;
import repositorio.RepositorioRepuesto;
import repositorio.RepositorioVentas;

/**
 *
 * @author pablo
 */
public class ServiciosDetalle_Ventas {

    private RepositorioRepuesto repositorioRepuesto;
    private RepositorioVentas repositorioVentas;
    private RepositorioDetalle_Ventas repositorioDetalle_Ventas;
    private Conexion conexion;

    public ServiciosDetalle_Ventas() {
        this.repositorioRepuesto = new RepositorioRepuesto();
        this.repositorioVentas = new RepositorioVentas();
        this.repositorioDetalle_Ventas = new RepositorioDetalle_Ventas();
        this.conexion = new Conexion();

    }

    public void guardarDetalle_Venta(Repuesto repuesto, Ventas ventas, String precioUnitarioConIva, String cantidad) {
        double precioUnitarioConvertido = validarPrecioUnitarioConIva(precioUnitarioConIva);
        int cantidadConvertida = validarCantidad(cantidad);
      
       
       
        
       

        precioUnitarioConvertido = repuesto.getPrecioSinIva() + repuesto.getPrecioSinIva() * 22 / 100;

        DetalleVenta detalleVenta = new DetalleVenta(repuesto, ventas, precioUnitarioConvertido, cantidadConvertida);
       
             this.repositorioDetalle_Ventas.guardar(detalleVenta);
            
        
       

        actualizarRepuestosStock(detalleVenta, cantidadConvertida);

        Repuesto repuesto1 = detalleVenta.getRepuesto();

        JOptionPane.showMessageDialog(null, repuesto1.getStockActual() - cantidadConvertida);
        
     

    }
    
    
    
    

    private double validarPrecioUnitarioConIva(String precioUnitario) {

        try {
            double precioUnitarioParseado = Double.valueOf(precioUnitario);
            if (precioUnitarioParseado <= 0) {
                throw new IllegalArgumentException("el precio unitario es menor o igual a cero");

            }
            return precioUnitarioParseado;

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("precio unitario incorrecto");
        }

    }
    
    
 

    private int validarCantidad(String cantidad) {

        try {
            int cantidadParseado = Integer.valueOf(cantidad);
            if (cantidadParseado <= 0) {
                throw new IllegalArgumentException("la cantidad es igual o menor a cero");

            }

            return cantidadParseado;

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("cantidad incorrecta");
        }

    }

    public void actualizarRepuestosStock(DetalleVenta detalleVenta, int cantidadConvertida) {

        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();

        ArrayList<DetalleVenta> delas = this.repositorioDetalle_Ventas.obtenerTodos();
       
     

        int ultimoRepuesto = 0;
        for (DetalleVenta del : delas) {

            ultimoRepuesto = del.getRepuesto().getIdrepuesto();
           

        }
       

        Repuesto repuesto1 = detalleVenta.getRepuesto();
        int total = repuesto1.getStockActual() - cantidadConvertida;

        //String sql = "UPDATE repuesto SET stockActual='"+ total+ "'";
        String sql = "UPDATE repuesto SET stockActual='" + total + "'WHERE idrepuesto='" + ultimoRepuesto + "'";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "el stock se actualizo correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
        
        
        
     

    }
    
    
    
    
    
    }
    
 
      
    
    
 
    
 
    

    
  
        
        
    
    
    
    


