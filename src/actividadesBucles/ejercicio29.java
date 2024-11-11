package actividadesBucles;

import java.util.Random;
import java.util.Scanner;

public class ejercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int numeroSecreto = random.nextInt(100);
        int intento;


        do {
            System.out.print("Introduce tu intento (un número entre 0 y 99): ");
            intento = scanner.nextInt();

            if (intento > numeroSecreto) {
                System.out.println("El número es menor.");
            } else if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            }

        } while (intento != numeroSecreto);

        System.out.println("¡Felicidades! El número es correcto.");

    }
}
