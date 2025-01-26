package Matrices;

import java.util.Scanner;

public class WifiMatrices {

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int celda : fila) {
                System.out.print(celda + " ");
            }
            System.out.println();
        }
    }

    public static void calcularCobertura(int[][] hotel, int x, int y, int potencia) {
        int filas = hotel.length;
        int columnas = hotel[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int distanciaManhattan = Math.abs(x - i) + Math.abs(y - j);
                if (distanciaManhattan <= potencia) {
                    hotel[i][j] = Math.max(hotel[i][j], potencia - distanciaManhattan);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filas = 12;
        int columnas = 5;
        int[][] hotel = new int[filas][columnas];

        System.out.print("Ingresa la planta donde instalarás el router (1-12): ");
        int x = scanner.nextInt() - 1;
        System.out.print("Ingresa la habitación donde instalarás el router (1-5): ");
        int y = scanner.nextInt() - 1;
        System.out.print("Ingresa la potencia del router: ");
        int potencia = scanner.nextInt();

        calcularCobertura(hotel, x, y, potencia);

        System.out.println("Matriz de cobertura del hotel:");
        mostrarMatriz(hotel);

        scanner.close();
    }
}