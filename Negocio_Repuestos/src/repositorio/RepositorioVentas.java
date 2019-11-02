/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import hibernateUtil.HibernateUtil;
import java.util.ArrayList;
import modelo.Proveedores;
import modelo.Repuesto;
import modelo.Ventas;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author pablo
 */
public class RepositorioVentas {

    public void guardarVentas(Ventas ventas) {
        Session session = HibernateUtil.getSessionFactory().openSession();//getSessionFactory() inicia la sesion
        Transaction tx = null;//la transaccion cuando inicia es null
        //aprender a leer esto
        try {
            tx = session.beginTransaction();
            session.save(ventas); //esto es lo que va a cambiar(session.save(emplado), entre guardar, obtener, eliminar etc. Esto seria un insert en SQL
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

    }

    public ArrayList<Ventas> obtenerTodosVentas() //ArrayList<Empleado> = significa que el arrayList es solo de Foto
    {
        ArrayList<Ventas> arrayADevolver = null;

        // return this.listaEmpleados.toArray(arrayADevolver);
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
            //from Foto es el tipo de consulta HQL  para obtener una lista de todos los Empleado
            arrayADevolver = (ArrayList<Ventas>) session.createQuery("FROM Ventas").list();

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

    public Ventas obtenerVentasGuardado(int id_Ventas) {
        Ventas ventas = null;

        Session session = HibernateUtil.getSessionFactory().openSession();//getSessionFactory() inicia la sesion
        Transaction tx = null;//la transaccion cuando inicia es null
        //aprender a leer esto
        try {
            tx = session.beginTransaction();
            ventas = (Ventas) session.get(Ventas.class, id_Ventas); //Obtiene el album a traves del id. Equivale a un select con HQL.
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return ventas;
    }

}
