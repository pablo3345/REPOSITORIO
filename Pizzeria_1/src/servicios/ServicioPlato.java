/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Plato;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import repositorio.RepositorioPlato;
import util.HibernateUtil;

/**
 *
 * @author pablo
 */
public class ServicioPlato {

    private RepositorioPlato repositorioPlato;

    public ServicioPlato() {
        this.repositorioPlato = new RepositorioPlato();
    }

    public void guardarPlato(String nombre, String costoDelPlato, String precioAlPublico, String tipo) {

        double costoConvertido = validarCostoDelPlato(costoDelPlato);
        double precioAlPublicoConvertido = validarPrecioAlPublico(precioAlPublico);

        Plato plato = new Plato(nombre, costoConvertido, precioAlPublicoConvertido, tipo);
        this.repositorioPlato.guardarPlato(plato);
    }

    private double validarCostoDelPlato(String costoDelPlato) {

        try {
            double costoDelPlatoParseado = Double.valueOf(costoDelPlato);
            return costoDelPlatoParseado;

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("costo del Plato equivocado");
        }

    }

    private double validarPrecioAlPublico(String precioAlPublico) {
        try {
            double precioAlPublicoParseado = Double.valueOf(precioAlPublico);
            return precioAlPublicoParseado;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("precio del Plato incorrecto");
        }
    }
      public ArrayList<Plato> obtenerTodosPlato() //ArrayList<Empleado> = significa que el arrayList es solo de Foto
    {
        ArrayList<Plato> arrayADevolver = null;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
            //from Foto es el tipo de consulta HQL  para obtener una lista de todos los Empleado
            arrayADevolver = (ArrayList<Plato>) session.createQuery("FROM Plato").list();

            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return arrayADevolver;
    }

}
