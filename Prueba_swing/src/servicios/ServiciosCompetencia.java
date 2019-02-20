/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Competencia;
import modelo.Deportista;
import repositorio.RepositorioCompetencia;

public class ServiciosCompetencia {

    private RepositorioCompetencia repositorioCompetencia;

    public ServiciosCompetencia() {

        this.repositorioCompetencia = new RepositorioCompetencia();

    }

    public void guardarCompetencia(String pais, String fecha, String cantidadDeKilometros, String tiempoRecorrido, Deportista depor) throws ParseException {

        int cantidadDeKilometrosParseado = 0;
        cantidadDeKilometrosParseado = this.validarcantidaddeKilometros(cantidadDeKilometros);

        double tiempoRecorridoParseado = 0;

        tiempoRecorridoParseado = this.validarTiempoRecorrido(tiempoRecorrido);

        Competencia competencia = new Competencia(pais, fecha, cantidadDeKilometrosParseado, tiempoRecorridoParseado, depor);
        this.repositorioCompetencia.guardarCompetencia(competencia);

    }

    public int validarcantidaddeKilometros(String cantidadDeKilometros) {

        try {
            int cantidadDeKilometrosParseado = Integer.parseInt(cantidadDeKilometros);
            if (cantidadDeKilometrosParseado <= 0) {
                throw new IllegalArgumentException("Los kilometros son incorrectos");

            }
            return cantidadDeKilometrosParseado;

        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("El kilometraje es invalido");
        }

    }

    public double validarTiempoRecorrido(String tiemporecorrido) {

        try {
            double tiempoRecorridoParseado = Double.parseDouble(tiemporecorrido);

            return tiempoRecorridoParseado;
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("El tiempo recorrido es incorrecto");
        }

    }

    public ArrayList<Competencia> mostrarCompetencia() {
        ArrayList<Competencia> compe = new ArrayList<>();
        compe = this.repositorioCompetencia.obtenerCompetencias();

        return compe;

    }

    public ArrayList<Competencia> obtenerTransferenciasRelacionadas(Deportista deportistaa) {

        return this.repositorioCompetencia.getMovimientosRelacionados(deportistaa);

    }

    public void paisesCorrectos(String pais) {
        if ("francia".equals(pais)) {
            JOptionPane.showMessageDialog(null, "pais correcto");
        } else if ("peru".equals(pais)) {
            JOptionPane.showMessageDialog(null, "pais correcto");

        } else if ("japon".equals(pais)) {
            JOptionPane.showMessageDialog(null, "pais correcto");

        } else if ("brasil".equals(pais)) {
            JOptionPane.showMessageDialog(null, "pais correcto");

        } else {
            throw new IllegalArgumentException("pais incorrecto");
        }

    }

}
