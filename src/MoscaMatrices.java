package Matrices;

import java.util.Random;
import java.util.Scanner;

public class MoscaMatrices{
    public static void main(String[] args) {
        int moscaFila, moscaColumna;
        int jugadorFila, jugadorColumna;
        boolean juegoTerminado = false;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        moscaFila = random.nextInt(4);
        moscaColumna = random.nextInt(4);

        System.out.println("¡Atrapa a la mosca! Elige una posición entre (1,1) y (4,4).");

        while (!juegoTerminado) {
            System.out.print("Fila: ");
            jugadorFila = scanner.nextInt() - 1;
            System.out.print("Columna: ");
            jugadorColumna = scanner.nextInt() - 1;

            if (jugadorFila == moscaFila && jugadorColumna == moscaColumna) {
                System.out.println("¡Has atrapado a la mosca! ¡Ganaste!");
                juegoTerminado = true;
            } else if (Math.abs(jugadorFila - moscaFila) <= 1 && Math.abs(jugadorColumna - moscaColumna) <= 1) {
                System.out.println("¡Casi! La mosca se ha movido.");
                moscaFila = random.nextInt(4);
                moscaColumna = random.nextInt(4);
            } else {
                System.out.println("La mosca no está cerca. Intenta de nuevo.");
            }
        }

        scanner.close();
    }
}
