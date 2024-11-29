package ActividadesModulares;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radio;
        do {
            System.out.println("Introduce un radio mayor que 0:");
            radio = scanner.nextDouble();
        } while (!validRadius(radio));

        double area = calculateCircleArea(radio);
        double perimetro = calculateCirclePerimeter(radio);

        System.out.println("El área del círculo es: " + area);
        System.out.println("El perímetro del círculo es: " + perimetro);
    }

    public static double calculateCirclePerimeter(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double calculateCircleArea(double radio) {
        return Math.PI * radio * radio;
    }

    public static boolean validRadius(double radio) {
        if (radio <= 0) {
            System.out.println("El radio debe ser mayor que 0. Intenta de nuevo.");
            return false;
        }
        return true;
    }
}
