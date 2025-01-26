package Strings;

import java.util.Scanner;

public class juliocesar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un mensaje para cifrar: ");
        String mensaje = scanner.nextLine();

        String mensajeCifrado = encrypt(mensaje);
        String mensajeDescifrado = decrypt(mensajeCifrado);

        System.out.println("Mensaje original: " + mensaje);
        System.out.println("Mensaje cifrado: " + mensajeCifrado);
        System.out.println("Mensaje descifrado: " + mensajeDescifrado);

        scanner.close();
    }

    public static String encrypt(String mensaje) {
        StringBuilder cifrado = new StringBuilder();
        mensaje = mensaje.toUpperCase();

        for (char c : mensaje.toCharArray()) {
            if (Character.isLetter(c)) {
                if (c == 'Z') {
                    cifrado.append('A');
                } else {
                    cifrado.append((char) (c + 1));
                }
            } else if (Character.isDigit(c)) {
                if (c == '9') {
                    cifrado.append('0');
                } else {
                    cifrado.append((char) (c + 1));
                }
            } else {
                cifrado.append(c);
            }
        }

        return cifrado.toString();
    }

    public static String decrypt(String mensaje) {
        StringBuilder descifrado = new StringBuilder();

        for (char c : mensaje.toCharArray()) {
            if (Character.isLetter(c)) {
                if (c == 'A') {
                    descifrado.append('Z');
                } else {
                    descifrado.append((char) (c - 1));
                }
            } else if (Character.isDigit(c)) {
                if (c == '0') {
                    descifrado.append('9');
                } else {
                    descifrado.append((char) (c - 1));
                }
            } else {
                descifrado.append(c);
            }
        }

        return descifrado.toString();
    }
}