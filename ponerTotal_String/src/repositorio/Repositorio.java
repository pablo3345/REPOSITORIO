/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import modelo.TotalString;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;




/**
 *
 * @author pablo
 */
public class Repositorio {
    
    
      public void guardarTotal(TotalString modeloString) {
        //este codigo lo copie de la pagina Tutorial spoint y borre lo que no me sirve
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(modeloString);
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
      
      
      
        public void ponerDoubleAlTotalString(double ponerTotal) {
        //este codigo lo copie de la pagina Tutorial spoint y borre lo que no me sirve
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
             String hql = "update TotalString set total = "+ponerTotal+" where idtotalString = 5";
            Query actualizarMesa=session.createQuery(hql);
            actualizarMesa.executeUpdate();
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
    
    
    

    
}
