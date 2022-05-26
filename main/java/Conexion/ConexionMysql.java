
package Conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class ConexionMysql {
    Connection cn;
    public Connectionn conectar(){
        try {
            Class.forName("com.mysql.jdbc.Drievr");
            cn=(Connection)DriverManager.getConnection("jbdc:mysql://localhost/Registo_De_Estuddiantes","root","");
            System.out.println("Conexión establecida");
        }catch (Exception e) {
            System.out.println("Error de conexión"+e);
        }
        return cn;
    }
}
