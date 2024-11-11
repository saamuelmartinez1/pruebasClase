package actividadesBucles;

import java.util.Scanner;
public class ejercicio27 {
    public static void main(String[] args) {
        int contador = 0;
        int numero = 2;


        while (contador < 20) {
            boolean esPrimo = true;

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                }
            }

            if (esPrimo) {
                System.out.println(numero);
                contador++;
            }

            numero++;
        }
    }
}
