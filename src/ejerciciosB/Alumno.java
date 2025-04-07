package tema4.ejerciciosB;

public class Alumno {
    private String nombre;
    private double notaMedia;

    public Alumno(String nombre, double notaMedia) {
        this.nombre = nombre;
        this.notaMedia = notaMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    @Override
    public String toString() {
        return nombre + " -> " + String.format("%.2f", notaMedia);
    }
}

