package tema2;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area;
        double perimetro;
        System.out.println("introduzca la base del rectangulo:");
        double base = scanner.nextDouble();

        System.out.println("introduzca la altura del rectangulo:");
        double altura = scanner.nextDouble();

        area = base*altura;
        perimetro= base*2 + altura*2;
        System.out.println("el perimetro del rectangulo es:"+perimetro);
        System.out.println("el area del rectangulo:"+area);
}
    }
