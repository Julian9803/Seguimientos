
package Controlador;


import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class conexionReporte {
    
    private Connection conn;
    private Statement stm;
    private ResultSet rst;

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public Statement getStm() {
        return stm;
    }

    public void setStm(Statement stm) {
        this.stm = stm;
    }

    public ResultSet getRst() {
        return rst;
    }

    public void setRst(ResultSet rst) {
        this.rst = rst;
    }
    
    public void conectar(){
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost/Seguimientos","root","");
            
        } catch (Exception e) {
            System.out.println("Error al conectar: "+e.getMessage());
            e.printStackTrace();
        }
    }
    
}
