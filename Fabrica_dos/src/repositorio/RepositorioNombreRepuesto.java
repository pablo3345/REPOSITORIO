/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.List;
import modelo.Nombrerepuesto;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author pablo
 */
public class RepositorioNombreRepuesto {
    
     public void guardar(Nombrerepuesto nombrerepuesto)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();//getSessionFactory() inicia la sesion
        Transaction tx = null;//la transaccion cuando inicia es null
        //aprender a leer esto
        try {
         tx = session.beginTransaction();
         session.save(nombrerepuesto); //esto es lo que va a cambiar(session.save(emplado), entre guardar, obtener, eliminar etc. Esto seria un insert en SQL
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
       
    }
     
       public List<Nombrerepuesto> obtenerTodos()
    {
        List<Nombrerepuesto> nombrerepuestos = null;//cuando inicia es null
        
        Session session = HibernateUtil.getSessionFactory().openSession();//getSessionFactory() inicia la sesion
        Transaction tx = null;//la transaccion cuando inicia es null
        //aprender a leer esto
        try {
         tx = session.beginTransaction();
         nombrerepuestos = (List<Nombrerepuesto>) session.createCriteria(Nombrerepuesto.class).list();
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
       
        return nombrerepuestos;
    }
    
}
