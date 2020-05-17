/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import com.sun.corba.se.spi.orbutil.fsm.Guard;
import java.util.ArrayList;
import modelo.Cliente;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author pablo
 */
public class RepositorioCliente {

    public void guardarCliente(Cliente cliente) {
        //este codigo lo copie de la pagina Tutorial spoint y borre lo que no me sirve
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(cliente);
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

    public ArrayList<Cliente> obtenerTodosCliente() //ArrayList<Empleado> = significa que el arrayList es solo de Foto
    {
        ArrayList<Cliente> arrayADevolver = null;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
            //from Foto es el tipo de consulta HQL  para obtener una lista de todos los Empleado
            arrayADevolver = (ArrayList<Cliente>) session.createQuery("FROM Cliente").list();

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
    
       public void actualizarCliente(int idClienteConvertido, String nombre, String apellido, String direccion, String localidad) //ArrayList<Empleado> = significa que el arrayList es solo de Foto
    {
        

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            
           
                String hql = "UPDATE Cliente SET nombre =  :nombre, apellido= :apellido, direccion = :direccion, localidad = :localidad  where idCliente = :idClienteConvertido";
//             String hql = "UPDATE Cliente c SET c.nombre='" + nombre + "'," + "c.apellido='" + apellido + "'," + "c.direccion='"
//                + direccion + "'," + "c.localidad='" + localidad + "'WHERE c.idCliente='" + idClienteConvertido + "'";
             Query consultaActualizarCliente = session.createQuery(hql);
             consultaActualizarCliente.setParameter("nombre", nombre);
             consultaActualizarCliente.setParameter("apellido", apellido);
             consultaActualizarCliente.setParameter("direccion", direccion);
             consultaActualizarCliente.setParameter("localidad", localidad);
             consultaActualizarCliente.setParameter("idClienteConvertido", idClienteConvertido);
             
             consultaActualizarCliente.executeUpdate();
             
            

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
