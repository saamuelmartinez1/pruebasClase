package tema4.ejerciciosB;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class B3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Archivo origen: ");
        String archivoA = in.nextLine();
        System.out.print("Archivo destino: ");
        String archivoB = in.nextLine();

        try {
            List<String> lineas = new ArrayList<>(Files.readAllLines(new File(archivoA).toPath()));
            Collections.sort(lineas);
            Files.write(new File(archivoB).toPath(), lineas);
            System.out.println("Archivo ordenado creado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

