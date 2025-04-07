package tema4.ejerciciosB;

import java.io.*;
import java.util.*;

public class B1 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("numeros.txt"))) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            String linea;

            while ((linea = br.readLine()) != null) {
                int num = Integer.parseInt(linea.trim());
                if (num > max) max = num;
                if (num < min) min = num;
            }

            System.out.println("Máximo: " + max);
            System.out.println("Mínimo: " + min);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

