package tema2;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce 'D' para convertir de euros a dólares o 'E' para convertir de dólares a euros: ");
        char opcion = scanner.next().charAt(0);



        switch (Character.toUpperCase(opcion)) {
            case 'D':
                System.out.print("Introduce la cantidad en euros: ");
                double euros = scanner.nextDouble();
                    double eurosAdolares = euros * 1.08;
                System.out.printf("La cantidad a dolares es:"+eurosAdolares);
                break;

            case 'E':
                System.out.print("Introduce la cantidad en dólares: ");
                double dolares = scanner.nextDouble();
                double eurosConvertidos = dolares * 0.92;
                System.out.printf("los dolares a euros son:"+eurosConvertidos);
                break;

            default:
                System.out.println("Opción inválida. Por favor, introduce 'D' o 'E'.");
        }
    }
}

