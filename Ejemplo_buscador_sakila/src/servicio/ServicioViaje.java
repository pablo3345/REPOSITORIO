/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Persona;
import modelo.Viajes;
import repositorio.RepositorioViaje;

/**
 *
 * @author pablo
 */
public class ServicioViaje {

    private RepositorioViaje repositorioViaje;

    public ServicioViaje() {
        this.repositorioViaje = new RepositorioViaje();
    }

    public void guardarViaje(Persona persona, String ciudad, String pais, String fechaDelViaje) {

        Viajes viaje = new Viajes(persona, ciudad, pais, fechaDelViaje);

        this.repositorioViaje.guardar(viaje);

    }

    public void obtenerViajesPorPersona(int idPersona) {

        ArrayList<Viajes> delas = this.repositorioViaje.obtenerTodosPorPersona(idPersona);

        String mensaje = "";

        for (Viajes via : delas) {

            mensaje += via.getCiudad() + " "
                    + via.getPais() + " "
                    + via.getFechaDelViaje() + "\n";

        }
        JOptionPane.showMessageDialog(null, mensaje);

    }

}
