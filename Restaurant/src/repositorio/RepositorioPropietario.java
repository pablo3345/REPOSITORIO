/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import modelo.Pedido;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author pablo
 */
public class RepositorioPropietario {
    
    
      public ArrayList<Object> obtenerConsultaHQL() //ArrayList<Empleado> = significa que el arrayList es solo de Foto
    {
        ArrayList<Object> arrayADevolver = null;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
            //from Foto es el tipo de consulta HQL  para obtener una lista de todos los Empleado
            arrayADevolver = (ArrayList<Object>) session.createQuery("select p.idpedido, c.nombre, m.numero, x.nombre, p.horaDelPedido, p.cantidad, x.costo, x.precioAlPublico "
                    + "from Cliente c, Pedido p, Mesa m, Platosybebidas x  where p.cliente = c.idcliente and p.mesa = m.idmesa and p.platosybebidas = x.idplato").list();

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
