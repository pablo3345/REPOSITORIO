/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import herbolesteria.util.HibernateUtil;
import java.util.ArrayList;
import modelo.CompraProducto;
import modelo.Proveedor;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author pablo
 */
public class RepositorioCompraProducto {

    public void guardarcompraProducto(CompraProducto compraProducto) {
        //este codigo lo copie de la pagina Tutorial spoint y borre lo que no me sirve
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(compraProducto);
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

    public ArrayList<CompraProducto> obtenerTodosCompraProductos() //ArrayList<Empleado> = significa que el arrayList es solo de Foto
    {
        ArrayList<CompraProducto> arrayADevolver = null;

        // return this.listaEmpleados.toArray(arrayADevolver);
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
            //from Foto es el tipo de consulta HQL  para obtener una lista de todos los Empleado
            arrayADevolver = (ArrayList<CompraProducto>) session.createQuery("FROM CompraProducto").list();

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
    
    
       public void eliminarCompraProducto(CompraProducto compraProducto) {
        Session session = HibernateUtil.getSessionFactory().openSession();//getSessionFactory() inicia la sesion
        Transaction tx = null;//la transaccion cuando inicia es null
        //aprender a leer esto
        try {
            tx = session.beginTransaction();
            session.delete(compraProducto);
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
       
        public ArrayList<CompraProducto> obtenerTodosPorProducto(int idProducto)
     //ArrayList<Empleado> = significa que el arrayList es solo de empleado
    {
        ArrayList<CompraProducto> arrayADevolver = null;
        
       // return this.listaEmpleados.toArray(arrayADevolver);
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        
        try {
         tx = session.beginTransaction();
         //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
         //from Foto es el tipo de consulta HQL  para obtener una lista de todos las fotos
         //LA consulta debo concatenar el texto + la variable, en este caso el idAlbum porque cambia el contenido segun
         //lo que seleccionemos 
         arrayADevolver = (ArrayList<CompraProducto>) session.createQuery("FROM CompraProducto WHERE producto = "+idProducto).list(); 
         
         
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
        
        return arrayADevolver;
    }//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
               public ArrayList<CompraProducto> obtenerTodosPorCompra(int idCompra)
     //ArrayList<Empleado> = significa que el arrayList es solo de empleado
    {
        ArrayList<CompraProducto> arrayADevolverr = null;
        
       // return this.listaEmpleados.toArray(arrayADevolver);
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        
        try {
         tx = session.beginTransaction();
         //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
         //from Foto es el tipo de consulta HQL  para obtener una lista de todos las fotos
         //LA consulta debo concatenar el texto + la variable, en este caso el idAlbum porque cambia el contenido segun
         //lo que seleccionemos 
         arrayADevolverr = (ArrayList<CompraProducto>) session.createQuery("FROM CompraProducto WHERE compra = "+idCompra).list(); 
         
         
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
        
        return arrayADevolverr;
    }

}
