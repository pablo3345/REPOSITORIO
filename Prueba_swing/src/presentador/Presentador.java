/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.ComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
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

    public void guardarCompetenciaApretado() throws ParseException {
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

    public void colocarImagenes() {
        //en el video hizo todo en la vista, hizo un evento (event), con boton derecho del comboBox eligio item y luego itemStateChanged.
        //video por internet "Poner una imagen en un objeto de java (Netbeans)"
          int posicion;
        String lugarImagen;
        URL url = null;
        posicion = this.vista. getjComboBoxTorneos().getSelectedIndex();
        switch (posicion) {
            case 0:
                lugarImagen = "/vista/Peru.jpg";
                url = this.getClass().getResource(lugarImagen);
                ImageIcon imageIcon = new ImageIcon(url);
                this.vista.getjLabel16Imagenes().setIcon(imageIcon);
                break;
            case 1:
                lugarImagen = "/vista/Francia.jpg";
                url = this.getClass().getResource(lugarImagen);
                ImageIcon imageIconn = new ImageIcon(url);
                this.vista.getjLabel16Imagenes().setIcon(imageIconn);
                break;
            case 2:
                lugarImagen = "/vista/Brasil.jpg";
                url = this.getClass().getResource(lugarImagen);
                ImageIcon imageIconn2 = new ImageIcon(url);
                this.vista.getjLabel16Imagenes().setIcon(imageIconn2);

                break;

            case 3:
                lugarImagen = "/vista/Japon.jpg";
                url = this.getClass().getResource(lugarImagen);
                ImageIcon imageIconn3 = new ImageIcon(url);
                this.vista.getjLabel16Imagenes().setIcon(imageIconn3);

                break;
    }

   

   

    }

  

   

    

   

  

}