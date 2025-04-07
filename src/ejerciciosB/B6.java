package tema4.ejerciciosB;

import java.io.*;
import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("pi-million.txt"));
            StringBuilder pi = new StringBuilder();
            String linea;
            while ((linea = br.readLine()) != null) {
                pi.append(linea.trim());
            }

            Scanner in = new Scanner(System.in);
            System.out.print("Introduce el número que quieres buscar: ");
            String buscar = in.nextLine();

            boolean encontrado = false;
            for (int i = 0; i <= pi.length() - buscar.length(); i++) {
                int j;
                for (j = 0; j < buscar.length(); j++) {
                    if (pi.charAt(i + j) != buscar.charAt(j)) break;
                }
                if (j == buscar.length()) {
                    encontrado = true;
                    break;
                }
            }

            if (encontrado) {
                System.out.println("¡Número encontrado!");
            } else {
                System.out.println("Número NO encontrado.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

