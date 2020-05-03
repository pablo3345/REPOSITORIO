/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import repositorio.RepositorioPropietario;

/**
 *
 * @author pablo
 */
public class ServicioPropietario {

    private RepositorioPropietario repositorioPropietario;

    public ServicioPropietario() {
        this.repositorioPropietario = new RepositorioPropietario();

    }

    public ArrayList<Object> obtenerConsultaHQL() {

        ArrayList<Object> array = this.repositorioPropietario.obtenerConsultaHQL();

        return array;

    }

}
