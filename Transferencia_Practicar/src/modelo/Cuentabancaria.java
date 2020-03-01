package modelo;
// Generated 22/02/2020 19:04:04 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cuentabancaria generated by hbm2java
 */
public class Cuentabancaria  implements java.io.Serializable {


     private Integer idcuentaBancaria;
     private String nombre;
     private String apellido;
     private String dni;
     private double saldo;
     private Set transferenciasForCuentaDestino = new HashSet(0);
     private Set transferenciasForCuentaOrigen = new HashSet(0);

    public Cuentabancaria() {
    }

	
    public Cuentabancaria(String nombre, String apellido, String dni, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.saldo = saldo;
    }
    public Cuentabancaria(String nombre, String apellido, String dni, double saldo, Set transferenciasForCuentaDestino, Set transferenciasForCuentaOrigen) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.dni = dni;
       this.saldo = saldo;
       this.transferenciasForCuentaDestino = transferenciasForCuentaDestino;
       this.transferenciasForCuentaOrigen = transferenciasForCuentaOrigen;
    }
   
    public Integer getIdcuentaBancaria() {
        return this.idcuentaBancaria;
    }
    
    public void setIdcuentaBancaria(Integer idcuentaBancaria) {
        this.idcuentaBancaria = idcuentaBancaria;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Set getTransferenciasForCuentaDestino() {
        return this.transferenciasForCuentaDestino;
    }
    
    public void setTransferenciasForCuentaDestino(Set transferenciasForCuentaDestino) {
        this.transferenciasForCuentaDestino = transferenciasForCuentaDestino;
    }
    public Set getTransferenciasForCuentaOrigen() {
        return this.transferenciasForCuentaOrigen;
    }
    
    public void setTransferenciasForCuentaOrigen(Set transferenciasForCuentaOrigen) {
        this.transferenciasForCuentaOrigen = transferenciasForCuentaOrigen;
    }

    @Override
    public String toString() {
        return  idcuentaBancaria+" "+ nombre +" "+ apellido +" DNI: "+ dni + " Saldo: "+  saldo;
    }
    
    
    




}

