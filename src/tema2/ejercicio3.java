package tema2;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area;
        double perimetro;
        System.out.println("introduzca la base del triangulo:");
        double base = scanner.nextDouble();

        System.out.println("introduzca la altura del triangulo:");
        double altura = scanner.nextDouble();

        area = base*altura/2;
        System.out.println("el area del rectangulo:"+area);
}
    }
