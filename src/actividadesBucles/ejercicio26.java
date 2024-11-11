package actividadesBucles;

import java.util.Scanner;

public class ejercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce el numero para comprobar si es primo");
        int numero = scanner.nextInt();
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                System.out.println("el numero NO es primo");
                break;


            }else{
                System.out.println("el numero es primo");
                break;
            }
        }
    }
    }