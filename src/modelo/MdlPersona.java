package modelo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class MdlPersona extends Persona {
    Conexion cpg = new Conexion();
    ResultSet rs = null;
    String sql;

    public MdlPersona() {
    }
    
    public List<Persona> listarPersonas(String id) {
        List<Persona> listaPersonas = new ArrayList<>();
        try {
            if ("".equals(id)) {
                sql = "SELECT idpersona, nombres, apellidos, fechanacimiento, telefono, sexo, sueldo, cupo, foto, correo FROM persona";
            } else {
                sql = "SELECT idpersona, nombres, apellidos, fechanacimiento, telefono, sexo, sueldo, cupo, foto, correo FROM persona WHERE idpersona='"+id+"'";
            }
            rs = cpg.consultaBD(sql);
            if (rs != null) {
                while (rs.next()) {
                    Persona persona = new Persona();
                    persona.setIdPersona(rs.getString(1));
                    persona.setNombrePersona(rs.getString(2));
                    persona.setApellidoPersona(rs.getString(3));
                    persona.setFechanacimineto(rs.getDate(4));
                    persona.setTelefono(rs.getString(5));
                    persona.setSexo(rs.getString(6));
                    persona.setSueldo(rs.getInt(7));
                    persona.setCupo(rs.getInt(8));
                    //persona.setFoto(rs.getByte(9));
                    persona.setCorreo(rs.getString(10));
                    listaPersonas.add(persona);
                    
                }
            }
            return listaPersonas;
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean crearPersona() {
        sql = "INSERT INTO persona(idpersona, nombres, apellidos, fechanacimiento, telefono, sexo, sueldo, cupo, correo)"
                + " VALUES ('" + getIdPersona()
                + "','" + getNombrePersona()
                + "','" + getApellidoPersona()
                + "','" + getFechanacimineto()
                + "','" + getTelefono()
                + "','" + getSexo()
                + "'," + getSueldo()
                + "," + getCupo()
               // + "," + getFoto()
                + ",'" + getCorreo()+"')";
        return cpg.accionBD(sql);
    }
    public boolean updatePersona() {
        sql = "UPDATE persona SET nombres='"
                +getNombrePersona()+"', apellidos='"
                +getApellidoPersona()+"', fechanacimiento='"
                +getFechanacimineto()+"', telefono='"
                +getTelefono()+"', sexo='"
                +getSexo()+"', sueldo='"
                +getSueldo()+"', cupo='"
                +getCupo()
                //+"', foto='"
                //+getFoto()
                +"', correo='"
                +getCorreo()+"' WHERE idpersona='"+getIdPersona()+"'";
        return cpg.accionBD(sql);
    }
    public boolean eliminarPersona(String id){
        sql = "DELETE FROM persona WHERE idpersona='"+id+"'";
        return cpg.accionBD(sql);
    }
}
