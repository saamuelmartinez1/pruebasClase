package tema4.POO3.ejercicio4;

public class Libro extends Ficha{

    private String autor;
    private String editorial;

    public Libro(int numero, String titulo, String autor, String editorial) {
        super(numero, titulo);
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public String toString(){
        return "El libro "+getTitulo()+ " esta escrito por "+getAutor()+" y lo publico la editorial "+getEditorial();
    }
}
