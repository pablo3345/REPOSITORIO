/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import bicicletas.util.HibernateUtil;
import modelo.Bicicleta;
import modelo.Detallecompra;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author pablo
 */
public class RepositorioDetalleCompra {
    
       public void guardar(Detallecompra detalleCompra) {
        //este codigo lo copie de la pagina Tutorial spoint y borre lo que no me sirve
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(detalleCompra);
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
