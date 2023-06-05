package modelo;

import java.util.Date;

public class Encabezado {
    private int idencabezado;
    private String idpersona;
    private Date fecha;
    private double total;
    private String estado;

    public Encabezado() {
    }

    public Encabezado(int idencabezado, String idpersona, Date fecha, double total, String estado) {
        this.idencabezado = idencabezado;
        this.idpersona = idpersona;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
    }
    
    public int getIdencabezado() {
        return idencabezado;
    }

    public void setIdencabezado(int idencabezado) {
        this.idencabezado = idencabezado;
    }

    public String getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(String idpersona) {
        this.idpersona = idpersona;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Encabezado{" + "idencabezado=" + idencabezado + ", idpersona=" + idpersona + ", fecha=" + fecha + ", total=" + total + ", estado=" + estado + '}';
    }
}
