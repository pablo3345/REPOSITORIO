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
import repositorio.RepositorioPedido;

import repositorio.RepositorioPlato;

/**
 *
 * @author pablo
 */
public class ServicioPedido {

    private RepositorioPedido repositorioPedido;

    public ServicioPedido() {
        this.repositorioPedido = new RepositorioPedido();
    }

    public void guardarPedido(Cliente cliente, Mesa mesa, Platosybebidas platosybebidas, Timestamp horaDelPedido, String cantidad, String demora) {
        double cantidadConvertida = this.validarCantidad(cantidad);
        double demoraConvertida = this.validarDemora(demora);

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

}
