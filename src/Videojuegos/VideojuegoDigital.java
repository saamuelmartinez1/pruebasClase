package tema4.Videojuegos;

public class VideojuegoDigital extends Videojuego {
    private String tiendaOnline;
    private double tamanioGB;

    public VideojuegoDigital(String titulo, String plataforma, int nota, String tiendaOnline, double tamanioGB) {
        super(titulo, plataforma, nota);
        this.tiendaOnline = tiendaOnline;
        this.tamanioGB = tamanioGB;
    }

    public String getTiendaOnline() {
        return tiendaOnline;
    }

    public void setTiendaOnline(String tiendaOnline) {
        this.tiendaOnline = tiendaOnline;
    }

    public double getTamanioGB() {
        return tamanioGB;
    }

    public void setTamanioGB(double tamanioGB) {
        this.tamanioGB = tamanioGB;
    }

    @Override
    public String getTipo() {
        return "formato: Digital, ";
    }

    @Override

    public String toString() {
        return "Tipo: DIGITAL, Titulo: " + getTitulo() + ", Plataforma: " + getPlataforma() +
                ", Nota: " + getNota() + ", TiendaOnline: " + tiendaOnline + ", Tamano: " + tamanioGB;
    }

}
