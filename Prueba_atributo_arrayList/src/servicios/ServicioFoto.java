/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.Album;
import modelo.Foto;
import repositorio.RepositorioFoto;

/**
 *
 * @author pablo
 */
public class ServicioFoto {

    private RepositorioFoto repositorioFoto;

    public ServicioFoto() {
        this.repositorioFoto = new RepositorioFoto();
    }

    public void guardarFoto(Album album, String nombreArchivo, String tamaño, String descripcion) {
        int cantidadConvertida = this.validadTamaño(tamaño);

        Foto foto = new Foto(album, nombreArchivo, cantidadConvertida, descripcion);
      
      

        this.repositorioFoto.guardarFoto(foto);
     
    }

    private int validadTamaño(String cantidad) {

        try {
            int cantidadParseado = Integer.parseInt(cantidad);
            return cantidadParseado;
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("la cantidad es invalida");
        }

    }

    public void mostrarInformacionFotos() {
        //este codigo ya estaba cuando me descargue el trabajo, no agregue nada
        String mensaje = "";
        //obtiene las fotos desde repositor y los guarda en el array fotos
        ArrayList<Foto> fotos = this.repositorioFoto.obtenerTodos();

        for (Foto foto : fotos) {

            mensaje += "Id Foto: " + foto.getIdfoto() + " "
                    + "Nombre: " + foto.getNombreArchivo()
                    + " Tamaño: " + foto.getTamaño()
                    + " Id album: " + foto.getAlbum().getIdalbum() + " "
                    + "Descripcion: " + foto.getDescripcion()
                    + " \n ";

        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
     public void mostrarInformacionFotosPorAlbum(int idAlbum) {
       
        String mensaje = "";
       
        ArrayList<Foto> fotos = this.repositorioFoto.obtenerTodosPorAlbum(idAlbum);

        for (Foto foto : fotos) {

            mensaje += "Id Foto: " + foto.getIdfoto() + " "
                    + "Nombre: " + foto.getNombreArchivo()
                    + " Tamaño: " + foto.getTamaño()
                    + " Id album: " + foto.getAlbum().getIdalbum() + " "
                    + "Descripcion: " + foto.getDescripcion()
                    + " \n ";

        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public List<Foto> obtenerTodosFotos() {
        List<Foto> albunessAlbums = this.repositorioFoto.obtenerTodos();

        return albunessAlbums;

    }

   

   

}
