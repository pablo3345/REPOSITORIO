/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import java.util.Calendar;
import javax.swing.JOptionPane;
import servicio.ServicioArea;
import servicio.ServicioEmpleado;
import vista.VistaPrincipal;

/**
 *
 * @author pablo
 */
public class Presentador {

    private VistaPrincipal vistaPrincipal;
    private ServicioEmpleado ServicioEmpleado;
    private ServicioArea servicioArea;

    public Presentador(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        this.ServicioEmpleado = new ServicioEmpleado();
        this.servicioArea = new ServicioArea();
    }

    public void guardarEmpleadoApretado() {
        String nombre = this.vistaPrincipal.getjTextFieldNombre().getText();
        String apellido = this.vistaPrincipal.getjTextFieldApellido().getText();
        Calendar cal = Calendar.getInstance();

        java.sql.Timestamp fecha = new java.sql.Timestamp(cal.getTimeInMillis());

        try {
            this.ServicioEmpleado.guardarEmpleado(nombre, apellido, fecha);

            this.vistaPrincipal.getjTextFieldNombre().setText("");
            this.vistaPrincipal.getjTextFieldApellido().setText("");

            JOptionPane.showMessageDialog(null, "el empleado se guardo correctamente");

        } catch (Exception e) {
        }

    }

    public void guardarAreaApretado() {
        String nombre = this.vistaPrincipal.getjTextFieldNombreArea().getText();
        String cantidad = this.vistaPrincipal.getjTextFieldCantidadEmpleados().getText();

        try {
            this.servicioArea.guardarArea(nombre, cantidad);
            this.vistaPrincipal.getjTextFieldNombreArea().setText("");
            this.vistaPrincipal.getjTextFieldCantidadEmpleados().setText("");

            JOptionPane.showMessageDialog(null, "el area se guardo correctamente");

        } catch (Exception e) {
        }
    }

}
