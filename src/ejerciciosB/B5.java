package tema4.ejerciciosB;

import java.io.*;
import java.util.*;

public class B5 {
    public static void main(String[] args) {
        File carpeta = new File("Diccionario");
        carpeta.mkdir();

        Map<Character, List<String>> letras = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("diccionario.txt"))) {
            String palabra;

            while ((palabra = br.readLine()) != null) {
                palabra = palabra.trim();
                if (palabra.isEmpty()) continue;
                char inicial = Character.toUpperCase(palabra.charAt(0));
                letras.computeIfAbsent(inicial, k -> new ArrayList<>()).add(palabra);
            }

            for (char letra = 'A'; letra <= 'Z'; letra++) {
                List<String> lista = letras.getOrDefault(letra, new ArrayList<>());
                try (PrintWriter pw = new PrintWriter(new FileWriter("Diccionario/" + letra + ".txt"))) {
                    for (String p : lista) {
                        pw.println(p);
                    }
                }
            }

            System.out.println("Diccionario generado por letras.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
