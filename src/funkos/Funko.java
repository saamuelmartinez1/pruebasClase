package tema4.funkos;

public class Funko {
    private String codigo;
    private String nombre;
    private String modelo;
    private double precio;
    private int fecha;


    public Funko(String codigo, String nombre, String modelo, double precio, int fecha) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
}
