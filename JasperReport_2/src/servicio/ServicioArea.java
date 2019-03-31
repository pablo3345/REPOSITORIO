/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import javassist.compiler.TokenId;
import javax.swing.JOptionPane;
import modelo.Area;
import repositorio.RepositorioArea;

/**
 *
 * @author pablo
 */
public class ServicioArea {

    private RepositorioArea repositoreArea;

    public ServicioArea() {
        this.repositoreArea = new RepositorioArea();

    }

    public void guardarArea(String nombre, String cantidad) {
        int cantidadConvertida = this.validarCantidad(cantidad);

        Area area = new Area(nombre, cantidadConvertida);

        this.repositoreArea.guardarArea(area);

    }

    private int validarCantidad(String cantidad) {

        try {
            int cantidadParseado = Integer.parseInt(cantidad);
            return cantidadParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("cantidad incorrecta");
        }

    }

    public Area getArea(int idArea) {
        // Vamos a obtener el area a traves del ID. NOs comunicamos con el repositorio, porque ahí se realizan las consultas a la BD(almacernar o recuperar datos)
        Area area = this.repositoreArea.obtenerAreaGuardado(idArea);

        return area;
    }

    public void areaDeMenorEmpleados() {

        ArrayList<Area> delas = (ArrayList<Area>) repositoreArea.obtenerValorMinimo();
        JOptionPane.showMessageDialog(null, delas.toArray());

    }

    public void areaDeMayorEmpleados() {

        ArrayList<Area> deloss = (ArrayList<Area>) repositoreArea.obtenerValorMaximo();

        JOptionPane.showMessageDialog(null, deloss.toArray());

    }
    
    public ArrayList<Area> obtenerTodosArea(){
    ArrayList<Area> arrayObtener = (ArrayList<Area>) this.repositoreArea.obtenerTodos();
    
    
    return arrayObtener;
    
    }
    
    public void eliminarArea(Area area){
        
        this.repositoreArea.eliminarArea(area);
    
    
    
    
    }

}
