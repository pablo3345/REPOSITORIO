/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.List;
import modelo.Fabrica;
import modelo.Repuesto;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author pablo
 */
public class RepositorioFabrica {

    public void guardar(Fabrica fabrica) {
        Session session = HibernateUtil.getSessionFactory().openSession();//getSessionFactory() inicia la sesion
        Transaction tx = null;//la transaccion cuando inicia es null
        //aprender a leer esto
        try {
            tx = session.beginTransaction();
            session.save(fabrica); //esto es lo que va a cambiar(session.save(emplado), entre guardar, obtener, eliminar etc. Esto seria un insert en SQL
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

    public Repuesto obtenerRepuestoGuardado(int idRepuesto) {
        Repuesto repuesto = null;

        Session session = HibernateUtil.getSessionFactory().openSession();//getSessionFactory() inicia la sesion
        Transaction tx = null;//la transaccion cuando inicia es null
        //aprender a leer esto
        try {
            tx = session.beginTransaction();
            repuesto = (Repuesto) session.get(Repuesto.class, idRepuesto); //Obtiene el empleado a traves del id. Equivale a un select con HQL.
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return repuesto;
    }

    public List<Fabrica> obtenerTodos() {
        List<Fabrica> fabricas = null;//cuando inicia es null

        Session session = HibernateUtil.getSessionFactory().openSession();//getSessionFactory() inicia la sesion
        Transaction tx = null;//la transaccion cuando inicia es null
        //aprender a leer esto
        try {
            tx = session.beginTransaction();
            fabricas = (List<Fabrica>) session.createCriteria(Fabrica.class).list();

            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return fabricas;
    }



}
