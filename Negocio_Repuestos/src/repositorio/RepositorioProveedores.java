/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import hibernateUtil.HibernateUtil;
import java.util.ArrayList;
import modelo.Proveedores;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author pablo
 */
public class RepositorioProveedores {
      public void guardarProveedor(Proveedores proveedor)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();//getSessionFactory() inicia la sesion
        Transaction tx = null;//la transaccion cuando inicia es null
        //aprender a leer esto
        try {
         tx = session.beginTransaction();
         session.save(proveedor); //esto es lo que va a cambiar(session.save(emplado), entre guardar, obtener, eliminar etc. Esto seria un insert en SQL
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
       
    }
      
        public ArrayList<Proveedores> obtenerTodos()
     //ArrayList<Empleado> = significa que el arrayList es solo de Foto
    {
        ArrayList<Proveedores> arrayADevolver = null;
        
       // return this.listaEmpleados.toArray(arrayADevolver);
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        
        try {
         tx = session.beginTransaction();
         //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
         //from Foto es el tipo de consulta HQL  para obtener una lista de todos los Empleado
         arrayADevolver = (ArrayList<Proveedores>) session.createQuery("FROM Proveedores").list(); 
         
         
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
        
        return arrayADevolver;
    }
    
}
