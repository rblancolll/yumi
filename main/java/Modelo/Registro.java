
package Modelo;

import Conexion.ConexionMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Registro {
    ConexionMysql con=new ConexionMysql();
    Connection cn=con.conectar();
    
    
    public void registrarbd(Alumno a){
        try{
            PreparedStatement as=cn.prepareStatement
            ("INSERT INTO alumno(codigo,nombe,aleas,correo,telefono)");
            as.setInt(1, a.getCodigo());
            as.setString(2, a.getNombre());
            as.setInt(3, a.getAleas());
            as.setString(4, a.getCorreo());
            as.setInt(5, a.getTelefono());
            as.executeUpdate();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERROR AL RERGISTRAR datos"+e);
        }
    }
}
