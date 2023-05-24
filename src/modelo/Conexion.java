
package modelo;
import java.sql.*;
public class Conexion {
    Connection con;
    Statement st;
    String cadenaConecction="jdbc:postgresql://localhost:5432/MVC";
    String usuarioPG="postgres";
    String contraPG="0988";

    public Conexion() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
        }
        try {
            con = DriverManager.getConnection(cadenaConecction,usuarioPG, contraPG );
            System.out.println("Connection OK");
        } catch (SQLException ex) {
            System.out.println("No se pudo conectar");
        }
    }
    
    public ResultSet consultaBD(String sql){
        try {
            st = con.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public boolean accionBD(String sql){
        try {
            st = con.createStatement();
            if (st.executeUpdate(sql) == 1) {
                st.close();
                return true;
            } else{
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
