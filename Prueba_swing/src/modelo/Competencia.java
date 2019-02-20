/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

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
    private int hora;
    private int minutos;
    private Date fechaIngreso;
    
    int hora1 = this.ponerHora();
    int minutos2 = this.ponerMinutod();


    public Competencia(String pais, String fecha, int cantidadDeKilometros, double tiempoRecorrido, Deportista aDeportista) {

        this.pais = pais;
        this.fecha = fecha;
        this.cantidadDeKilometros = cantidadDeKilometros;
        this.tiempoRecorrido = tiempoRecorrido;
        this.aDeportista = aDeportista;
      

    }
   
    String fechaActual = this.ponerFechaActual();

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

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }
    
    

  
    
    

    public String ponerFechaActual() {

        String sd = "25/12/2018";
        SimpleDateFormat formato = new SimpleDateFormat("dd 'de' MMMM 'del' yyyy", new Locale("es", "VE"));
        Date fecha = new Date();
        String fechaFormateada = formato.format(fecha);
        return fechaFormateada;

    }
    public int ponerHora(){
     java.util.Date fecha = new Date();
      this.hora = fecha.getHours();
      
      return hora;
    
    
    }
    
    public int ponerMinutod(){
         java.util.Date fecha = new Date();
         this.minutos = fecha.getMinutes();
         return minutos;
    
    
    
    }

    
     
      
    

    @Override
    public String toString() {
        return "\n"+"♦ "+aDeportista + "La competencia se realizo en: "+ pais + " " + fecha + " \n" +"Cantidad de kilometros: "+ cantidadDeKilometros + " Tiempo recorrido: " + tiempoRecorrido + "minutos"  + "\n" + "La fecha de ingreso es : " + fechaActual+ "\n Se ingreso a las: "+ hora1+ ":"+ minutos2 + " minutos";
    }

}
