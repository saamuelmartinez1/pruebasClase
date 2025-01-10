package tema3;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] miArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        while (true) {
            System.out.println("\nSelecciona una operación:");
            System.out.println("1. Imprimir el array");
            System.out.println("2. Obtener el máximo del array");
            System.out.println("3. Obtener el mínimo del array");
            System.out.println("4. Calcular la media del array");
            System.out.println("5. Comprobar si un elemento existe en el array");
            System.out.println("6. Sumar dos arrays");
            System.out.println("7. Restar dos arrays");
            System.out.println("8. Producto escalar de dos arrays");
            System.out.println("9. Invertir el array (función)");
            System.out.println("10. Invertir el array (procedimiento)");
            System.out.println("11. Verificar si el array es capicúa");
            System.out.println("0. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    imprimirArray(miArray);
                    break;
                case 2:
                    imprimirArray(arrayMax(miArray));
                    break;
                case 3:
                    imprimirArray(arrayMin(miArray));
                    break;
                case 4:
                    imprimirArray(arrayMean(miArray));
                    break;
                case 5:
                    if (arrayValueExist(miArray)) {
                        System.out.println("El valor ingresado existe en el array.");
                    } else {
                        System.out.println("El valor ingresado no existe en el array.");
                    }
                    break;
                case 6:
                    imprimirArray(sumaArray());
                    break;
                case 7:
                    imprimirArray(restaArray());
                    break;
                case 8:
                    imprimirArray(productoArrays());
                    break;
                case 9:
                    imprimirArray(invertirArray(miArray));
                    break;
                case 10:
                    invertirArrayProcedimiento(miArray);
                    imprimirArray(miArray);
                    break;
                case 11:
                    if (esCapicua(miArray)) {
                        System.out.println("El array es capicúa.");
                    } else {
                        System.out.println("El array no es capicúa.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public static void imprimirArray(int[] miArray) {
        for (int i = 0; i < miArray.length; i++) {
            System.out.print(miArray[i] + " ");
        }
        System.out.println();
    }

    public static int[] arrayMax(int[] miArray) {
        int mayor = miArray[0];
        for (int i = 1; i < miArray.length; i++) {
            if (miArray[i] > mayor) {
                mayor = miArray[i];
            }
        }
        return new int[]{mayor};
    }

    public static int[] arrayMin(int[] miArray) {
        int minimo = miArray[0];
        for (int i = 1; i < miArray.length; i++) {
            if (miArray[i] < minimo) {
                minimo = miArray[i];
            }
        }
        return new int[]{minimo};
    }

    public static int[] arrayMean(int[] miArray) {
        int suma = 0;
        for (int i = 0; i < miArray.length; i++) {
            suma += miArray[i];
        }
        int media = suma / miArray.length;
        return new int[]{media};
    }

    public static boolean arrayValueExist(int[] miArray) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor para comprobar: ");
        int value = scanner.nextInt();
        for (int i = 0; i < miArray.length; i++) {
            if (miArray[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static int[] sumaArray() {
        int[] vector1 = {1, 2, 3, 4, 5};
        int[] vector2 = {6, 7, 8, 9, 10};
        int[] resultado = new int[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            resultado[i] = vector1[i] + vector2[i];
        }
        return resultado;
    }

    public static int[] restaArray() {
        int[] vector1 = {1, 2, 3, 4, 5};
        int[] vector2 = {6, 7, 8, 9, 10};
        int[] resultado = new int[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            resultado[i] = vector1[i] - vector2[i];
        }
        return resultado;
    }

    public static int[] productoArrays() {
        int[] vector1 = {1, 2, 3, 4, 5};
        int[] vector2 = {6, 7, 8, 9, 10};
        int[] resultado = new int[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            resultado[i] = vector1[i] * vector2[i];
        }
        return resultado;
    }

    public static int[] invertirArray(int[] miArray) {
        int[] invertido = new int[miArray.length];
        for (int i = 0; i < miArray.length; i++) {
            invertido[i] = miArray[miArray.length - 1 - i];
        }
        return invertido;
    }

    public static void invertirArrayProcedimiento(int[] miArray) {
        for (int i = 0; i < miArray.length / 2; i++) {
            int temp = miArray[i];
            miArray[i] = miArray[miArray.length - 1 - i];
            miArray[miArray.length - 1 - i] = temp;
        }
    }

    public static boolean esCapicua(int[] miArray) {
        for (int i = 0; i < miArray.length / 2; i++) {
            if (miArray[i] != miArray[miArray.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
