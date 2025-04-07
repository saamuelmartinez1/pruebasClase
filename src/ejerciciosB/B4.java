package tema4.ejerciciosB;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class B4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("¿Cuántos nombres deseas generar?: ");
        int cantidad = in.nextInt();
        in.nextLine();

        System.out.print("Archivo de salida: ");
        String archivoSalida = in.nextLine();

        try {
            List<String> nombres = Files.readAllLines(new File("usa_nombres.txt").toPath());
            List<String> apellidos = Files.readAllLines(new File("usa_apellidos.txt").toPath());
            Random rand = new Random();

            try (PrintWriter pw = new PrintWriter(new FileWriter(archivoSalida, true))) {
                for (int i = 0; i < cantidad; i++) {
                    String nombreCompleto = nombres.get(rand.nextInt(nombres.size())) + " " +
                            apellidos.get(rand.nextInt(apellidos.size()));
                    pw.println(nombreCompleto);
                }
            }

            System.out.println("Nombres añadidos a " + archivoSalida);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

