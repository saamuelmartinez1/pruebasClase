package tema2;

import java.util.Scanner;

public class ejercicio13 {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Introduce la hora en formato HH:MM:SS: ");

                int horas = scanner.nextInt();
                int minutos = scanner.nextInt();
                int segundos = scanner.nextInt();

                segundos++;
                if (segundos == 60) {
                    segundos = 0;
                    minutos++;
                }
                if (minutos == 60) {
                    minutos = 0;
                    horas++;
                }
                if (horas == 24) {
                    horas = 0;
                }

                System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);
                scanner.close();
            }
        }
