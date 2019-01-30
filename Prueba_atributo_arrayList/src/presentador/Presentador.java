/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentador;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.Album;
import modelo.Foto;
import servicios.ServicioAlbum;
import servicios.ServicioFoto;
import vista.VistaPrincipal;

/**
 *
 * @author pablo
 */
public class Presentador {

    private VistaPrincipal vistaPrincipal;
    private ServicioFoto servicioFoto;
    private ServicioAlbum servicioAlbum;
    private Foto foto;

    public Presentador(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        this.servicioFoto = new ServicioFoto();
        this.servicioAlbum = new ServicioAlbum();
        this.rellenarComboBox();

    }

    public void guardarFotoApretado() {

        String nombreArchivo = this.vistaPrincipal.getjTextFieldNombreArchivo().getText();
        String tamaño = this.vistaPrincipal.getjTextFieldTamaño().getText();
        String descripcion = this.vistaPrincipal.getjTextFieldDescripcion().getText();
        int id_album = Integer.parseInt(this.vistaPrincipal.getjTextField_Id_album().getText());

        Album album = this.servicioAlbum.getAlbum(id_album);
        
         
        
       
        
        
        
        

        try {
            
            

            this.servicioFoto.guardarFoto(album, nombreArchivo, tamaño, descripcion);

            //this.vistaPrincipal.getjTextFieldAgregarPersonas().setText("");
            this.vistaPrincipal.getjTextFieldNombreArchivo().setText("");
            this.vistaPrincipal.getjTextFieldTamaño().setText("");
            this.vistaPrincipal.getjTextFieldDescripcion().setText("");
            this.vistaPrincipal.getjTextField_Id_album().setText("");
            

            JOptionPane.showMessageDialog(null, "la foto se guardo correctamente");

        } catch (IllegalArgumentException exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage());

        }
    }

    public void guardarAlbumApretado() {

        String nombre = this.vistaPrincipal.getjTextFieldNombre().getText();
        String cantidadMaxima = this.vistaPrincipal.getjTextFieldCantidadMaxima().getText();
      
             

        try {
           
         
             

            this.servicioAlbum.guardarAlbum(nombre, cantidadMaxima);

            this.vistaPrincipal.getjTextFieldNombre().setText("");
            this.vistaPrincipal.getjTextFieldCantidadMaxima().setText("");
            this.rellenarComboBox();
            
           
            
          
            
            

            JOptionPane.showMessageDialog(null, "el album se guardo correctamente");

        } catch (Exception e) {
        }
    }

    public void mostrarAlbumApretado() {

        this.servicioAlbum.mostrarInformacion();
    }

    public void mostrarFotosApretado() {

        this.servicioFoto.mostrarInformacionFotos();
    }

    private void rellenarComboBox() {
        //Obtener todos los albunes de la base de datos
        List<Album> albuness = this.servicioAlbum.obtenerTodos();

        //Crear el modelo con todos los albunes.
        DefaultComboBoxModel<Object> modeloComboBox = new DefaultComboBoxModel<>(albuness.toArray());

        //Setearle el modelo
        this.vistaPrincipal.getjComboBox1Album().setModel(modeloComboBox);
        
        

    }

    public void agregarFotosApretado() {
   
        Album albun = (Album) this.vistaPrincipal.getjComboBox1Album().getSelectedItem();
     
       
        
        
        
    
    
        
       
     
         
         
        
   
        
    
       
        
        
      
       
        
      
       
     
       
    
} 


            
           
           
}          
          
             
         
    


