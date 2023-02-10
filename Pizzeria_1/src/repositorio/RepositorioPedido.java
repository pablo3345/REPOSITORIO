/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Mesa;
import modelo.Pedido;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author pablo
 */
public class RepositorioPedido {

    public void guardarPedido(Pedido pedido) {
        //este codigo lo copie de la pagina Tutorial spoint y borre lo que no me sirve 
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(pedido);
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

    public Pedido obtenerPedidoGuardado(int idPedido) {
        Pedido pedido = null;

        Session session = HibernateUtil.getSessionFactory().openSession();//getSessionFactory() inicia la sesion
        Transaction tx = null;//la transaccion cuando inicia es null
        //aprender a leer esto
        try {
            tx = session.beginTransaction();
            pedido = (Pedido) session.get(Pedido.class, idPedido); //Obtiene el empleado a traves del id. Equivale a un select con HQL.
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return pedido;
    }

    public ArrayList<Pedido> obtenerTodosPedido() //ArrayList<Empleado> = significa que el arrayList es solo de Foto
    {
        ArrayList<Pedido> arrayADevolver = null;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
            //from Foto es el tipo de consulta HQL  para obtener una lista de todos los Empleado
            arrayADevolver = (ArrayList<Pedido>) session.createQuery("FROM Pedido").list();

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

    public ArrayList<Object> obtenerPedidoSegunMesaOcupada_Factura(int idMesa) //ArrayList<Empleado> = significa que el arrayList es solo de Foto
    {
        ArrayList<Object> arrayObject = null;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
            //from Foto es el tipo de consulta HQL  para obtener una lista de todos los Empleado
            arrayObject = (ArrayList<Object>) session.createQuery("select p.idPedido, c.nombre, x.nombre, m.numero, x.precioAlPublico, p.cantidad from Cliente c, Pedido p,"
                    + " Mesa m, Plato x  where p.cliente = c.idCliente and p.mesa = m.idMesa and p.plato = x.idPlato and p.estado = 'activo' and  p.mesa=" + idMesa).list();
            
            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return arrayObject;
    }
    

}
