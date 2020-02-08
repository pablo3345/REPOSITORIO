/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Fabrica;
import modelo.Repuesto;
import modelo.Venta;
import repositorio.RepositorioRepuesto;
import repositorio.RepositorioVenta;

/**
 *
 * @author pablo
 */
public class ServicioVenta {
    
    private RepositorioVenta repositorioVenta;
    private RepositorioRepuesto repositorioRepuesto;

    public ServicioVenta() {
        this.repositorioVenta = new RepositorioVenta();
        this.repositorioRepuesto = new RepositorioRepuesto();
      
    }
    
    
    

    public void guardarVenta(Fabrica fabrica, Repuesto repuesto, String precio, String cantidad, String total) {
       double precioConvertido = this.validarPrecio(precio);
       int cantidadConvertida = this.validarCantidad(cantidad);
       double totalConvertido = this.validarTotal(total);
       
       Venta venta = new Venta(fabrica, repuesto, precioConvertido, cantidadConvertida, totalConvertido);
       
       this.actualizarStock(venta);
       
      
       
       this.repositorioVenta.guardar(venta);
       
    }
    
    private double validarPrecio(String precio){
        
        try {
            double precioParseado = Double.valueOf(precio);
            return precioParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("precio incorrecto");
        }
    
    
    
    
    
    }
    
    private int validarCantidad(String cantidad){
        
        try {
            int cantidadParseada = Integer.valueOf(cantidad);
            return cantidadParseada;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("cantidad incorrecta");
        }
    
    
    
    
    }
    
    private double validarTotal(String total){
    
        try {
            double totalParseado = Double.valueOf(total);
            return totalParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("total incorrecto");
        }
    
    
    }
    
      public void actualizarStock(Venta venta){
        
        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();
        
       //Venta venta = new Venta();
       
        int idRepuesto = venta.getRepuesto().getIdrepuesto();
        
        Repuesto repuesto = this.repositorioRepuesto.obtenerRepuestoGuardado(idRepuesto);
        
        if(repuesto.getEstado().equals("BAJA")){
        throw new IllegalArgumentException("el repuesto esta dado de baja");
        
        }
        
        int total = repuesto.getStockActual()-venta.getCantidadDeRepuestos();
        
        
        
        String sql = "UPDATE repuesto SET  stockActual= '" + total + "' WHERE  idrepuesto='" + idRepuesto + "'";
        
         try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "el stock se actualizo correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    
    
    
    
    
    
    }
      
     public ArrayList<Venta> obtenerArrayTodos(){
     ArrayList<Venta> delas6 = this.repositorioVenta.obtenerTodosVenta();
     
     
     return delas6;
     
     
     
     }
     
    public void obtenerVentasSegunFabrica(int idFabrica){
    
    ArrayList<Venta> del58 = new ArrayList<>();
    
    
    del58= this.repositorioVenta.obtenerTodosPorFabrica(idFabrica);
    double totalFabrica = 0;
    
     for (Venta ven : del58) {

            totalFabrica += ven.getTotal();
              

        }

        JOptionPane.showMessageDialog(null, totalFabrica);
    
    
    
    
    }
 
      
     
    
    
 
    
}
