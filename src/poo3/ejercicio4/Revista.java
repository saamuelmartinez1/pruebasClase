package tema4.POO3.ejercicio4;

public class Revista extends Ficha{
    private int numeroDePublicacion;
    private int year;

    public Revista(int numero, String titulo, int numeroDePublicacion, int year) {
        super(numero, titulo);
        this.numeroDePublicacion = numeroDePublicacion;
        this.year = year;
    }

    public int getNumeroDePublicacion() {
        return numeroDePublicacion;
    }

    public int getYear() {
        return year;
    }

    public String toString(){
        return "La revista "+getTitulo()+ " tiene "+getNumeroDePublicacion()+" numero de publicaciones y se creo en el año "+getYear();
    }
}
