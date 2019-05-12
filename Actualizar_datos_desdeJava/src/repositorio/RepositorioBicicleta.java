/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import bicicletas.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import modelo.Bicicleta;
import modelo.Compra;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author pablo
 */
public class RepositorioBicicleta {

    public void guardar(Bicicleta bicicleta) {
        //este codigo lo copie de la pagina Tutorial spoint y borre lo que no me sirve
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(bicicleta);
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

    public List<Bicicleta> obtenerTodos() {
        List<Bicicleta> bicicletas = null;//cuando inicia es null

        Session session = HibernateUtil.getSessionFactory().openSession();//getSessionFactory() inicia la sesion
        Transaction tx = null;//la transaccion cuando inicia es null
        //aprender a leer esto
        try {
            tx = session.beginTransaction();
            bicicletas = (List<Bicicleta>) session.createCriteria(Bicicleta.class).list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return bicicletas;
    }
    
    
    
    
  
    
    
      
    
    
    


 
}
