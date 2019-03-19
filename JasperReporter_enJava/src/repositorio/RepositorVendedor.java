/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import jasperReport_vendedor.util.HibernateUtil;
import java.util.ArrayList;
import modelo.Vendedor;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author pablo
 */
public class RepositorVendedor {
    
       public void guardar(Vendedor vendedor) {
        //este codigo lo copie de la pagina Tutorial spoint y borre lo que no me sirve
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(vendedor);
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
       
           public ArrayList<Vendedor> obtenerTodos() //ArrayList<Empleado> = significa que el arrayList es solo de empleado
    {
        ArrayList<Vendedor> arrayADevolver = null;

        // return this.listaEmpleados.toArray(arrayADevolver);
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
            //from Empleado es el tipo de consulta HQL  para obtener una lista de todos los Empleado guardados
            arrayADevolver = (ArrayList<Vendedor>) session.createQuery("FROM Vendedor").list();

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
    
}
