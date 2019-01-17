/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Empleadito;
import repositorio.RepositorioEmpleado;
import servicios.ServicioEmpleadito;
import vistas.Vistas;

/**
 *
 * @author pablo
 */
public class Presentador {

    private Vistas vistaPrincipal;
    private RepositorioEmpleado repositorioEmpleado;
    private ServicioEmpleadito servicioEmpleadito;

    public Presentador(Vistas vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        this.repositorioEmpleado = new RepositorioEmpleado();
        this.servicioEmpleadito = new ServicioEmpleadito();
        this.rellenarComboBox();
    }

    public void botonGuardarApretado() {
        String nombre = this.vistaPrincipal.getjTextFieldNombre().getText();
        String apellido = this.vistaPrincipal.getjTextFieldApellido().getText();
        String edad = this.vistaPrincipal.getjTextFieldEdad().getText();
        String dni = this.vistaPrincipal.getjTextFieldDni().getText();

        try {
            this.servicioEmpleadito.guardarEmpleado(nombre, apellido, edad, dni);
            
           

            //limpiat los textField
            this.vistaPrincipal.getjTextFieldNombre().setText("");
            this.vistaPrincipal.getjTextFieldApellido().setText("");
            this.vistaPrincipal.getjTextFieldEdad().setText("");
            this.vistaPrincipal.getjTextFieldDni().setText("");

            JOptionPane.showMessageDialog(null, "¡Guardado con éxito!");
            this.rellenarComboBox();

        } catch (IllegalArgumentException excepcion) {
            JOptionPane.showMessageDialog(null, excepcion.getMessage());
        }

    }

    public void mostrarEmpleadosApretados() {
        this.servicioEmpleadito.mostrarInformacion();
    }

    private void rellenarComboBox() {
        //Obtener todos los empleados de la base de datos
        List<Empleadito> empleados = this.repositorioEmpleado.obtenerTodosenUnList();

        //Crear el modelo con todos los empleados
        DefaultComboBoxModel<Object> modeloComboBox = new DefaultComboBoxModel<>(empleados.toArray());

        //Setearle el modelo
        this.vistaPrincipal.getjComboBox1().setModel(modeloComboBox);

    }

    public void eliminarEmpleadoApretado() {
        try {
             Empleadito empleadoSeleccionado = (Empleadito) this.vistaPrincipal.getjComboBox1().getSelectedItem();
             this.servicioEmpleadito.eliminarEmpleado(empleadoSeleccionado);
             JOptionPane.showMessageDialog(null, "el empleado ha sido eliminado");
             this.rellenarComboBox();
        } catch (IllegalArgumentException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage());
            
            
            
        }
        
    }

    public void mostrarJubiladosApretado() {
         //me muestra las personas con edades mayores para jubilarse
       this.servicioEmpleadito.edadLimiteMostrar();
    }

}
