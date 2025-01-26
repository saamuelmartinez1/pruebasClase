package Strings;

import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        juego();
    }

    public static void juego() {
        Scanner scanner = new Scanner(System.in);
        int vida = 0;
        System.out.println("Jugador 1: Introduzca una palabra:");
        String palabraSecreta = scanner.nextLine().toUpperCase();

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        do {
            System.out.println("Jugador 2: Intente acertar la palabra, inserte una letra o la palabra completa:");
            String palabra = scanner.nextLine().toUpperCase();

            if (palabra.length() > 1) {
                if (palabra.equalsIgnoreCase(palabraSecreta)) {
                    System.out.println("¡Felicidades! Acertaste la palabra secreta.");
                    return;
                } else {
                    System.out.println("Lo siento, no acertaste la palabra.");
                    vida++;
                }
            } else {
                boolean letraEncontrada = false;
                for (char c : palabra.toCharArray()) {
                    if (palabraSecreta.contains(Character.toString(c))) {
                        System.out.println("La letra coincide.");
                        letraEncontrada = true;
                        break;
                    }
                }

                if (!letraEncontrada) {
                    System.out.println("La letra no coincide.");
                    vida++;
                }
            }

            switch (vida) {
                case 6 -> System.out.println("""
                        o
                        /|\\
                        / \\""");
                case 5 -> System.out.println("""
                        o
                        /|\\
                        /""");
                case 4 -> System.out.println("""
                        o
                        /|\\
                        """);
                case 3 -> System.out.println("""
                        o
                        /|
                        """);
                case 2 -> System.out.println("""
                        o
                        /
                        """);
                case 1 -> System.out.println("o");
                case 0 -> System.out.println("¡Ahorcado!");
            }

        } while (vida < 6);

        System.out.println("¡Has perdido! La palabra secreta era: " + palabraSecreta);
    }
}
