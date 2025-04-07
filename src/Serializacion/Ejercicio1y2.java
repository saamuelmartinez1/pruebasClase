package tema4.Serializacion;

import java.io.*;
import java.util.Scanner;

public class Ejercicio1y2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();

        try (PrintWriter pw = new PrintWriter("usuario.txt")) {
            pw.println("Nombre: " + nombre);
            pw.println("Edad: " + edad);
            System.out.println("Datos guardados en usuario.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Contenido del archivo:");
        try (BufferedReader br = new BufferedReader(new FileReader("usuario.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

