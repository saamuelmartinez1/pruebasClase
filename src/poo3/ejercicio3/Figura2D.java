package tema4.POO3.ejercicio3;

abstract class Figura2D {
    private int base;
    private int altura;
    private int lado1;
    private int lado2;
    private int radio;

    //CONSTRUCTOR TRIANGULO
    protected Figura2D(int base, int altura, int lado1, int lado2) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    //CONSTRUCTOR CUADRADO Y RECTANGULO
    public Figura2D(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    //CONSTRUCTOR CIRCULO
    public Figura2D(int radio) {
        this.radio = radio;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public int getRadio() {
        return radio;
    }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    abstract void area();
    abstract void perimetro();

    public String toString(){
        return "Esto es el toString";
    }

}
