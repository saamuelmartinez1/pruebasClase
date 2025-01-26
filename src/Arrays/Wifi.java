package Arrays;

import java.util.Scanner;

public class Wifi {
    public static void main(String[] args) {
        potenciaWifi();
    }

    public static void potenciaWifi() {
        Scanner scanner = new Scanner(System.in);
        boolean proceso = false;

        do {
            System.out.println("Introduzca el número de la habitación (1-20):");
            int numberRoom = scanner.nextInt();

            System.out.println("Introduzca la potencia del router (1-6):");
            int powerRouter = scanner.nextInt();

            if (numberRoom < 1 || numberRoom > 20 || powerRouter < 1 || powerRouter > 6) {
                System.out.println("Valor incorrecto. Por favor, ingrese valores dentro del rango especificado.");
            } else {
                int[] miArray = new int[20];

                int routerIndex = numberRoom - 1;

                miArray[routerIndex] = powerRouter;

                for (int i = 1; i < powerRouter; i++) {
                    if (routerIndex + i < 20) {
                        miArray[routerIndex + i] = powerRouter - i;
                    }
                }

                for (int i = 1; i < powerRouter; i++) {
                    if (routerIndex - i >= 0) {
                        miArray[routerIndex - i] = powerRouter - i;
                    }
                }

                System.out.println("Cobertura de la señal WiFi:");
                for (int i = 0; i < miArray.length; i++) {
                    System.out.print(miArray[i] + " ");
                }
                System.out.println();

                proceso = true;
            }

        } while (!proceso);

    }
}
