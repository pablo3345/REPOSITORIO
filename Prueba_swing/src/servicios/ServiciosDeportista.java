/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Deportista;
import repositorio.RepositorioDeportista;

/**
 *
 * @author pablo
 */
public class ServiciosDeportista {

    private RepositorioDeportista repositorioDeportista;

    public ServiciosDeportista() {
        this.repositorioDeportista = new RepositorioDeportista();

    }

    public Deportista guardarDeportista(String nombre, String apellido, String dni) {
      
        int dniParseado = 0;
        dniParseado = this.validarDNI(dni);
     
      
      

        Deportista deportista = new Deportista(nombre, apellido, dniParseado);

        this.repositorioDeportista.guardarDeportistas(deportista);

        return deportista;
    
    }
  private int validarDNI(String dni) {
        try {
            int dniParseado = Integer.valueOf(dni);
           
            if (dniParseado <= 0) {
                throw new IllegalArgumentException("El dni es incorrecto");
               
            }
              return dniParseado;
        } catch (NumberFormatException excepcion) {
            throw new IllegalArgumentException("El dni es invalido");

        }

    }
  
  public ArrayList<Deportista> mostrarDeportistas(){
  ArrayList<Deportista> depor = new ArrayList<>();
  depor = this.repositorioDeportista.obtenerDeportistas();
     
  return depor;
  
  }


}