/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import ejemplo_buscador_sakila.HibernateUtil;
import java.util.ArrayList;
import modelo.Persona;
import modelo.Viajes;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author pablo
 */
public class RepositorioViaje {

    public void guardar(Viajes viaje) {
        //este codigo lo copie de la pagina Tutorial spoint y borre lo que no me sirve
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(viaje);
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

    public ArrayList<Viajes> obtenerTodosPorPersona(int idPersona) //ArrayList<Empleado> = significa que el arrayList es solo de empleado
    {
        ArrayList<Viajes> arrayADevolver = null;

        // return this.listaEmpleados.toArray(arrayADevolver);
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
            //from Foto es el tipo de consulta HQL  para obtener una lista de todos las fotos
            //LA consulta debo concatenar el texto + la variable, en este caso el idAlbum porque cambia el contenido segun
            //lo que seleccionemos 
            arrayADevolver = (ArrayList<Viajes>) session.createQuery("FROM Viajes WHERE persona = " + idPersona).list();

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
