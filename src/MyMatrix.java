package Matrices;

import java.util.Scanner;

public class MyMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número de filas:");
        int filas = scanner.nextInt();
        System.out.println("Introduce el número de columnas:");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];
        System.out.println("Introduce los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        imprimirMatriz(matriz);
        System.out.println("Máximo: " + maximoMatriz(matriz));
        System.out.println("Mínimo: " + minimoMatriz(matriz));
        System.out.println("Media: " + mediaMatriz(matriz));
        System.out.println("Introduce un número para buscar en la matriz:");
        int elemento = scanner.nextInt();
        System.out.println("¿Existe el elemento? " + (existeElemento(matriz, elemento) ? "Sí" : "No"));
        System.out.println("El número " + elemento + " se repite " + contarRepeticiones(matriz, elemento) + " veces.");

        System.out.println("Introduce otra matriz para sumar/restar:");
        int[][] otraMatriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                otraMatriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Suma de matrices:");
        imprimirMatriz(sumarMatrices(matriz, otraMatriz));
        System.out.println("Resta de matrices:");
        imprimirMatriz(restarMatrices(matriz, otraMatriz));
        System.out.println("¿Es una matriz unidad? " + (esMatrizUnidad(matriz) ? "Sí" : "No"));
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    public static int maximoMatriz(int[][] matriz) {
        int maximo = Integer.MIN_VALUE;
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                if (elemento > maximo) {
                    maximo = elemento;
                }
            }
        }
        return maximo;
    }

    public static int minimoMatriz(int[][] matriz) {
        int minimo = Integer.MAX_VALUE;
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                if (elemento < minimo) {
                    minimo = elemento;
                }
            }
        }
        return minimo;
    }

    public static double mediaMatriz(int[][] matriz) {
        int suma = 0, totalElementos = 0;
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                suma += elemento;
                totalElementos++;
            }
        }
        return (double) suma / totalElementos;
    }

    public static boolean existeElemento(int[][] matriz, int elemento) {
        for (int[] fila : matriz) {
            for (int e : fila) {
                if (e == elemento) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int contarRepeticiones(int[][] matriz, int elemento) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int e : fila) {
                if (e == elemento) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }

    public static int[][] restarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        return resultado;
    }

    public static boolean esMatrizUnidad(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas != columnas) {
            return false;
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == j && matriz[i][j] != 1) {
                    return false;
                } else if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
