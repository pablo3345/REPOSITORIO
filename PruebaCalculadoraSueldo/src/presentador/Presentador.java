/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Empleado;
import servicios.ServicioArticulo;
import servicios.ServicioEmpleado;
import vista.VistaPrincipal;

/**
 *
 * @author pablo
 */
public class Presentador {

    private VistaPrincipal vistaPrincipal;
    private ServicioEmpleado servicioEmpleado;
    private ServicioArticulo servicioArticulo;

    public Presentador(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        this.servicioEmpleado = new ServicioEmpleado();
        this.servicioArticulo = new ServicioArticulo();
        this.llenarComboEmpleado();
    }

    public void guardarEmpleadoApretado() {
        String nombre = this.vistaPrincipal.getjTextField1nombre_empleado().getText();
        String apellido = this.vistaPrincipal.getjTextField2apellido_empleado().getText();
        String dni = this.vistaPrincipal.getjTextField3DNI_empleado().getText();
        String sueldoBase = this.vistaPrincipal.getjTextField4SueldoBase_empleado().getText();

        try {
            this.servicioEmpleado.guardarEmpleado(nombre, apellido, dni, sueldoBase);
            this.llenarComboEmpleado();

            JOptionPane.showMessageDialog(null, "el empleado se guardo correctamente");

            this.vistaPrincipal.getjTextField1nombre_empleado().setText("");
            this.vistaPrincipal.getjTextField2apellido_empleado().setText("");
            this.vistaPrincipal.getjTextField3DNI_empleado().setText("");
            this.vistaPrincipal.getjTextField4SueldoBase_empleado().setText("");

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void guardarArticuloApretado() {
        int idEmpleado = Integer.valueOf(this.vistaPrincipal.getjTextField3IDEmpleado().getText());

        Empleado empleado = this.servicioEmpleado.getEmpleado(idEmpleado);
        String cantidadVendida = this.vistaPrincipal.getjTextField2cantidadDeArticulosVendidos().getText();
        String precioUnitario = this.vistaPrincipal.getjTextField1PrecioDelArticulo().getText();

        try {
            this.servicioArticulo.guardarArticulo(empleado, cantidadVendida, precioUnitario);

            JOptionPane.showMessageDialog(null, "el articulo se guardo correctamente");

            this.vistaPrincipal.getjTextField2cantidadDeArticulosVendidos().setText("");
            this.vistaPrincipal.getjTextField1PrecioDelArticulo().setText("");

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    private void llenarComboEmpleado() {

        ArrayList<Empleado> array = this.servicioEmpleado.obtenerTodos();

        DefaultComboBoxModel modeloEmpleado = new DefaultComboBoxModel(array.toArray());

        this.vistaPrincipal.getjComboBox1Empleados().setModel(modeloEmpleado);

    }

    public void calcularSueldoApretado() {
        Empleado empleado = (Empleado) this.vistaPrincipal.getjComboBox1Empleados().getSelectedItem();
        int idEmpleado = empleado.getIdempleado();
        double sueldo =0;
        
        
        try {
            sueldo = this.servicioEmpleado.calcularSueldo(idEmpleado);
            JOptionPane.showMessageDialog(null, "el sueldo del empleado es "+sueldo);
            
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

}
