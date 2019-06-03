/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import modelo.Dimension;
import repositorio.RepositorioDimension;

/**
 *
 * @author pablo
 */
public class ServicioDimension {
    
    private RepositorioDimension repositorioDimension;

    public ServicioDimension() {
        this.repositorioDimension = new RepositorioDimension();
    }
    
    

    public void guardarDimension(String nombre, String ancho, String largo) {
        double anchoConvertido = this.validarAncho(ancho);
        double largoConvertido = this.validarLargo(largo);
        this.validarNombre(nombre);

        Dimension dimension = new Dimension(nombre, anchoConvertido, largoConvertido);
        this.repositorioDimension.guardarDimension(dimension);

    }

    private double validarAncho(String ancho) {

        try {

            double anchoParseado = Double.parseDouble(ancho);

            if (anchoParseado <= 0) {
                throw new IllegalArgumentException("numero de ancho vacio");

            }

            return anchoParseado;

        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("medida de ancho incorrecto");

        }

    }

    private double validarLargo(String largo) {
        try {
            double largoParseado = Double.valueOf(largo);

            if (largoParseado <= 0) {
                throw new IllegalArgumentException("medida de largo vacio");

            }

            return largoParseado;
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("medida largo incorrecto");
        }

    }
    
    public ArrayList<Dimension> obtenerTodosDimension(){
    
        ArrayList<Dimension> arrayDimension = this.repositorioDimension.obtenerTodos();
        
        return arrayDimension;
    
    
    }
    
    private void validarNombre(String nombre){
        if(nombre.length() ==0){
        throw new IllegalArgumentException("nombre vacio");
        
        }
    
    
    }

    public void eliminarDimension(Dimension dimension) {
       this.repositorioDimension.eliminarDimension(dimension);
    }

}
