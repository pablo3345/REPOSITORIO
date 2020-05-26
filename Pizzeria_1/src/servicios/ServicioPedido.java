/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Mesa;
import modelo.Pedido;
import modelo.Plato;
import repositorio.RepositorioMesa;
import repositorio.RepositorioPedido;

/**
 *
 * @author pablo
 */
public class ServicioPedido {
    private RepositorioPedido repositorioPedido;
    private RepositorioMesa repositorioMesa;

    public ServicioPedido() {
        this.repositorioPedido =new RepositorioPedido();
        this.repositorioMesa = new RepositorioMesa();
    }
    
    

    public void guardarPedido(Cliente cliente, Mesa mesa, Plato plato, String demora, String cantidad, String estado) {
        double demoraConvertida = this.validarDemora(demora);
        this.validarPlato(plato);
        double cantidadConvertida = this.validarCantidad(cantidad);
        
        Pedido pedido = new Pedido(cliente, mesa, plato, demoraConvertida, cantidadConvertida, estado);
        
        this.repositorioPedido.guardarPedido(pedido);
        this.ponerMesaOcupada(pedido);
        
        
        
       

    }

    private double validarDemora(String demora) {
        try {
            double demoraParseado = Double.valueOf(demora);
            return demoraParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("demora equivocada");
        }
    }

    private double validarCantidad(String cantidad) {
        try {
            double cantidadParseada = Double.valueOf(cantidad);
            return cantidadParseada;

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("cantidad equivocada");
        }
    }

    private void validarPlato(Plato plato) {
        if (plato == null) {
            throw new IllegalArgumentException("comestible vacio");
        }

    }
    
    public void ponerMesaOcupada(Pedido pedido){
        
        int idPedido = pedido.getIdPedido();
        
        Pedido pedido1 = this.repositorioPedido.obtenerPedidoGuardado(idPedido);
        
        int idMesa = pedido1.getMesa().getIdMesa();
        
        this.repositorioMesa.actualizarMesa(idMesa);
        
        
    
    
    
    
    }

    public ArrayList<Pedido> obtenerTodoPedido() {
       ArrayList<Pedido> arrayPedido = this.repositorioPedido.obtenerTodosPedido();
       
       return arrayPedido;
    }
}
