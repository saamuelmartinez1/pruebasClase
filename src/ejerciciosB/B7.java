package tema4.ejerciciosB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class B7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del archivo: ");
        String nombreArchivo = scanner.nextLine();

        int lineas = 0;
        int palabrasTotales = 0;
        int caracteres = 0;
        Map<String, Integer> contadorPalabras = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("lazarillo.txt"))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                lineas++;
                caracteres += linea.length();

                String[] palabras = linea.toLowerCase().split("\\W+");
                for (String palabra : palabras) {
                    if (!palabra.isEmpty()) {
                        palabrasTotales++;
                        contadorPalabras.put(palabra, contadorPalabras.getOrDefault(palabra, 0) + 1);
                    }
                }
            }

            System.out.println("\n--- Estadísticas ---");
            System.out.println("Líneas: " + lineas);
            System.out.println("Palabras: " + palabrasTotales);
            System.out.println("Caracteres: " + caracteres);

            System.out.println("\nTop 10 palabras más comunes:");
            contadorPalabras.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .limit(10)
                    .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
            e.printStackTrace();
        }
    }
}
