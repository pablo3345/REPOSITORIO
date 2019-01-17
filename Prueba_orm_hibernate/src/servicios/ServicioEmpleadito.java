/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Empleadito;
import repositorio.RepositorioEmpleado;

/**
 *
 * @author pablo
 */
public class ServicioEmpleadito {

    private RepositorioEmpleado repositorioEmpleado;

    public ServicioEmpleadito() {
        this.repositorioEmpleado = new RepositorioEmpleado();
    }

    public void guardarEmpleado(String nombre, String apellido, String edad, String dni) {

        int edadConvertido = this.validadEdad(edad);

        Empleadito empleadito = new Empleadito(nombre, apellido, edadConvertido, dni);

        this.repositorioEmpleado.guardar(empleadito);
        
       

      

    }

    private int validadEdad(String edad) {
        try {
            int edadParseado = Integer.valueOf(edad);

            if (edadParseado < 0) {
                throw new IllegalArgumentException("la edad es incorrecta");
            }
            return edadParseado;

        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("la edad es invalida");
        }

    }

    public void mostrarInformacion() {
        //este codigo ya estaba cuando me descargue el trabajo, no agregue nada
        String mensaje = "";
        //obtiene los empleados desde repositor y los guarda en el array Empleado
        ArrayList<Empleadito> empleados = this.repositorioEmpleado.obtenerTodos();

        for (Empleadito empleado : empleados) {
            mensaje += empleado.getIdempleadito() + " "
                    + "Nombre: " + empleado.getNombre()
                    + ", Apellido: " + empleado.getApellido()
                    + ", DNI: " + empleado.getDni()
                    + ", Edad: " + empleado.getEdad() + "\n";

        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void eliminarEmpleado(Empleadito empleadito) {
        this.repositorioEmpleado.eliminarEmpleado(empleadito);

    }

    public void edadLimiteMostrar() {
        ArrayList<Empleadito> empleados = this.repositorioEmpleado.obtenerTodos();
        empleados.toArray();

        for (Empleadito empleadito1 : empleados) {

            if (empleadito1.getEdad() > 62) {
                JOptionPane.showMessageDialog(null, "ya esta en edad de jubilarse " + empleadito1);

            }

        }

    }

}
