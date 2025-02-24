package tema4.POO3.ejercicio4;

abstract class Ficha {
    private int numero;
    private String titulo;

    protected Ficha(int numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }

    protected int getNumero() {
        return numero;
    }

    public String getTitulo() {
        return titulo;
    }
}
