/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Mesa;
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

    public ArrayList<Pedido> obtenerTodosPedidos() //ArrayList<Empleado> = significa que el arrayList es solo de Foto
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

    public List<Double> obtenerConsultaTotalPrecioAlPublico() {
        List<Double> pedidoInnerJoin = null;//cuando inicia es null

        Session session = HibernateUtil.getSessionFactory().openSession();//getSessionFactory() inicia la sesion
        Transaction tx = null;//la transaccion cuando inicia es null
        //aprender a leer esto
        try {
            tx = session.beginTransaction();
            // fabrica = (List<Fabrica>) session.createCriteria(Fabrica.class).list();

            pedidoInnerJoin = session.createQuery("select sum(s.precioAlPublico * d.cantidad) from Platosybebidas s, Pedido d where  s.idplato = d.platosybebidas").list();
            //  pedidoInnerJoin = session.createQuery("select s.idpedido, r.nombre, d.nombre, d.costo, s.cantidad from Pedido s, Platosybebidas d, Cliente r where s.platosybebidas = d.idplato and s.cliente=  r.idcliente").list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return pedidoInnerJoin;
    }

    public List<Double> obtenerConsultaTotalCostoDelPlato() {
        List<Double> pedidoInnerJoin = null;//cuando inicia es null

        Session session = HibernateUtil.getSessionFactory().openSession();//getSessionFactory() inicia la sesion
        Transaction tx = null;//la transaccion cuando inicia es null
        //aprender a leer esto
        try {
            tx = session.beginTransaction();
            // fabrica = (List<Fabrica>) session.createCriteria(Fabrica.class).list();

            pedidoInnerJoin = session.createQuery("select sum(s.costo * d.cantidad) from Platosybebidas s, Pedido d where  s.idplato = d.platosybebidas").list();
            //  pedidoInnerJoin = session.createQuery("select s.idpedido, r.nombre, d.nombre, d.costo, s.cantidad from Pedido s, Platosybebidas d, Cliente r where s.platosybebidas = d.idplato and s.cliente=  r.idcliente").list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return pedidoInnerJoin;
    }

    public ArrayList<Object> obtenerArrayObjectConsultaHQL() //ArrayList<Empleado> = significa que el arrayList es solo de empleado
    {
        ArrayList<Object> arrayADevolver = null;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
            //from Foto es el tipo de consulta HQL  para obtener una lista de todos las fotos
            //LA consulta debo concatenar el texto + la variable, en este caso el idAlbum porque cambia el contenido segun
            //lo que seleccionemos 
            arrayADevolver = (ArrayList<Object>) session.createQuery("select p.idpedido, c.nombre, m.numero, x.nombre, p.horaDelPedido, p.cantidad, x.precioAlPublico from Cliente c, Pedido p,"
                    + " Mesa m, Platosybebidas x  where p.cliente = c.idcliente and p.mesa = m.idmesa and p.platosybebidas = x.idplato").list();

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

    public ArrayList<Object> obtenerMesasQueNoEstanEnNingunPedido() //ArrayList<Empleado> = significa que el arrayList es solo de Foto
    {
        ArrayList<Object> arrayADevolver = null;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
            //from Foto es el tipo de consulta HQL  para obtener una lista de todos los Empleado
            arrayADevolver = (ArrayList<Object>) session.createQuery("select  m.idmesa, m.numero, m.estado from Pedido as p right join p.mesa as m where p.idpedido is null").list();
            
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
    
       public void eliminarPedido(int idPedidos) {
        Session session = HibernateUtil.getSessionFactory().openSession();//getSessionFactory() inicia la sesion
        Transaction tx = null;//la transaccion cuando inicia es null
        //aprender a leer esto
        try {
         tx = session.beginTransaction();
         String hql = "delete from Pedido where idpedido = :idPedidos";
         Query query = session.createQuery(hql);
         query.setInteger("idPedidos", idPedidos);
         query.executeUpdate();
          
         
        
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
      
    }
    
    

}
