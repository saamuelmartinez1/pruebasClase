package modular2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nElige una opción:");
            System.out.println("1. Perímetro de un cuadrado");
            System.out.println("2. Área de un cuadrado");
            System.out.println("3. Perímetro de un rectángulo");
            System.out.println("4. Área de un rectángulo");
            System.out.println("5. Perímetro de un círculo");
            System.out.println("6. Área de un círculo");
            System.out.println("7. Comprobar si un número es primo");
            System.out.println("8. Número de dígitos de un número");
            System.out.println("9. Número de dígitos pares de un número");
            System.out.println("10. Número de dígitos impares de un número");
            System.out.println("11. Factorial de un número (iterativo)");
            System.out.println("12. Factorial de un número (recursivo)");
            System.out.println("13. Soluciones de una ecuación cuadrática");
            System.out.println("14. Suma de los dígitos de un número");
            System.out.println("15. Salir");
            System.out.print("Opción: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Introduce el lado del cuadrado: ");
                    double side = scanner.nextDouble();
                    System.out.println("Perímetro del cuadrado: " + MyMath.squarePerimeter(side));
                    break;
                case 2:
                    System.out.print("Introduce el lado del cuadrado: ");
                    side = scanner.nextDouble();
                    System.out.println("Área del cuadrado: " + MyMath.squareArea(side));
                    break;
                case 3:
                    System.out.print("Introduce el largo del rectángulo: ");
                    double length = scanner.nextDouble();
                    System.out.print("Introduce el ancho del rectángulo: ");
                    double width = scanner.nextDouble();
                    System.out.println("Perímetro del rectángulo: " + MyMath.rectanglePerimeter(length, width));
                    break;
                case 4:
                    System.out.print("Introduce el largo del rectángulo: ");
                    length = scanner.nextDouble();
                    System.out.print("Introduce el ancho del rectángulo: ");
                    width = scanner.nextDouble();
                    System.out.println("Área del rectángulo: " + MyMath.rectangleArea(length, width));
                    break;
                case 5:
                    System.out.print("Introduce el radio del círculo: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Perímetro del círculo: " + MyMath.circlePerimeter(radius));
                    break;
                case 6:
                    System.out.print("Introduce el radio del círculo: ");
                    radius = scanner.nextDouble();
                    System.out.println("Área del círculo: " + MyMath.circleArea(radius));
                    break;
                case 7:
                    System.out.print("Introduce un número entero: ");
                    int number = scanner.nextInt();
                    System.out.println("¿Es primo? " + MyMath.isPrime(number));
                    break;
                case 8:
                    System.out.print("Introduce un número entero: ");
                    number = scanner.nextInt();
                    System.out.println("Número de dígitos: " + MyMath.numberOfDigits(number));
                    break;
                case 9:
                    System.out.print("Introduce un número entero: ");
                    number = scanner.nextInt();
                    System.out.println("Número de dígitos pares: " + MyMath.countEvenDigits(number));
                    break;
                case 10:
                    System.out.print("Introduce un número entero: ");
                    number = scanner.nextInt();
                    System.out.println("Número de dígitos impares: " + MyMath.countOddDigits(number));
                    break;
                case 11:
                    System.out.print("Introduce un número entero: ");
                    number = scanner.nextInt();
                    System.out.println("Factorial (iterativo): " + MyMath.factorial(number));
                    break;
                case 12:
                    System.out.print("Introduce un número entero: ");
                    number = scanner.nextInt();
                    System.out.println("Factorial (recursivo): " + MyMath.factorialRecursive(number));
                    break;
                case 13:
                    System.out.print("Introduce el coeficiente a: ");
                    double a = scanner.nextDouble();
                    System.out.print("Introduce el coeficiente b: ");
                    double b = scanner.nextDouble();
                    System.out.print("Introduce el coeficiente c: ");
                    double c = scanner.nextDouble();
                    System.out.println("Número de soluciones: " + MyMath.quadraticSolutions(a, b, c));
                    break;
                case 14:
                    System.out.print("Introduce un número entero: ");
                    number = scanner.nextInt();
                    System.out.println("Suma de los dígitos: " + MyMath.sumDigits(number));
                    break;
                case 15:
                    exit = true;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        scanner.close();
    }
}
