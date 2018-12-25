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
    private Deportista aDeportista;
    

    public Competencia(String pais, String fecha, int cantidadDeKilometros, double tiempoRecorrido, Deportista aDeportista) {

        this.pais = pais;
        this.fecha = fecha;
        this.cantidadDeKilometros = cantidadDeKilometros;
        this.tiempoRecorrido = tiempoRecorrido;
        this.aDeportista = aDeportista;

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

    public Deportista getADeportista() {
      
        return aDeportista;
    }

    @Override
    public String toString() {
        return pais +" " + fecha + " "+cantidadDeKilometros + " "+tiempoRecorrido + " "+ aDeportista +"\n";
    }
    
    

   
    

}
