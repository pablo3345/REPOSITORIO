/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.List;
import modelo.Nombrerepuesto;
import modelo.Repuesto;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author pablo
 */
public class RepositorioRepuesto {
    
     public void guardar(Repuesto repuesto)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();//getSessionFactory() inicia la sesion
        Transaction tx = null;//la transaccion cuando inicia es null
        //aprender a leer esto
        try {
         tx = session.beginTransaction();
         session.save(repuesto); //esto es lo que va a cambiar(session.save(emplado), entre guardar, obtener, eliminar etc. Esto seria un insert en SQL
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
       
    }
     
     
           public List<Repuesto> obtenerTodos()
    {
        List<Repuesto> repuestos = null;//cuando inicia es null
        
        Session session = HibernateUtil.getSessionFactory().openSession();//getSessionFactory() inicia la sesion
        Transaction tx = null;//la transaccion cuando inicia es null
        //aprender a leer esto
        try {
         tx = session.beginTransaction();
         repuestos = (List<Repuesto>) session.createCriteria(Repuesto.class).list();
         
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
       
        return repuestos;
    }
           
           
              public Repuesto obtenerRepuestoGuardado(int id_Repuesto) {
        Repuesto repuesto = null;

        Session session = HibernateUtil.getSessionFactory().openSession();//getSessionFactory() inicia la sesion
        Transaction tx = null;//la transaccion cuando inicia es null
        //aprender a leer esto
        try {
            tx = session.beginTransaction();
            repuesto = (Repuesto) session.get(Repuesto.class, id_Repuesto); //Obtiene el repuesto a traves del id. Equivale a un select con HQL.
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
       
        finally {
            session.close();
        }

        return repuesto;
    }
    
}
