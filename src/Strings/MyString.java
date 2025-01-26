package Strings;

import java.util.Scanner;

public class MyString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una cadena:");
        String cadena = scanner.nextLine();

        System.out.println("Cadena invertida y en mayúsculas: " + invertirYMayusculas(cadena));
        System.out.println("Número de vocales: " + contarVocales(cadena));
        System.out.println("Palabra más larga: " + palabraMasLarga(cadena));
        System.out.println("Introduce otra cadena para contar cuántas veces está en la primera:");
        String segundaCadena = scanner.nextLine();
        System.out.println("La segunda cadena aparece " + contarApariciones(cadena, segundaCadena) + " veces.");
        System.out.println("Número de palabras: " + contarPalabras(cadena));
        System.out.println("Introduce un número de teléfono:");
        String telefono = scanner.nextLine();
        System.out.println("Teléfono formateado: " + formatearTelefono(telefono));
        System.out.println("Histograma de vocales:");
        mostrarHistogramaVocales(cadena);
    }

    public static String invertirYMayusculas(String cadena) {
        return new StringBuilder(cadena).reverse().toString().toUpperCase();
    }

    public static int contarVocales(String cadena) {
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (char c : cadena.toCharArray()) {
            if (vocales.contains(Character.toString(c))) {
                contador++;
            }
        }
        return contador;
    }

    public static String palabraMasLarga(String cadena) {
        String[] palabras = cadena.split(" ");
        String masLarga = "";
        for (String palabra : palabras) {
            if (palabra.length() > masLarga.length()) {
                masLarga = palabra;
            }
        }
        return masLarga;
    }

    public static int contarApariciones(String cadena, String subcadena) {
        int contador = 0;
        int indice = cadena.indexOf(subcadena);
        while (indice != -1) {
            contador++;
            indice = cadena.indexOf(subcadena, indice + subcadena.length());
        }
        return contador;
    }

    public static int contarPalabras(String cadena) {
        String[] palabras = cadena.trim().split("\\s+");
        return palabras.length;
    }

    public static String formatearTelefono(String telefono) {
        if (telefono.length() < 11) {
            return "Número no válido";
        }
        String codigoPais = telefono.substring(0, 2);
        String central = telefono.substring(2, 5);
        String resto = telefono.substring(5);
        return "(+" + codigoPais + ")-" + central + "-" + resto;
    }

    public static void mostrarHistogramaVocales(String cadena) {
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (char c : cadena.toLowerCase().toCharArray()) {
            switch (c) {
                case 'a' -> a++;
                case 'e' -> e++;
                case 'i' -> i++;
                case 'o' -> o++;
                case 'u' -> u++;
            }
        }

        System.out.println("a " + a + " " + "*".repeat(a));
        System.out.println("e " + e + " " + "*".repeat(e));
        System.out.println("i " + i + " " + "*".repeat(i));
        System.out.println("o " + o + " " + "*".repeat(o));
        System.out.println("u " + u + " " + "*".repeat(u));
    }
}
