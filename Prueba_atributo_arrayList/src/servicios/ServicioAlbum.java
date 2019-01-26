/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Album;
import modelo.Foto;
import repositorio.RepositorioAlbum;

/**
 *
 * @author pablo
 */
public class ServicioAlbum {

    private RepositorioAlbum repositorioAlbum;

    public ServicioAlbum() {
        this.repositorioAlbum = new RepositorioAlbum();
    }

    public void guardarAlbum(String nombre, String cantidadMaxima) {
        int cantidadMaximaConvertida = this.parsearCantidadMaxima(cantidadMaxima);

        Album album = new Album(nombre, cantidadMaximaConvertida);
        
      

        this.repositorioAlbum.guardar(album);

    }

    private int parsearCantidadMaxima(String cantidadMaxima) {

        try {
            int cantidadMaximaParseada = Integer.valueOf(cantidadMaxima);
            return cantidadMaximaParseada;
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("cantidad maxima incorrecta");
        }

    }

    public void mostrarInformacion() {
        //este codigo ya estaba cuando me descargue el trabajo, no agregue nada
        String mensaje = "";
        //obtiene los empleados desde repositor y los guarda en el array Empleado
        ArrayList<Album> albunes = this.repositorioAlbum.obtenerTodos();

        for (Album albun : albunes) {
            mensaje += "Id: " + albun.getIdalbum() + " "
                    + "Nombre: " + albun.getNombre()
                    + ", Cantidad de fotos: " + albun.getCantidadMaxima()
                  
                    
                    + "\n";

        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public Album getAlbum(int id_Album) {
        // Vamos a obtener el album a traves del ID. NOs comunicamos con el repositorio, porque ahí se realizan las consultas 
        //a la BD(almacernar o recuperar datos)
        Album album = this.repositorioAlbum.obtenerAlbumGuardado(id_Album);

        return album;
    }

    public Album obtenerAlbunGuardado(int id_Album) {
        Album albumm = this.repositorioAlbum.obtenerAlbumGuardado(id_Album);

        return albumm;

    }

    public List<Album> obtenerTodos() {
        List<Album> albunessAlbums = this.repositorioAlbum.obtenerTodosenUnList();

        return albunessAlbums;

    }

  

  

}
