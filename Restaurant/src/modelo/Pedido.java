package modelo;
// Generated 10/04/2020 15:44:52 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Pedido generated by hbm2java
 */
public class Pedido  implements java.io.Serializable {


     private Integer idpedido;
     private Cliente cliente;
     private Mesa mesa;
     private Platosybebidas platosybebidas;
     private Date horaDelPedido;
     private double cantidad;
     private double demora;
     private Set propietarios = new HashSet(0);

    public Pedido() {
    }

	
    public Pedido(Cliente cliente, Mesa mesa, Platosybebidas platosybebidas, Date horaDelPedido, double cantidad, double demora) {
        this.cliente = cliente;
        this.mesa = mesa;
        this.platosybebidas = platosybebidas;
        this.horaDelPedido = horaDelPedido;
        this.cantidad = cantidad;
        this.demora = demora;
    }
    public Pedido(Cliente cliente, Mesa mesa, Platosybebidas platosybebidas, Date horaDelPedido, double cantidad, double demora, Set propietarios) {
       this.cliente = cliente;
       this.mesa = mesa;
       this.platosybebidas = platosybebidas;
       this.horaDelPedido = horaDelPedido;
       this.cantidad = cantidad;
       this.demora = demora;
       this.propietarios = propietarios;
    }
   
    public Integer getIdpedido() {
        return this.idpedido;
    }
    
    public void setIdpedido(Integer idpedido) {
        this.idpedido = idpedido;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Mesa getMesa() {
        return this.mesa;
    }
    
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    public Platosybebidas getPlatosybebidas() {
        return this.platosybebidas;
    }
    
    public void setPlatosybebidas(Platosybebidas platosybebidas) {
        this.platosybebidas = platosybebidas;
    }
    public Date getHoraDelPedido() {
        return this.horaDelPedido;
    }
    
    public void setHoraDelPedido(Date horaDelPedido) {
        this.horaDelPedido = horaDelPedido;
    }
    public double getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public double getDemora() {
        return this.demora;
    }
    
    public void setDemora(double demora) {
        this.demora = demora;
    }
    public Set getPropietarios() {
        return this.propietarios;
    }
    
    public void setPropietarios(Set propietarios) {
        this.propietarios = propietarios;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idpedido=" + idpedido + ", cliente=" + cliente.getIdcliente() + ", mesa=" + mesa.getIdmesa() + ", platosybebidas=" + platosybebidas.getIdplato() + ", horaDelPedido=" + horaDelPedido + ", cantidad=" + cantidad + '}';
    }
    
    
   

    

    

  
   

   
    
    
    

    
    
    




}


