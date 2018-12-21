/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import modelo.Deportista;

/**
 *
 * @author pablo
 */
public class RepositorioDeportista {

    private static ArrayList<Deportista> deportistasGuardados;

    public RepositorioDeportista() {
        this.deportistasGuardados = new ArrayList<>();
    }

  

    public void guardarDeportistas(Deportista deportista) {
        this.deportistasGuardados.add(deportista);

    }

    public ArrayList<Deportista> obtenerDeportistas() {

        return this.deportistasGuardados;

    }

}
