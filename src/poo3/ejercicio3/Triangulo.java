package tema4.POO3.ejercicio3;

public class Triangulo extends Figura2D{
    public Triangulo(int base, int altura, int lado1, int lado2) {
        super(base, altura, lado1, lado2);
    }

    @Override
    void area() {
        int area = (getBase() * getAltura()) / 2;
        System.out.println("El area de este triangulo es de "+ area);
    }

    @Override
    void perimetro() {
        int perimetro = getBase()+getLado1()+getLado2();
        System.out.println("El perimetro es de "+ perimetro);
    }
}
