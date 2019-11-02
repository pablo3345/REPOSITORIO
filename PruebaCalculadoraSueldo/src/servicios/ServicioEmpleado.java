/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Articulo;
import modelo.Empleado;
import repositorios.RepositorioArticulo;
import repositorios.RepositorioEmpleado;

/**
 *
 * @author pablo
 */
public class ServicioEmpleado {

    private RepositorioEmpleado repositorioEmpleado;
    private RepositorioArticulo repositorioArticulo;

    public ServicioEmpleado() {
        this.repositorioEmpleado = new RepositorioEmpleado();
        this.repositorioArticulo = new RepositorioArticulo();
    }

    public void guardarEmpleado(String nombre, String apellido, String dni, String sueldoBase) {
        this.validarNombre(nombre);
        this.validarApellido(apellido);
        this.validarDni(dni);
        double sueldoBaseConvertido = this.validarSueldoBase(sueldoBase);
       

        Empleado empleado = new Empleado(nombre, apellido, dni, sueldoBaseConvertido);
         this.dniRepetidos(empleado);

        this.repositorioEmpleado.guardar(empleado);
        

    }

    private void validarNombre(String nombre) {

        if (nombre.length() == 0) {
            throw new IllegalArgumentException("nombre vacio");

        }

    }

    private void validarApellido(String apellido) {

        if (apellido.length() == 0) {
            throw new IllegalArgumentException("apellido vacio");

        }

    }

    private void validarDni(String dni) {

        try {
            int dniParseado = Integer.parseInt(dni);
            if (dniParseado <= 0) {
                throw new IllegalArgumentException("dni incorrecto");

            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("dni invalido");

        }

    }

    private double validarSueldoBase(String sueldoBase) {

        try {
            double sueldoBaseParseado = Double.parseDouble(sueldoBase);
            if (sueldoBaseParseado <= 0) {
                throw new IllegalArgumentException("sueldo base vacio");

            }
            return sueldoBaseParseado;

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("sueldo base invalido");
        }

    }
    
    private void dniRepetidos(Empleado empleado){
    ArrayList<Empleado> arrayEmpleados = this.repositorioEmpleado.obtenerTodos();
    
    for(Empleado empleados :arrayEmpleados){
    if(empleados.getDni().equals(empleado.getDni())){
    throw new IllegalArgumentException("dni repetidos");
    
    }
    
    
    }
    
    
    }

    public Empleado getEmpleado(int idEmpleado) {
    Empleado empleado = this.repositorioEmpleado.obtenerEmpleadoGuardado(idEmpleado);
    
    return empleado;
    }

    public ArrayList<Empleado> obtenerTodos() {
        ArrayList<Empleado> arrayEmpleados = this.repositorioEmpleado.obtenerTodos();

        return arrayEmpleados;

    }

    public double calcularSueldo(int idEmpleado) {
        
        Empleado empleado = this.repositorioEmpleado.obtenerEmpleadoGuardado(idEmpleado);
        double sueldo =empleado.getSueldoBase();
        
        ArrayList<Articulo> articulGuardados = this.repositorioArticulo.obtenerTodosPorEmpleado(idEmpleado);
        
        for(Articulo articulo: articulGuardados){
        sueldo += articulo.getCantidadVendida() * articulo.getPrecioUnitario() * 0.05;
        
        
        }
        
        return sueldo;
        
        
        
        
        
      
        
       
        
        
       
        
    }

  

    

}
