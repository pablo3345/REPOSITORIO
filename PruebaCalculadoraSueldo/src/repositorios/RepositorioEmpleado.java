/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import java.util.ArrayList;
import modelo.Empleado;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pruebacalculadorasueldo.util.HibernateUtil;

/**
 *
 * @author pablo
 */
public class RepositorioEmpleado {

    public void guardar(Empleado empleado) {
        //este codigo lo copie de la pagina Tutorial spoint y borre lo que no me sirve
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(empleado);
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

    public Empleado obtenerEmpleadoGuardado(int idEmpleado) {
        Empleado empleado = null;

        Session session = HibernateUtil.getSessionFactory().openSession();//getSessionFactory() inicia la sesion
        Transaction tx = null;//la transaccion cuando inicia es null
        //aprender a leer esto
        try {
            tx = session.beginTransaction();
            empleado = (Empleado) session.get(Empleado.class, idEmpleado); //Obtiene el empleado a traves del id. Equivale a un select con HQL.
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return empleado;
    }

    public ArrayList<Empleado> obtenerTodos() //ArrayList<Empleado> = significa que el arrayList es solo de Foto
    {
        ArrayList<Empleado> arrayADevolver = null;

        // return this.listaEmpleados.toArray(arrayADevolver);
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
            //from Empleado es el tipo de consulta HQL  para obtener una lista de todos los Empleado
            arrayADevolver = (ArrayList<Empleado>) session.createQuery("FROM Empleado").list();

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
