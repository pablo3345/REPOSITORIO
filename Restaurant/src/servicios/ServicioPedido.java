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
import java.util.List;
import javax.swing.JOptionPane;
import jdk.management.resource.internal.TotalResourceContext;
import modelo.Cliente;
import modelo.Mesa;
import modelo.Pedido;
import modelo.Platosybebidas;
import repositorio.RepositorioMesa;
import repositorio.RepositorioPedido;

import repositorio.RepositorioPlato;
import vistas.FacturaVistas;

/**
 *
 * @author pablo
 */
public class ServicioPedido {

    private RepositorioPedido repositorioPedido;
    private RepositorioMesa repositorioMesa;

    public ServicioPedido() {
        this.repositorioPedido = new RepositorioPedido();
        this.repositorioMesa = new RepositorioMesa();
    }

    public void guardarPedido(Cliente cliente, Mesa mesa, Platosybebidas platosybebidas, Timestamp horaDelPedido, String cantidad, String demora) {
        double cantidadConvertida = this.validarCantidad(cantidad);
        double demoraConvertida = this.validarDemora(demora);
        this.validarPlatosYbebidas(platosybebidas);
        this.validarMesas(mesa);
       

        Pedido pedido = new Pedido(cliente, mesa, platosybebidas, horaDelPedido, cantidadConvertida, demoraConvertida);

        this.repositorioPedido.guardarPedido(pedido);

        this.actualizarMesas(pedido);

    }

    private double validarCantidad(String cantidad) {

        try {

            double cantidadParseada = Double.valueOf(cantidad);
            return cantidadParseada;

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("cantidad equivocada");
        }

    }

    private double validarDemora(String demora) {

        try {
            double demoraParseada = Double.valueOf(demora);
            return demoraParseada;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("demora equivocada");
        }

    }
    
  
    

    public void actualizarMesas(Pedido pedido) {

        Conexion conexion = new Conexion();
        Connection con = conexion.getConection();

        int idPedido = pedido.getIdpedido();

        Pedido pedido1 = this.repositorioPedido.obtenerPedidoGuardado(idPedido);

        int idMesa = pedido1.getMesa().getIdmesa();

        String ocupada = "ocupada";

        String sql = "UPDATE mesa SET  estado= '" + ocupada + "' WHERE  idmesa='" + idMesa + "'";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "la mesa se actualizo correctamente");
            
           // con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public ArrayList<Pedido> obtenerTodosPedidos() {

        ArrayList<Pedido> pedidos = this.repositorioPedido.obtenerTodosPedidos();

        return pedidos;

    }

    public ArrayList<Double> calcularTotalPrecioAlPublico() {
        ArrayList<Double> delas = (ArrayList<Double>) this.repositorioPedido.obtenerConsultaTotalPrecioAlPublico();

        return delas;

    }

    public ArrayList<Double> calcularTotalPrecioDeCosto() {
        ArrayList<Double> delas = (ArrayList<Double>) this.repositorioPedido.obtenerConsultaTotalCostoDelPlato();

        return delas;

    }

    public ArrayList<Object> arrayConsultaHQL() {

        ArrayList<Object> del = this.repositorioPedido.obtenerArrayObjectConsultaHQL();

        return del;

    }

    public void actulizarPedido(int idPedido, Cliente cliente, Mesa mesa, Platosybebidas platosybebidas, Double cantidad, Double demora) {
        
        

        Conexion conexion = new Conexion();
        Connection con = conexion.getConection();

        String sql = "UPDATE pedido SET cliente_idcliente='" + cliente.getIdcliente() + "'," + "platosYbebidas_idplato='" + platosybebidas.getIdplato() + "'," + "mesa_idmesa='"
                + mesa.getIdmesa() + "'," + "cantidad='" + cantidad + "'," + "demora='" + demora + "'WHERE idpedido='" + idPedido + "'";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "el pedido se actualizo correctamente");

           // this.ponerMesasOcupadasPedido(mesa);
           // this.ponerMesaDisponiblePedido(mesa);
         
            
           // con.close();
          
           
            
           
          

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

//    public void ponerMesasOcupadasPedido(Mesa mesa) {
//
//        Conexion conexion = new Conexion();
//        Connection con = conexion.getConection();
//
//        int idMesa = mesa.getIdmesa();
//
//        //Pedido pedido1 = this.repositorioPedido.obtenerPedidoGuardado(idMesa);
//
//        //int idMesa = pedido1.getMesa().getIdmesa();
//        String ocupada = "ocupada";
//
//        String sql = "UPDATE mesa SET  estado= '" + ocupada + "' WHERE  idmesa='" + idMesa + "'";
//
//        try {
//            PreparedStatement preparedStatement = con.prepareStatement(sql);
//            preparedStatement.executeUpdate();
//            
//            
//            JOptionPane.showMessageDialog(null, "la mesa se actualizo correctamente");
//           // this.mesasOcupadas_Factura();
//           // this.obtenerMesasOcupadas();
//           // this.mesasOcupadas_Factura();
//          
//           // con.close();
//           
//            
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//        
//         
//
//    }

//    public void ponerMesaDisponibleActualizarPedido(Mesa mesa) {
//
//        //////////////////////////////////////////////////////////
////        Conexion conexion = new Conexion();
////        Connection con = conexion.getConection();
////
////    
////
////            //int id =(int) idMesasDesocupadas.get(i);
////            String disponible = "disponible";
////
////            String sql = "UPDATE mesa SET  estado= '" + disponible + "' WHERE  idmesa='" + id + "'";
////
////            try {
////                PreparedStatement preparedStatement = con.prepareStatement(sql);
////                preparedStatement.executeUpdate();
////                 //con.close();
////            } catch (SQLException e) {
////                JOptionPane.showMessageDialog(null, e.getMessage());
////            }
//        
//
//    }

    private void validarPlatosYbebidas(Platosybebidas platosybebidas) {
       if(platosybebidas==null){
       
        throw new IllegalArgumentException("debe ingresar un comestible");
       
       }
    }

    public ArrayList<Mesa> mesasOcupadas_Factura() {
       
    
    ArrayList<Mesa> mesasOcu = this.repositorioMesa.obtenerMesasOcupadas();
    //ArrayList<Mesa> mesasOcupadass = new ArrayList<>();
     
//    for(Mesa mesa : mesasOcu){
//    
//    if(mesa.getEstado().equals("ocupada")){
//    mesasOcupadass.add(mesa);
//    
//    
//    }
    
     return mesasOcu;
    }
   
    
    
    

    private void validarMesas(Mesa mesa) {
       if(mesa == null){
            throw new IllegalArgumentException("debe ingresar una mesa");
       
       
       
       
       }
    }
    
      public ArrayList<Mesa> obtenerMesasOcupadas() {
         ArrayList<Mesa> mesasOcupadas = new ArrayList<>();
    
    ArrayList<Mesa> mesasOcupadass = this.repositorioMesa.obtenerTodosMesa();
    
    for(Mesa mes : mesasOcupadass){
    
    if(mes.getEstado().equals("ocupada")){
        
        mesasOcupadas.add(mes);
    
    
    
    
    }
    
    }
    
    return mesasOcupadas;
    }

    public void eliminarPedido(int idPedidos) {
        this.repositorioPedido.eliminarPedido(idPedidos);
    }
    

    

   

}
