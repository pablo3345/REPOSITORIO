/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Competencia;
import modelo.Deportista;
import servicios.ServiciosCompetencia;
import servicios.ServiciosDeportista;
import vista.Vista;

/**
 *
 * @author pablo
 */
public class Presentador {

    private Vista vista;
    private ServiciosDeportista serviciosDeportista;
    private ServiciosCompetencia serviciosCompetencia;

    public Presentador(Vista vista) {
        this.vista = vista;
        this.serviciosDeportista = new ServiciosDeportista();
        this.serviciosCompetencia = new ServiciosCompetencia();
    }

    public void botonGuardarDeportista() {
        String nombre = this.vista.getjTextFieldNombre().getText();
        String apellido = this.vista.getjTextFieldApellido().getText();
        String dni = this.vista.getjTextFieldDNI().getText();

        try {
            Deportista deportistaGuardado = this.serviciosDeportista.guardarDeportista(nombre, apellido, dni);

            this.vista.getjTextFieldNombre().setText("");
            this.vista.getjTextFieldApellido().setText("");
            this.vista.getjTextFieldDNI().setText("");

            this.vista.getjComboBoxDeportista().addItem(deportistaGuardado);
            this.vista.getjComboBoxDeportistaYKilometros().addItem(deportistaGuardado);

            JOptionPane.showMessageDialog(null, "El deportista se guardo correctamente");

        } catch (IllegalArgumentException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage());

        }
    }

    public void guardarCompetenciaApretado() {
        // List<Deportista> arrayDeportista = new ArrayList<>();

        String pais = this.vista.getjTextFieldPais().getText();
        String fecha = this.vista.getjTextFieldFecha().getText();
        String cantidadDeKilometros = this.vista.getjTextFieldCantidadKilometros().getText();
        String tiempoRecorrido = this.vista.getjTextFieldTiempoRecorrido().getText();
        Deportista depor = (Deportista) this.vista.getjComboBoxDeportista().getSelectedItem();

        try {

            this.serviciosCompetencia.guardarCompetencia(pais, fecha, cantidadDeKilometros, tiempoRecorrido, (Deportista) depor);

            this.vista.getjTextFieldPais().setText("");
            this.vista.getjTextFieldFecha().setText("");
            this.vista.getjTextFieldCantidadKilometros().setText("");
            this.vista.getjTextFieldTiempoRecorrido().setText("");

            JOptionPane.showMessageDialog(null, "la competencia se guardo correctamente");

        } catch (IllegalArgumentException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage());

        }

    }

    public void mostrarDeportistaApretado() {
        ArrayList<Deportista> depor1 = new ArrayList<>();
        depor1 = this.serviciosDeportista.mostrarDeportistas();
        JOptionPane.showMessageDialog(null, depor1.toArray());

    }

    public void mostrarCompetenciaApretado() {
        ArrayList<Competencia> compe1 = new ArrayList<>();
        compe1 = this.serviciosCompetencia.mostrarCompetencia();
        JOptionPane.showMessageDialog(null, compe1.toArray());

    }

    public void calcularKilometrosApretado() {
        int a = 0;
        int b = 0;
        Deportista deportistaComboBox = (Deportista) this.vista.getjComboBoxDeportistaYKilometros().getSelectedItem();
        ArrayList<Competencia> transferenciasRelacionadas = this.serviciosCompetencia.obtenerTransferenciasRelacionadas(deportistaComboBox);

        for (Competencia competencia : transferenciasRelacionadas) {

            a = competencia.getCantidadDeKilometros();
            b += a;

        }

        JOptionPane.showMessageDialog(null, b);

    }

    public void calcularTiempoApretado() {
        double c = 0;
        double d = 0;
        Deportista deportistaComboBox = (Deportista) this.vista.getjComboBoxDeportistaYKilometros().getSelectedItem();
        ArrayList<Competencia> transferenciasRelacionadas = this.serviciosCompetencia.obtenerTransferenciasRelacionadas(deportistaComboBox);

        for (Competencia competenciaa : transferenciasRelacionadas) {
            c = competenciaa.getTiempoRecorrido();
            d += c;

        }

        JOptionPane.showMessageDialog(null, d);
    }

}
