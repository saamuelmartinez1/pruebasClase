package actividadesBucles;

import java.util.Scanner;

public class ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        double suma = 0;
        int contador = 0;

        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                suma += numero;
                contador++;
            }

        } while (numero >= 0);

        if (contador > 0) {
            double mediaTotal = suma / contador;
            System.out.println("La media de los números positivos es: " + mediaTotal);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

    }
}
