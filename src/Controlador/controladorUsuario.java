

package Controlador;
import Util.HibernateUtil;
import org.hibernate.Session;
import Clases.Usuario;
import Grafico.ActualizarUsuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

public class controladorUsuario {
    
    public static boolean validarUsuario(String SQL){
        Usuario usuario = new Usuario();
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Usuario> lista = (List<Usuario>)session.createQuery(SQL).list();
        
        for(Usuario item: lista){           
            
            session.getTransaction().commit();
            return true;
        }
        session.getTransaction().commit();
        return false;
    }
    
    
    
    
    public static void insertarUsuario(Object object){
        
       Session session = HibernateUtil.getSessionFactory().getCurrentSession();
       session.beginTransaction();
       session.save(object);
       session.getTransaction().commit();
        
    }
    
    public static List devolverUsuarios(String Tipo,String Buscar){
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM Usuario WHERE "+Tipo+" like '%"+Buscar+"%' ");
        List<Usuario> List = query.list();
        session.getTransaction().commit();
        return List;
    }
    
    public static ArrayList retornarTodo(String SQL){
        Usuario usuario = new Usuario();
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        ArrayList<Object> lista = (ArrayList<Object>)session.createQuery(SQL).list();
        session.getTransaction().commit();
        return lista;
    }
    
    
     public static void actualizarUsuario(Usuario user) {

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
 

        session.beginTransaction();

        Query query;

        query = session.createQuery("UPDATE Usuario set Nombres = :Nombres ,Apellidos= :Apellidos , "
                + " Telefono = :Telefono , Correo= :Correo , Direccion = :Direccion , TipoUsuario= :TipoUsuario  WHERE idUsuarios= :idUsuarios");

                    query.setParameter("Nombres", user.getNombres());
                    query.setParameter("Apellidos", user.getApellidos());
                    query.setLong("Telefono", user.getTelefono());
                    query.setParameter("Correo", user.getCorreo());
                    query.setParameter("Direccion", user.getDireccion());
                    query.setParameter("TipoUsuario", user.getTipoUsuario());
                    query.setLong("idUsuarios", user.getIdUsuarios());

        query.executeUpdate();

       
        session.getTransaction().commit();
         
    }

    
}
