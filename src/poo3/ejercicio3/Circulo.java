package tema4.POO3.ejercicio3;

public class Circulo extends Figura2D{
    int diampetro;
    public Circulo(int radio) {
        super(radio);
        this.diampetro = getRadio()*2;
    }

    @Override
    void area() {
        double area = Math.PI* (getRadio()*getRadio());
        System.out.println("El area del circulo es de "+area);
    }

    @Override
    void perimetro() {
        double perimetro = Math.PI * diampetro;
        System.out.println("El perimetro del circulo es de "+perimetro);
    }
}
