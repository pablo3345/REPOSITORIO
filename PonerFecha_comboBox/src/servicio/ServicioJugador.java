/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import modelo.Jugador;
import repositorio.RepositorioJugador;

/**
 *
 * @author pablo
 */
public class ServicioJugador {

    private RepositorioJugador repositorioJugador;

    public ServicioJugador() {
        this.repositorioJugador = new RepositorioJugador();
    }

    public void guatdarJugador(String nombre, Integer diaNacimiento, String mesNacimiento, Integer añoNacimiento) {


        Jugador jugador = new Jugador(nombre, diaNacimiento, mesNacimiento, añoNacimiento);
        
        this.repositorioJugador.guardar(jugador);
    }

  

   

    

}
