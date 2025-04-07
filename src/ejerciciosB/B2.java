package tema4.ejerciciosB;

import java.io.*;
import java.util.*;

public class B2 {
    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("alumnos_notas.txt"))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                String nombre = partes[0].trim();
                String apellido = partes[1].trim();
                double suma = 0;
                for (int i = 2; i < partes.length; i++) {
                    suma += Double.parseDouble(partes[i]);
                }
                double media = suma / (partes.length - 2);
                alumnos.add(new Alumno(nombre + " " + apellido, media));
            }

            alumnos.sort((a, b) -> Double.compare(b.media, a.media));

            for (Alumno a : alumnos) {
                System.out.printf("%s -> %.2f\n", a.nombre, a.media);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class Alumno {
        String nombre;
        double media;

        public Alumno(String nombre, double media) {
            this.nombre = nombre;
            this.media = media;
        }
    }
}

