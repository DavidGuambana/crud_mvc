package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MdlEncabezado extends Encabezado{
    public static Conexion cpg = new Conexion();
    public static ResultSet rs = null;
    public static String sql;
    
    public List<Encabezado> listarEncabezados (int id){
       List<Encabezado> encabezados = new ArrayList<>();
       try {
            if (id==0) {
                sql = "SELECT idencabezado, idpersona, fecha, total, estado FROM encabezado WHERE estado='activo'";
            } else {
                sql = "SELECT idencabezado, idpersona, fecha, total, estado FROM encabezado WHERE idencabezado="+id;
            }
            rs = cpg.consultaBD(sql);
            if (rs != null) {
                while (rs.next()) {
                    Encabezado encabezado = new Encabezado(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getDouble(4),rs.getString(5));
                    encabezados.add(encabezado);
                }
            }
            return encabezados;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public boolean crearEncabezado() {
        sql = "INSERT INTO encabezado(idpersona, fecha, total, estado)"
                + " VALUES ('" + getIdpersona()
                + "','" + getFecha()
                + "'," + getTotal()
                + ",'" + getEstado() + "')";
        return cpg.accionBD(sql);
    }

    public boolean updateEncabezado() {
        sql = "UPDATE encabezado SET estado='"
                +getEstado()+"' WHERE idencabezado="+getIdencabezado();
        return cpg.accionBD(sql);
    }
    
    public boolean eliminarEncabezado(int id){
        sql = "DELETE FROM encabezado WHERE idencabezado="+id;
        return cpg.accionBD(sql);
    }
    
    public int ultimoID(){
        int id = 0;
        try {
            sql = "SELECT idencabezado FROM encabezado ORDER BY idencabezado DESC LIMIT 1;";
            rs = cpg.consultaBD(sql);
            rs.next();
            id = rs.getInt("idencabezado");
        } catch (SQLException ex) {
        }
        return id;
    }
    public static int count(){
        int cantidad = 0;
        try {
            sql = "Select count(idencabezado) from encabezado where estado = 'activo';";
            rs = cpg.consultaBD(sql);
            rs.next();
            cantidad = rs.getInt(1);
        } catch (SQLException ex) {
        }
        return cantidad;
    }
    public static double countTotal(){
        double total=0;
        try {
            sql = "select SUM(total) from encabezado where estado = 'activo';";
            rs = cpg.consultaBD(sql);
            rs.next();
            total = rs.getDouble(1);
            sql = "select ROUND("+total+",2);";
            rs = cpg.consultaBD(sql);
            rs.next();
            total = rs.getDouble(1);
            
        } catch (SQLException e) {
        }
        return total;
    }
}
