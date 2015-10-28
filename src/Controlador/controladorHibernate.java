package Controlador;

import Clases.Contratos;
import Clases.Usuario;
import Grafico.UIusuario;
import Util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class controladorHibernate {
    /*public static  Session sesion ;
    
    public static List Query (String query){
        Query q  = sesion.createQuery(query);
       return q.list();
    }
    public static void update (Object ob){
      Transaction tr = sesion.getTransaction();
      tr.begin();
      sesion.update(ob);
      tr.commit();
    }
    public static Object unicode (String query){
        Query q  = sesion.createQuery(query);
       return q.uniqueResult();
    }*/
    
    
    public static ArrayList devolverSinEstado(String Tabla){
        String string = "FROM "+Tabla+" ";
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        ArrayList<Object> lista = (ArrayList<Object>)session.createQuery(string).list();
        session.getTransaction().commit();
        return lista;    
    }
    
    public static ArrayList devolverSQL(String SQL){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        ArrayList<Object> lista = (ArrayList<Object>)session.createQuery(SQL).list();
        session.getTransaction().commit();
        return lista;
                
    }
    
    public static ArrayList devolverTodo(String Tabla){
        String SQL = "FROM "+Tabla+" Where Estado= 'Activo'";
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        ArrayList<Object> lista = (ArrayList<Object>)session.createQuery(SQL).list();
        session.getTransaction().commit();
        return lista;       
        
    }
    
    public static ArrayList devolverUnoID(String Tabla, String Campo, int Buscar) {
        String SQL = "FROM " + Tabla + " Where " + Campo + " = " + Buscar + "";
         //String SQL = "FROM "+Tabla+" ";

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        ArrayList<Object> lista = (ArrayList<Object>) session.createQuery(SQL).list();
        session.getTransaction().commit();
        return lista;
    }
    
   
    
    public static ArrayList devolverTodoTipo(String Tabla, String Tipo){
        String SQL = "FROM "+Tabla+" Where TipoUsuario = '"+Tipo+"' AND Estado= 'Activo'";
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        ArrayList<Object> lista = (ArrayList<Object>)session.createQuery(SQL).list();
        session.getTransaction().commit();
        return lista;       
        
    }
    
    public static ArrayList devolverCampo(String Tabla, String Campo, String Tipo){
        String SQL = "FROM "+Tabla+" Where "+Campo+" = '"+Tipo+"' ";
        System.out.println("El sql es: "+SQL);
        Usuario usuario = new Usuario();
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        ArrayList<Object> lista = (ArrayList<Object>)session.createQuery(SQL).list();
        session.getTransaction().commit();
        return lista;     
    }
    
    public static void actualalizarContrato(Contratos contrato){
        try{
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();


            session.beginTransaction();

            Query query;
            System.out.println("Voy a actrualizar");
            query = session.createQuery("UPDATE Contratos set idEmpresa= :idEmpresa, aprendiz= :aprendiz, jefeInmediato= :jefeInmediato ,cargoJefe= :cargoJefe, "
                    + " fechaInicial = :fechaInicial, fechaFinal= :fechaFinal, sede= :sede, tipoContrato= :tipoContrato, programa= :programa, ficha= :ficha WHERE idContratos= :idContratos");

                        query.setParameter("idEmpresa", contrato.getEmpresa());
                        query.setParameter("aprendiz", contrato.getUsuario());
                        query.setParameter("jefeInmediato", contrato.getJefeInmediato());
                        query.setParameter("cargoJefe", contrato.getCargoJefe());
                        query.setParameter("fechaInicial", contrato.getFechaInicial());
                        query.setParameter("fechaFinal", contrato.getFechaFinal());
                        query.setParameter("sede", contrato.getSede());
                        query.setParameter("tipoContrato", contrato.getTipoContrato());
                        query.setParameter("programa", contrato.getPrograma());
                        query.setParameter("ficha", contrato.getFicha());
                        query.setParameter("idContratos", contrato.getIdContratos());

            query.executeUpdate();
            System.out.println("Ya actualise");

            session.getTransaction().commit();
        }catch(Exception ex){
            System.out.println("Error al actualizar: "+ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    
    public static void insertarObjecto(Object object){
        
        
       Session session = HibernateUtil.getSessionFactory().getCurrentSession();
       session.beginTransaction();
       session.save(object);
       session.getTransaction().commit();
        
    
    }
    
    public static void actualizar(Object object){
        
       Session session = HibernateUtil.getSessionFactory().getCurrentSession();
       session.beginTransaction();
       session.update(object);
       session.getTransaction().commit();
    }
    
    
    public static void delete(String tabla, String classId, Integer id) {
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        session.beginTransaction();

        Query query;

        query = session.createQuery("UPDATE " + tabla + " set estado= :estado WHERE " + classId + "= :" + classId + " ");

        query.setParameter("estado", "Finalizado");
        query.setLong(classId, id);

        query.executeUpdate();

        session.getTransaction().commit();     
    }
    public static void delete2(String tabla, String classId, Integer id) {
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        session.beginTransaction();

        Query query;

        query = session.createQuery("UPDATE " + tabla + " set estado= :estado WHERE " + classId + "= :" + classId + " ");

        query.setParameter("estado", "Inactivo");
        query.setLong(classId, id);

        query.executeUpdate();

        session.getTransaction().commit();     
    }
    public static List buscarLike(String Tabla,String Tipo,String Buscar){
        
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM "+Tabla+" WHERE "+Tipo+" like '%"+Buscar+"%' AND estado='Activo' ");
        List<Object> List = query.list();
        session.getTransaction().commit();
        return List;
    }
    
    public static List buscarLikeTipo(String Tabla, String Tipo, String Buscar, String Campo){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("FROM "+Tabla+" WHERE "+Tipo+" like '%"+Buscar+"%' and "+Campo+" = 'Aprendiz'");
        List<Object> List = query.list();
        session.getTransaction().commit();
        return List;
    }
    
    
    
}
