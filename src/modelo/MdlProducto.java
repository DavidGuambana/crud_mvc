package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MdlProducto extends Producto{
    Conexion cpg = new Conexion();
    ResultSet rs = null;
    String sql;
    
    public List<Producto> listarProductos(String id) {
        List<Producto> listaProductos = new ArrayList<>();
        try {
            if ("".equals(id)) {
                sql = "SELECT idproducto, nombre, precio, stock, foto, descripcion, categoria FROM producto";
            } else {
                sql = "SELECT idproducto, nombre, precio, stock, foto, descripcion, categoria FROM producto WHERE idproducto='"+id+"'";
            }
            rs = cpg.consultaBD(sql);
            if (rs != null) {
                while (rs.next()) {
                    Producto producto = new Producto();
                    producto.setIdproducto(rs.getString(1));
                    producto.setNombre(rs.getString(2));
                    producto.setPrecio(rs.getDouble(3));
                    producto.setStock(rs.getInt(4));
                    //producto.setFoto(rs.getByte(5));
                    producto.setDescripcion(rs.getString(6));
                    producto.setCategoría(rs.getString(7));
                    
                    listaProductos.add(producto);
                    
                }
            }
            return listaProductos;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean crearProducto() {
        sql = "INSERT INTO producto(idproducto, nombre, precio, stock, descripcion, categoria)"
                + " VALUES ('" + getIdproducto()
                + "','" + getNombre()
                + "'," + getPrecio()
                + "," + getStock()
                + ",'" + getDescripcion()
                + "','" + getCategoría()+"')";
               // + "," + getFoto()
        return cpg.accionBD(sql);
    }

    public boolean updateProducto() {
        sql = "UPDATE producto SET nombre='"
                + getNombre() + "', precio="
                + getPrecio() + ", stock="
                + getStock() + ", descripcion='"
                + getDescripcion() + "', categoria='"
                + getCategoría() + "' WHERE idproducto='" + getIdproducto() + "'";
        return cpg.accionBD(sql);
    }

    public boolean eliminarProducto(String id) {
        sql = "DELETE FROM producto WHERE idproducto='" + id + "'";
        return cpg.accionBD(sql);
    }

    public boolean updateProductoStock() {
        sql = "UPDATE producto SET stock="
                + getStock() + " WHERE idproducto='" + getIdproducto() + "'";
        System.out.println(sql);
        return cpg.accionBD(sql);
    }
}
