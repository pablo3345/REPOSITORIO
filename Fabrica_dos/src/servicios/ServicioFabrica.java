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
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Fabrica;
import modelo.Repuesto;
import presentador.Presentador;
import repositorio.RepositorioFabrica;

/**
 *
 * @author pablo
 */
public class ServicioFabrica {
    
     private RepositorioFabrica repositorioFabrica;
    

    public ServicioFabrica() {
        this.repositorioFabrica = new RepositorioFabrica();
        
    }
     
     
     

    public void guardarFabrica(Repuesto repuesto,
            Timestamp fecha,
            String nombre, String direccion,
            String costoDeEnvio, String costoConIva,
            String cantidadRepuestos, String total) {
        
        double costoDeEnvioConvertido = this.validarCostoDeEnvio(costoDeEnvio);
        double costoConIvaConvertido = this.validarCostoConIva(costoConIva);
        int cantidadDeRepuestosConvertido= this.validarCantidadDeRepuestos(cantidadRepuestos);
        double totalConvertido = this.validarTotal(total);
        
       
        
        Fabrica fabrica = new Fabrica(repuesto, fecha, nombre, direccion, costoDeEnvioConvertido, costoConIvaConvertido, cantidadDeRepuestosConvertido, totalConvertido);
      
        this.repositorioFabrica.guardar(fabrica);
        
        this.actualizarStock(fabrica);
        
       
    }
    
    
    private double validarCostoDeEnvio(String costoDeEnvio){
    
        try {
            double costoDeEnvioParseado = Double.valueOf(costoDeEnvio);
        
            return costoDeEnvioParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("costo de envio equivocado");
        }
    
    }

    private double validarCostoConIva(String costoConIva) {
       
         ArrayList<Fabrica> delas6 = (ArrayList<Fabrica>) this.repositorioFabrica.obtenerTodos();
        try {
            double costoConIvaParseado = Double.valueOf(costoConIva);
            

         
            
            return costoConIvaParseado + costoConIvaParseado*0.05;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("costo con iva incorrecto");
        }
    }

    private int validarCantidadDeRepuestos(String cantidadRepuestos) {
        try {
            int cantidadDeRepuestosParseado = Integer.valueOf(cantidadRepuestos);
            return cantidadDeRepuestosParseado;
        } catch (NumberFormatException e) {
           throw new IllegalArgumentException("cantidad de repuestos equivocado");
        }
    }

    private double validarTotal(String total) {
        try {
            double totalParseado = Double.valueOf(total);
            return totalParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("total equivocado");
        }
    }
    
    
    
    
    public void actualizarStock(Fabrica fabrica){

       
        
        
       
        
        
        Conexion conexion = new Conexion();
        Connection con = conexion.getConexion();
       
 
       
        int idParaObtenerRepuesto = fabrica.getRepuesto().getIdrepuesto();
        
         Repuesto repuesto = this.repositorioFabrica.obtenerRepuestoGuardado(idParaObtenerRepuesto);
         int idRepuesto = repuesto.getIdrepuesto();
         
          int cantidad = fabrica.getCantidadRepuestos();
         
         int stock = repuesto.getStockActual();
         
         int total = stock - cantidad;
        
        
        
        
        String sql = "UPDATE repuesto SET  stockActual= '"+ total +"' WHERE  idrepuesto='"+idRepuesto+"'";
        
          try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "el stock se actualizo correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    
    
    
    
    }
    
    public ArrayList<Fabrica> obtenerTodos(){
    
    ArrayList<Fabrica> delas8 = (ArrayList<Fabrica>) this.repositorioFabrica.obtenerTodos();
    
    return delas8;
    
    
    
    
    
    
    
    
    }
    
   

   
  
  
    
 
    
    
    
    
    
    

  
    
}
