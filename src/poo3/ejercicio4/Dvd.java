package tema4.POO3.ejercicio4;

public class Dvd extends Ficha{
    private String director;
    private int year;
     public enum eleccionTipo{
         ANIMACION,ACCION,DOCUMENTAL,CIENCIA,FICCION,TERROR,OTRO
     }
     private eleccionTipo tipo;

    public Dvd(int numero, String titulo, String director, int year, eleccionTipo tipo) {
        super(numero, titulo);
        this.director = director;
        this.year = year;
        this.tipo = tipo;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public eleccionTipo getTipo() {
        return tipo;
    }

    public String toString(){
        return "El DVD "+getTitulo()+ " esta dirigido por "+getDirector()+" en el año "+getYear()+" y es de genero "+getTipo();
    }
}
