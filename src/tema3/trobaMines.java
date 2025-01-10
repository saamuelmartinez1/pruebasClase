package tema3;

import java.util.Scanner;
import java.util.Random;

public class trobaMines {

    public static void main(String[] args) {
        int[] tablero = new int[20];
        boolean[] descubierto = new boolean[20];
        iniciarTablero(tablero);
        jugar(tablero, descubierto);
    }

    public static void iniciarTablero(int[] tablero) {
        colocarMinas(tablero, 6);
        calcularPistas(tablero);
    }

    public static void colocarMinas(int[] tablero, int minas) {
        Random random = new Random();
        for (int i = 0; i < minas; ) {
            int posicion = random.nextInt(tablero.length);
            if (tablero[posicion] != -1) {
                tablero[posicion] = -1;
                i++;
            }
        }
    }

    public static void calcularPistas(int[] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i] != -1) {
                int pistas = 0;
                if (i > 0 && tablero[i - 1] == -1) pistas++;
                if (i < tablero.length - 1 && tablero[i + 1] == -1) pistas++;
                tablero[i] = pistas;
            }
        }
    }

    public static void jugar(int[] tablero, boolean[] descubierto) {
        Scanner scanner = new Scanner(System.in);
        boolean juegoTerminado = false;
        int casillasDescubiertas = 0;

        while (!juegoTerminado) {
            mostrarTablero(tablero, descubierto);
            System.out.print("Elige una posición (0-" + (tablero.length - 1) + "): ");
            int posicion = scanner.nextInt();

            if (posicion < 0 || posicion >= tablero.length) continue;

            if (tablero[posicion] == -1) {
                System.out.println("¡BOOM! Has pisado una mina. Fin del juego.");
                juegoTerminado = true;
            } else {
                if (!descubierto[posicion]) {
                    descubierto[posicion] = true;
                    casillasDescubiertas++;
                }
                if (casillasDescubiertas == tablero.length - 6) {
                    System.out.println("Felicidades! Has ganado.");
                    juegoTerminado = true;
                }
            }
        }

        mostrarTableroFinal(tablero);
    }

    public static void mostrarTablero(int[] tablero, boolean[] descubierto) {
        for (int i = 0; i < tablero.length; i++) {
            if (descubierto[i]) {
                if (tablero[i] == -1) System.out.print("* ");
                else System.out.print(tablero[i] + " ");
            } else System.out.print("? ");
        }
        System.out.println();
    }

    public static void mostrarTableroFinal(int[] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i] == -1) System.out.print("* ");
            else System.out.print(tablero[i] + " ");
        }
        System.out.println();
    }
}
