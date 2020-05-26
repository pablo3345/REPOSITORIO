/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Factura;
import modelo.Pedido;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author pablo
 */
public class RepositorioFactura {
    
        public void guardarFactura(Factura factura) {
        //este codigo lo copie de la pagina Tutorial spoint y borre lo que no me sirve
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(factura);
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
        
           public ArrayList<Factura> obtenerTodosFactura() //ArrayList<Empleado> = significa que el arrayList es solo de Foto
    {
        ArrayList<Factura> arrayADevolver = null;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
            //from Foto es el tipo de consulta HQL  para obtener una lista de todos los Empleado
            arrayADevolver = (ArrayList<Factura>) session.createQuery("FROM Factura").list();

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
        
           public void truncarTabla() {
        //este codigo lo copie de la pagina Tutorial spoint y borre lo que no me sirve
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.createSQLQuery("truncate Factura").executeUpdate();
          
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
           
            public ArrayList<Double> obtenerTotalFactura() //ArrayList<Empleado> = significa que el arrayList es solo de Foto
    {
        ArrayList<Double> arrayADevolver = null;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
            //from Foto es el tipo de consulta HQL  para obtener una lista de todos los Empleado

            arrayADevolver = (ArrayList<Double>) session.createQuery("SELECT sum(cantidad * precio) FROM Factura ").list();

            // arrayADevolver = (ArrayList<Double>) session.createQuery("SELECT sum(cantidad * precio) FROM Factura ").list();
            // arrayADevolver = (ArrayList<Factura>) session.createQuery("FROM Factura ").list();
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
            
            
        public void ponerMesasDisponiblesFacturas(int idMesa) {
        //este codigo lo copie de la pagina Tutorial spoint y borre lo que no me sirve
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        

        try {
            tx = session.beginTransaction();
            String hql = "update Mesa set estado = 'disponible' where idMesa ="+idMesa;
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
        
          public void ponerPedidoPasivo(int idPedido) {
        //este codigo lo copie de la pagina Tutorial spoint y borre lo que no me sirve
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        //ArrayList<Factura> obtenerFacturas = this.obtenerTodosFactura();
      
        try {
            tx = session.beginTransaction();
            
            
          
            
            String hql = "update Pedido set estado = 'pasivo' where idPedido ="+ idPedido;
            Query actualizarPedido=session.createQuery(hql);
            actualizarPedido.executeUpdate();
            
            
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
          
             public void poneerElTotal(double ulTimoValorTotal) {
        //este codigo lo copie de la pagina Tutorial spoint y borre lo que no me sirve
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        

        try {
            tx = session.beginTransaction();
            String hql = "update Factura set total =" +ulTimoValorTotal+ "where idFactura ="+1;
            Query ponerTotal=session.createQuery(hql);
            ponerTotal.executeUpdate();
            
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
