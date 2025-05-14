package tema4.Videojuegos;

public class VideojuegoFisico extends Videojuego {
    private String tiendaCompra;
    private Estado estado;

    public enum Estado {
        NUEVO, USADO
    }

    public VideojuegoFisico(String titulo, String plataforma, int nota, String tiendaCompra, Estado estado) {
        super(titulo, plataforma, nota);
        this.tiendaCompra = tiendaCompra;
        this.estado = estado;
    }

    public String getTiendaCompra() {
        return tiendaCompra;
    }

    public void setTiendaCompra(String tiendaCompra) {
        this.tiendaCompra = tiendaCompra;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String getTipo() {
        return "formato: Físico, ";
    }

    @Override
    public String toString() {
        return "Tipo: FISICO, Titulo: " + getTitulo() + ", Plataforma: " + getPlataforma() +
                ", Nota: " + getNota() + ", Tienda: " + tiendaCompra + ", Estado: " + estado;
    }

}
