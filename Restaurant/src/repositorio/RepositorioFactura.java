/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Factura;
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

    public ArrayList<Object> obtenerConsultaHQLmesasOcupadas(int idMesa) //ArrayList<Empleado> = significa que el arrayList es solo de empleado
    {
        // ArrayList<Object> arrayADevolver = null;

        ArrayList<Pedido> arrayUno = new ArrayList<>();

        ArrayList<Object> arrayObject = new ArrayList<>();

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
            //from Foto es el tipo de consulta HQL  para obtener una lista de todos las fotos
            //LA consulta debo concatenar el texto + la variable, en este caso el idAlbum porque cambia el contenido segun
            //lo que seleccionemos 
            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            arrayObject = (ArrayList<Object>) session.createQuery("select p.idpedido, c.nombre, m.numero, x.nombre, p.horaDelPedido, p.cantidad, x.precioAlPublico from Cliente c, Pedido p,"
                    + " Mesa m, Platosybebidas x  where p.cliente = c.idcliente and p.mesa = m.idmesa and p.platosybebidas = x.idplato and  p.mesa=" + idMesa).list();

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

    public ArrayList<Integer> obtenerPedidoSegunMesaOcupada(int idMesa) //ArrayList<Empleado> = significa que el arrayList es solo de Foto
    {
        ArrayList<Integer> arrayADevolver = null;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
            //from Foto es el tipo de consulta HQL  para obtener una lista de todos los Empleado

            arrayADevolver = (ArrayList<Integer>) session.createQuery("select p.idpedido  from Pedido p where p.mesa = " + idMesa).list();

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

//    public ArrayList<Object> obtenerPrdidosSegunElUltimoIdMayor(int ultimoId) //ArrayList<Empleado> = significa que el arrayList es solo de Foto
//    {
//        ArrayList<Object> arrayADevolver = null;
//
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction tx = null;
//
//        try {
//            tx = session.beginTransaction();
//            //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
//            //from Foto es el tipo de consulta HQL  para obtener una lista de todos los Empleado
//
//            arrayADevolver = (ArrayList<Object>) session.createQuery("select  c.nombre, m.numero, x.nombre, p.horaDelPedido, p.cantidad, x.precioAlPublico from Cliente c, Pedido p,\n" +
//"    Mesa m, Platosybebidas x  where p.cliente = c.idcliente and p.mesa = m.idmesa and p.platosybebidas = x.idplato and p.idpedido > " + ultimoId).list();
//
//            // arrayADevolver = (ArrayList<Double>) session.createQuery("SELECT sum(cantidad * precio) FROM Factura ").list();
//            // arrayADevolver = (ArrayList<Factura>) session.createQuery("FROM Factura ").list();
//            tx.commit();
//
//        } catch (HibernateException e) {
//            if (tx != null) {
//                tx.rollback();
//            }
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//
//        return arrayADevolver;
//    }

}
