package modelo;
// Generated 25/05/2019 15:45:25 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Integer idcliente;
     private String nombre;
     private String apellido;
     private String telefono;
     private String dni;
     private String sexo;
     private Set contratos = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(String nombre, String apellido, String telefono, String dni, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dni = dni;
        this.sexo = sexo;
    }
    public Cliente(String nombre, String apellido, String telefono, String dni, String sexo, Set contratos) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.telefono = telefono;
       this.dni = dni;
       this.sexo = sexo;
       this.contratos = contratos;
    }
   
    public Integer getIdcliente() {
        return this.idcliente;
    }
    
    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
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
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Set getContratos() {
        return this.contratos;
    }
    
    public void setContratos(Set contratos) {
        this.contratos = contratos;
    }

    @Override
    public String toString() {
        return  idcliente + " " + nombre +" " + apellido +" "+  sexo;
    }
    
    
    




}


