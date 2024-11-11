package actividadesBucles;

import java.util.Scanner;

public class ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial =1;
        System.out.println("vamos a calcular el factorial");
        System.out.println("introduce el numero a calcular:");
        int numero = scanner.nextInt();
        for (int i = 1; i <= numero; i++) {

             factorial *= i;
        }
        System.out.println("el factorial es : "+factorial);
    }
}
