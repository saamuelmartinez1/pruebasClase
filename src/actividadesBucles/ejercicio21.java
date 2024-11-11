package actividadesBucles;

import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorPares = 0;
        for (int i = 1; i <= 1000  ; i++) {
            if (i % 2 == 0) {

               contadorPares +=i;
            }
        }
        System.out.println("la suma total es de: "+contadorPares);
    }
}
