/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Mesa;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author pablo
 */
public class RepositorioMesa {
    
      public void guardarMesa(Mesa mesa) {
        //este codigo lo copie de la pagina Tutorial spoint y borre lo que no me sirve
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(mesa);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

    } public ArrayList<Mesa> obtenerTodosMesas() //ArrayList<Empleado> = significa que el arrayList es solo de Foto
    {
        ArrayList<Mesa> arrayADevolver = null;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
            //from Foto es el tipo de consulta HQL  para obtener una lista de todos los Empleado
            arrayADevolver = (ArrayList<Mesa>) session.createQuery("FROM Mesa").list();

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
    
    public void actualizarMesa(int idMesas) //ArrayList<Empleado> = significa que el arrayList es solo de Foto
    {
       // ArrayList<Cliente> arrayADevolver = null;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
            //from Foto es el tipo de consulta HQL  para obtener una lista de todos los Empleado
             String hql = "update Mesa set estado = 'ocupada' where idMesa = :idMesas ";
             Query consultaActualizar = session.createQuery(hql);
             consultaActualizar.setParameter("idMesas", idMesas);
             consultaActualizar.executeUpdate();

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
    
       public ArrayList<Mesa> obtenerMesasOcupadas() //ArrayList<Empleado> = significa que el arrayList es solo de Foto
    {
        ArrayList<Mesa> arrayADevolver = null;
        ArrayList<Mesa> mesasOcupadas = new ArrayList<>();

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
            //from Foto es el tipo de consulta HQL  para obtener una lista de todos los Empleado
            arrayADevolver = (ArrayList<Mesa>) session.createQuery("FROM Mesa").list();
            
            for(Mesa mesas : arrayADevolver){
            if(mesas.getEstado().equals("ocupada")){
            mesasOcupadas.add(mesas);
            
            
            
            }
            
            
            }

            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return mesasOcupadas;
    }
      
    
}
