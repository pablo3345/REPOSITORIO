/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import hibernateUtil.HibernateUtil;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Proveedores;
import modelo.Repuesto;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author pablo
 */
public class RepositorioRepuesto {
    
    public void guardarRespuesto(Repuesto repuesto){
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(repuesto);
            tx.commit();
        } catch (HibernateException e) {
            if(tx!= null) tx.rollback();
            e.printStackTrace();
         
            
        }finally{
        
        session.close();
        }
    
    
    
    
    }
    
       public ArrayList<Repuesto> obtenerTodosRepuestos()
     //ArrayList<Empleado> = significa que el arrayList es solo de Foto
    {
        ArrayList<Repuesto> arrayADevolver = null;
        
       // return this.listaEmpleados.toArray(arrayADevolver);
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        
        try {
         tx = session.beginTransaction();
         //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
         //from Foto es el tipo de consulta HQL  para obtener una lista de todos los Empleado
         arrayADevolver = (ArrayList<Repuesto>) session.createQuery("FROM Repuesto").list(); 
         
         
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
        
        return arrayADevolver;
    }
       
       
          public Repuesto obtenerRepuestoGuardado(int id_Repuesto) {
        Repuesto repuesto = null;

        Session session = HibernateUtil.getSessionFactory().openSession();//getSessionFactory() inicia la sesion
        Transaction tx = null;//la transaccion cuando inicia es null
        //aprender a leer esto
        try {
            tx = session.beginTransaction();
            repuesto = (Repuesto) session.get(Repuesto.class, id_Repuesto); //Obtiene el album a traves del id. Equivale a un select con HQL.
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
