package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MdlDetalle extends Detalle{
    Conexion cpg = new Conexion();
    ResultSet rs = null;
    String sql;
    
    public List<Detalle> listarDetalles (int codigo){
       List<Detalle> detalles = new ArrayList<>();
       try {
            if (codigo==0) {
                sql = "SELECT detalleid, productoid, cantidad, subtotal, encabezadoid FROM detalle";
            } else {
                sql = "SELECT detalleid, productoid, cantidad, subtotal, encabezadoid FROM detalle WHERE encabezadoid="+codigo; 
            }
            rs = cpg.consultaBD(sql);
            if (rs != null) {
                while (rs.next()) {
                    Detalle detalle = new Detalle(rs.getInt(1), rs.getString(2), rs.getInt(3),rs.getDouble(4),rs.getInt(5));
                    detalles.add(detalle);
                }
            }
            return detalles;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public boolean crearDetalle() {
        sql = "INSERT INTO detalle(productoid, cantidad,subtotal, encabezadoid)"
                + " VALUES ('" + getProductoid()
                + "'," + getCantidad()
                + "," + getSubtotal()
                + "," + getEncabezadoid()+")";
        return cpg.accionBD(sql);
    }
    
    public boolean updateDetalle() {
        sql = "UPDATE detalle SET productoid='"
                +getProductoid()+"', cantidad="
                +getCantidad()+", subtotal="
                +getSubtotal()+", encabezadoid="
                +getEncabezadoid()+" WHERE detalleid="+getDetalleid();
        return cpg.accionBD(sql);
    }
    
    public boolean eliminarDetalles(String idencabezado){
        sql = "DELETE FROM detalle WHERE idencabezado="+idencabezado;
        return cpg.accionBD(sql);
    }
}
