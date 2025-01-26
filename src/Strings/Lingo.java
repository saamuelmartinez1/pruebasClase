package Strings;

import java.util.Scanner;

public class Lingo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jugador 1: Introduzca una palabra de 5 letras:");
        String palabraOculta = scanner.nextLine().toLowerCase();

        while (palabraOculta.length() != 5) {
            System.out.println("La palabra debe tener exactamente 5 letras. Inténtelo de nuevo:");
            palabraOculta = scanner.nextLine().toLowerCase();
        }

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        System.out.println("Jugador 2: Adivina la palabra oculta. Tienes 5 intentos.");
        int intentos = 0;

        while (intentos < 5) {
            System.out.print("Intento " + (intentos + 1) + ": ");
            String intento = scanner.nextLine().toLowerCase();

            while (intento.length() != 5) {
                System.out.println("La palabra debe tener exactamente 5 letras. Inténtelo de nuevo:");
                intento = scanner.nextLine().toLowerCase();
            }

            String hint = generarHint(palabraOculta, intento);
            System.out.println("Pista: " + hint);

            if (intento.equals(palabraOculta)) {
                System.out.println("¡Felicidades! Adivinaste la palabra.");
                return;
            }

            intentos++;
        }

        System.out.println("¡Lo siento! Has perdido. La palabra oculta era: " + palabraOculta);
    }

    public static String generarHint(String palabraOculta, String intento) {
        StringBuilder hint = new StringBuilder("-----");

        for (int i = 0; i < 5; i++) {
            if (intento.charAt(i) == palabraOculta.charAt(i)) {
                hint.setCharAt(i, '*');
            }
        }

        for (int i = 0; i < 5; i++) {
            if (hint.charAt(i) != '*' && palabraOculta.contains(Character.toString(intento.charAt(i)))) {
                hint.setCharAt(i, '-');
            }
        }

        return hint.toString();
    }
}

