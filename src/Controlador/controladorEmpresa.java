
package Controlador;

import Clases.Empresa;
import Clases.Usuario;
import Util.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;


public class controladorEmpresa {
    
    public static ArrayList retornarTodo() {

        Empresa usuario = new Empresa();
        String SQL = "FROM Empresa WHERE Estado='Activo'";
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        ArrayList<Empresa> lista = (ArrayList<Empresa>) session.createQuery(SQL).list();
        session.getTransaction().commit();

        return lista;
    }
    
    public static void insertarUsuario(Object object){
        
       Session session = HibernateUtil.getSessionFactory().getCurrentSession();
       session.beginTransaction();
       session.save(object);
       session.getTransaction().commit();
        
    }
    
    
    public static void actualizarEmpresa(Empresa empresa) {

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        

        session.beginTransaction();

        Query query;

        query = session.createQuery("UPDATE Empresa set Razon_Social = :Razon_Social ,Direccion= :Direccion , "
                + " NIT = :NIT , Telefono= :Telefono , Email = :Email  WHERE idEmpresa= :idEmpresa");

                    query.setParameter("Razon_Social", empresa.getRazonSocial());
                    query.setParameter("Direccion", empresa.getDireccion());
                    query.setLong("NIT", empresa.getNit());
                    query.setLong("Telefono", empresa.getTelefono());
                    query.setParameter("Direccion", empresa.getDireccion());
                    query.setParameter("Email", empresa.getEmail());
                    query.setLong("idEmpresa", empresa.getIdEmpresa());

        query.executeUpdate();

       
        session.getTransaction().commit();
         
    }
    
    public static void eliminarEmpresa(Empresa empresa) {

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        

        session.beginTransaction();

        Query query;

        query = session.createQuery("UPDATE Empresa set Estado= :Estado  WHERE idEmpresa= :idEmpresa");

                    query.setParameter("Estado", "Inactivo");
                    
                    query.setLong("idEmpresa", empresa.getIdEmpresa());

        query.executeUpdate();

       
        session.getTransaction().commit();
         
    }
    
}
