/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

import java.util.ArrayList;
import java.util.List;
import modelo.Articulo;
import modelo.Empleado;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pruebacalculadorasueldo.util.HibernateUtil;

/**
 *
 * @author pablo
 */
public class RepositorioArticulo {
    
    private static ArrayList<Articulo>  articulosGuardados;

    public RepositorioArticulo() {
         this.articulosGuardados = new ArrayList<>();
    }
    
    
    
       public void guardar(Articulo articulo) {
        //este codigo lo copie de la pagina Tutorial spoint y borre lo que no me sirve
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(articulo);
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
       
         public ArrayList<Articulo> obtenerTodosPorEmpleado(int idEmpleado)
     //ArrayList<Empleado> = significa que el arrayList es solo de empleado
    {
        ArrayList<Articulo> arrayADevolver = null;
        
       // return this.listaEmpleados.toArray(arrayADevolver);
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        
        try {
         tx = session.beginTransaction();
         //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
         //from Articulo es el tipo de consulta HQL  para obtener una lista de todos las Articulo
         //LA consulta debo concatenar el texto + la variable, en este caso el idAlbum porque cambia el contenido segun
         //lo que seleccionemos 
         arrayADevolver = (ArrayList<Articulo>) session.createQuery("FROM Articulo WHERE empleado = "+idEmpleado).list(); 
         
         
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
        
        return arrayADevolver;
    }
         
           public ArrayList<Articulo> obtenerArticulosGuardadosDelEmpleadoQueIndique(Empleado empleado)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();//getSessionFactory() inicia la sesion
        Transaction tx = null;//la transaccion cuando inicia es null
        //aprender a leer esto
        try {
         tx = session.beginTransaction();
         String hql = "from Articulo where empleado = :empleado"; // consultadas parametrizadas hql. ":empleado" va a variar.
         Query consultaObtenerVentasDeEmpleado = session.createQuery(hql); // creamos la query a traves del objeto "session", Query es una consulta que le hago a la base de datos, transforma el hql a sql
         consultaObtenerVentasDeEmpleado.setEntity("empleado", empleado); // al convertirlo a "query" me permite setearle de forma dinamica el empleado que obtengo a traves del id que introduzco en la vista
         
         this.articulosGuardados = (ArrayList<Articulo>) consultaObtenerVentasDeEmpleado.list();
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
       
        
        return this.articulosGuardados;
    }
         
   
         
 
    
}
