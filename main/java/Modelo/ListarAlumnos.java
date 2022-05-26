
package Modelo;

import Conexion.ConexionMysql;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListarAlumnos {
    ConexionMysql con=new ConexionMysql();
    Connection cn=con.conectar();
    
    public void MostrarTabla(JTable tabla){
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Aleas");
        modelo.addColumn("Correo");
        modelo.addColumn("Telefono");
        String consultassql="SELECT'FROM alumno";
        Statement st;
        try{
            st=cn.createStatement();
            ResultSet rs=st.executeQuery(consultassql);
            while (rs.next()){
                Object[]lista={rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getInt(5)};
                modelo.addRow(lista);
            }
            tabla.setModel(modelo);
        }catch (Exception e){
            System.out.println("Error al listar los datos"+e);
        }
    }

    public void MostrarTable(JTable TABLA_ALUMNO) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
