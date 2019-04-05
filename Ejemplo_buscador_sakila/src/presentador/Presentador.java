/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Persona;
import servicio.ServicioPersona;
import servicio.ServicioViaje;
import vista.VistaPrincipal;

/**
 *
 * @author pablo
 */
public class Presentador {

    private VistaPrincipal vistaPrimcipal;
    private ServicioPersona servicioPersona;
    private ServicioViaje servicioViaje;

    public Presentador(VistaPrincipal vistaPrimcipal) {
        this.vistaPrimcipal = vistaPrimcipal;
        this.servicioPersona = new ServicioPersona();
        this.servicioViaje = new ServicioViaje();
        this.rellenarComboPersona();
    }

    public void guardarPersonaApretado() {
        String nombre = this.vistaPrimcipal.getjTextFieldNombre().getText();
        String apellido = this.vistaPrimcipal.getjTextFieldApellido().getText();
        String edad = this.vistaPrimcipal.getjTextFieldEdad().getText();

        Calendar cal = Calendar.getInstance();
        java.sql.Timestamp fecha = new java.sql.Timestamp(cal.getTimeInMillis());

        try {
            this.servicioPersona.guardarPersona(nombre, apellido, edad, fecha);

            this.vistaPrimcipal.getjTextFieldNombre().setText("");
            this.vistaPrimcipal.getjTextFieldApellido().setText("");
            this.vistaPrimcipal.getjTextFieldEdad().setText("");

            JOptionPane.showMessageDialog(null, "la persona se guardo correctamente");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void guardarViajeApretado() {
        
         int id_Persona = Integer.parseInt(this.vistaPrimcipal. getjTextFiel_id_persona().getText());
         Persona persona = this.servicioPersona.getPersona(id_Persona);
         
        String ciudad = this.vistaPrimcipal.getjTextFieldCiudad().getText();
        String pais = this.vistaPrimcipal.getjTextFieldPais().getText();
        String fechaDelViaje = this.vistaPrimcipal.getjTextFieldFechaDelViaje().getText();

        try {
            this.servicioViaje.guardarViaje(persona, ciudad, pais, fechaDelViaje);

            this.vistaPrimcipal.getjTextFieldCiudad().setText("");
            this.vistaPrimcipal.getjTextFieldPais().setText("");
            this.vistaPrimcipal.getjTextFieldFechaDelViaje().setText("");
            JOptionPane.showMessageDialog(null, "el viaje se gurado correctamente");

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void rellenarComboPersona(){
     ArrayList<Persona> arrayPersona = this.servicioPersona.obtenerTodos();
     
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(arrayPersona.toArray());
        
        this.vistaPrimcipal. getjComboBoxPersonas().setModel(modelo);
    
    
    }
    public void obtenerViajesPorPersona(){
    Persona persona = (Persona) this.vistaPrimcipal.getjComboBoxPersonas().getSelectedItem();
    int idPersona = persona.getIdpersona();
    
    this.servicioViaje.obtenerViajesPorPersona(idPersona);
    
    
    
    }

}
