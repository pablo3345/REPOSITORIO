/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Mesa;
import modelo.Pedido;

import repositorio.RepositorioMesa;
import repositorio.RepositorioPedido;

/**
 *
 * @author pablo
 */
public class ServicioMesa {
    
    private RepositorioMesa repositorioMesa;
    private RepositorioPedido repositorioPedido;

    public ServicioMesa() {
        this.repositorioMesa = new RepositorioMesa();
        this.repositorioPedido = new RepositorioPedido();
        
    }

 

    public void guardarMesa(String numero, String estado) {
        this.validarNumero(numero);
        this.validarNumero2(numero);
        
        
        
        Mesa mesa = new Mesa(numero, estado);
        
        this.repositorioMesa.guardarMesa(mesa);
     
     
       
       
    }
    
    
    
    private void validarNumero(String numero){
        
        if(numero.length()==0){
        throw new IllegalArgumentException("numero de la mesa vacio");
        
        
        
        }
    
    
    
    
    }
    
    private void validarNumero2(String numero){
    
        try {
            int numeroParseado = Integer.valueOf(numero);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("numero equivocado");
        }
    
    
    }

    public ArrayList<Mesa> obtenerTodosMesa() {
        
        
        
       ArrayList<Mesa> delas2 = this.repositorioMesa.obtenerTodosMesa();
       
       
       
       
       
       return delas2;
    }
    
    
    
 
    
    
    public ArrayList<Pedido> obtenerMesasEstado(){
    
    ArrayList<Pedido> mesasTotales = this.repositorioPedido.obtenerTodosPedidos();
    
    return mesasTotales;
    
    
    
    }
    public ArrayList<Mesa> obtenerMesasDisponibles(){
     ArrayList<Mesa> mesasDisponibles = new ArrayList<>();
    
    ArrayList<Mesa> mesasdisponibles = this.repositorioMesa.obtenerTodosMesa();
    
    for(Mesa mes : mesasdisponibles){
    
    if(mes.getEstado().equals("disponible")){
        
        mesasDisponibles.add(mes);
    
    
    
    
    }
    
    }
    
    return mesasDisponibles;
    
    
    
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
    
    
    public  ArrayList<Mesa> obtenerTodoMesas(){
    
//    ArrayList<Object> array = this.repositorioMesa.obtenerTodosMesaSegunPedido();
//    
//    return array;

     ArrayList<Mesa> mesas = this.repositorioMesa.obtenerTodosMesa();
     
     return mesas;
    }
    
    

   
    
}
