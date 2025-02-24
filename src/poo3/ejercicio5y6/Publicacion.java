package tema4.POO3.ejercicio5y6;

abstract class Publicacion {
    String link;
    String tipo;
    String canal;
    String mensaje;

    protected Publicacion(String link, String tipo, String canal) {
        this.link = link;
        this.tipo = tipo;
        this.canal = canal;
    }

    public String getLink() {
        return link;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCanal() {
        return canal;
    }

    public String getMensaje() {
        return mensaje;
    }
}
