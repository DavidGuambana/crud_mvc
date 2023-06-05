package modelo;

public class Producto {
    private String idproducto;
    private String nombre;
    private String descripcion;
    private int stock;
    private double precio;
    private byte foto;
    private String categoría;

    public Producto() {
    }
    
    public Producto(String idproducto, String nombre, String descripcion, int stock, double precio, byte foto, String categoría) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.foto = foto;
        this.categoría = categoría;
    }

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public byte getFoto() {
        return foto;
    }

    public void setFoto(byte foto) {
        this.foto = foto;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    @Override
    public String toString() {
        return "Producto{" + "idproducto=" + idproducto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", stock=" + stock + ", precio=" + precio + ", foto=" + foto + ", categor\u00eda=" + categoría + '}';
    }
}
