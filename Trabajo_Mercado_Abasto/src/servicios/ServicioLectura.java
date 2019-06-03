/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Lectura;
import modelo.Puesto;
import repositorio.RepositorioLectura;

/**
 *
 * @author pablo
 */
public class ServicioLectura {
    
    private RepositorioLectura repositorioLectura;

    public ServicioLectura() {
        this.repositorioLectura = new RepositorioLectura();
    }
    
    

    public void guardarLectura(Puesto puesto, Timestamp fecha, String lecturakw, String precio) {
        int lecturaConvertida = this.validarLecturakw(lecturakw);
        double precioConvertido = this.validarPrecio(precio);

        Lectura lectura = new Lectura(puesto, fecha, lecturaConvertida, precioConvertido);
        
        this.repositorioLectura.guardarLectura(lectura);

    }

    private int validarLecturakw(String lecturakw) {
        try {
            int lecturakwParseado = Integer.parseInt(lecturakw);

            if (lecturakwParseado <= 0) {

                throw new IllegalArgumentException("lectura kw vacio");

            }
           

            return lecturakwParseado;

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("lectura incorrecto");

        }

    }

    private double validarPrecio(String precio) {
        try {
            double precioParseado = Double.parseDouble(precio);

            if (precioParseado <= 0) {
                throw new IllegalArgumentException("precio vacio");

            }
            return precioParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("precio incorrecto");
        }

    }
    
 

}
