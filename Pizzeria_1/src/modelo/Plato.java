package modelo;
// Generated 10/05/2020 19:03:06 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Plato generated by hbm2java
 */
public class Plato  implements java.io.Serializable {


     private Integer idPlato;
     private String nombre;
     private double costoDelPlato;
     private double precioAlPublico;
     private String tipo;
     private Set pedidos = new HashSet(0);

    public Plato() {
    }

	
    public Plato(String nombre, double costoDelPlato, double precioAlPublico, String tipo) {
        this.nombre = nombre;
        this.costoDelPlato = costoDelPlato;
        this.precioAlPublico = precioAlPublico;
        this.tipo = tipo;
    }
    public Plato(String nombre, double costoDelPlato, double precioAlPublico, String tipo, Set pedidos) {
       this.nombre = nombre;
       this.costoDelPlato = costoDelPlato;
       this.precioAlPublico = precioAlPublico;
       this.tipo = tipo;
       this.pedidos = pedidos;
    }
   
    public Integer getIdPlato() {
        return this.idPlato;
    }
    
    public void setIdPlato(Integer idPlato) {
        this.idPlato = idPlato;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getCostoDelPlato() {
        return this.costoDelPlato;
    }
    
    public void setCostoDelPlato(double costoDelPlato) {
        this.costoDelPlato = costoDelPlato;
    }
    public double getPrecioAlPublico() {
        return this.precioAlPublico;
    }
    
    public void setPrecioAlPublico(double precioAlPublico) {
        this.precioAlPublico = precioAlPublico;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Set getPedidos() {
        return this.pedidos;
    }
    
    public void setPedidos(Set pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return idPlato + " " + nombre;
    }
    
    




}

