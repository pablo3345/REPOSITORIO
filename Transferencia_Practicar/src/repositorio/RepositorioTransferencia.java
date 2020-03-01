/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import modelo.Cuentabancaria;
import modelo.Transferencia;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author pablo
 */
public class RepositorioTransferencia {

    public void guardarTransferencia(Transferencia transferencia) {
        //este codigo lo copie de la pagina Tutorial spoint y borre lo que no me sirve
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save(transferencia);
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

    public ArrayList<Transferencia> MovimientosRelacionados(int idCuenta) //ArrayList<Empleado> = significa que el arrayList es solo de Foto
    {
        ArrayList<Transferencia> arrayADevolver = null;
        
        ArrayList<Transferencia> agregarTransferencias = new ArrayList<>();
        

        // return this.listaEmpleados.toArray(arrayADevolver);
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            //aca poner para mostrar todos los datos copie el mismo codigo de arriba del metodo guardar()
            //from Foto es el tipo de consulta HQL  para obtener una lista de todos los Empleado
            arrayADevolver = (ArrayList<Transferencia>) session.createQuery("FROM Transferencia").list();
            
            
            
               tx.commit();
           
            
            for(Transferencia transferencia:arrayADevolver){
            
            if(transferencia.getCuentabancariaByCuentaOrigen().getIdcuentaBancaria().equals(idCuenta) || transferencia.getCuentabancariaByCuentaDestino().getIdcuentaBancaria().equals(idCuenta))
                agregarTransferencias.add(transferencia);
            
            }
            
          
            
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        return agregarTransferencias;
    }

}
