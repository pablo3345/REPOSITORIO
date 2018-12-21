/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


/**
 *
 * @author pablo
 */
public class Competencia {

    private String pais;
    private String fecha;
    private int cantidadDeKilometros;
    private double tiempoRecorrido;
    private Deportista arrayDeportista;
    

    public Competencia(String pais, String fecha, int cantidadDeKilometros, double tiempoRecorrido, Deportista arrayDeportista) {

        this.pais = pais;
        this.fecha = fecha;
        this.cantidadDeKilometros = cantidadDeKilometros;
        this.tiempoRecorrido = tiempoRecorrido;
        this.arrayDeportista = arrayDeportista;

    }

   

    public String getPais() {
        return pais;
    }

    public String getFecha() {
        return fecha;
    }

    public int getCantidadDeKilometros() {
        return cantidadDeKilometros;
    }

    public double getTiempoRecorrido() {
        return tiempoRecorrido;
    }

    public Deportista getArrayDeportista() {
      
        return arrayDeportista;
    }

    @Override
    public String toString() {
        return pais +" " + fecha + " "+cantidadDeKilometros + " "+tiempoRecorrido + " "+ arrayDeportista +"\n";
    }
    
    

   
    

}
