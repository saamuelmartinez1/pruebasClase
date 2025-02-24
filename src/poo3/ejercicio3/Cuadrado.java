package tema4.POO3.ejercicio3;

public class Cuadrado extends Figura2D{
    public Cuadrado(int base, int altura) {
        super(base, altura);
    }

    @Override
    void area() {
        int area = getBase() * getAltura();
        System.out.println("El area es de "+getBase()+" * "+getAltura()+" = "+area);
    }

    @Override
    void perimetro() {
        int perimetro = getBase() + getBase() + getAltura() + getAltura();
        System.out.println("El area es de "+getBase() +" + "+ getBase() +" + " + getAltura() +" + "+ getAltura() +" = "+ perimetro);
    }
}
