package modelo;

public class Detalle {
    private int detalleid;
    private String productoid;
    private int cantidad;
    private double subtotal;
    private int encabezadoid;

    public Detalle() {
    }

    public Detalle(int detalleid, String productoid, int cantidad, double subtotal, int encabezadoid) {
        this.detalleid = detalleid;
        this.productoid = productoid;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.encabezadoid = encabezadoid;
    }

    public int getDetalleid() {
        return detalleid;
    }

    public void setDetalleid(int detalleid) {
        this.detalleid = detalleid;
    }

    public String getProductoid() {
        return productoid;
    }

    public void setProductoid(String productoid) {
        this.productoid = productoid;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getEncabezadoid() {
        return encabezadoid;
    }

    public void setEncabezadoid(int encabezadoid) {
        this.encabezadoid = encabezadoid;
    }
    
}
