/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.List;
import modelo.DetalleVenta;
import modelo.Fabrica;
import modelo.Repuesto;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author pablo
 */
public class RepositorioDetalle_venta {
    
           public Fabrica obtenerFabricaGuardada(int idFabrica) {
        Fabrica fabrica = null;

        Session session = HibernateUtil.getSessionFactory().openSession();//getSessionFactory() inicia la sesion
        Transaction tx = null;//la transaccion cuando inicia es null
        //aprender a leer esto
        try {
            tx = session.beginTransaction();
            fabrica = (Fabrica) session.get(Fabrica.class, idFabrica); //Obtiene el album a traves del id. Equivale a un select con HQL.
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

        return fabrica;
    }
           
            public void guardar(DetalleVenta detalleVenta)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();//getSessionFactory() inicia la sesion
        Transaction tx = null;//la transaccion cuando inicia es null
        //aprender a leer esto
        try {
         tx = session.beginTransaction();
         session.save(detalleVenta); //esto es lo que va a cambiar(session.save(emplado), entre guardar, obtener, eliminar etc. Esto seria un insert en SQL
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
       
    }
            
                public List<Double> obtenerConsulta()
    {
        List<Double> detalleVentas = null;//cuando inicia es null
        
        Session session = HibernateUtil.getSessionFactory().openSession();//getSessionFactory() inicia la sesion
        Transaction tx = null;//la transaccion cuando inicia es null
        //aprender a leer esto
        try {
         tx = session.beginTransaction();
        // fabrica = (List<Fabrica>) session.createCriteria(Fabrica.class).list();
         tx.commit();
         detalleVentas =  session.createQuery("select sum(total) from DetalleVenta").list();
        
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
       
        return detalleVentas;
    }
    
}
