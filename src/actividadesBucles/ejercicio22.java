package actividadesBucles;

import java.util.Scanner;

public class ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cifras =1;
        System.out.println("ingrese el numero pàra conocer cuantas cifras tiene:");
        int numero = scanner.nextInt();
       while(numero>10){
           numero = numero/10;
           cifras ++;
       }
        System.out.println("el numero tiene "+cifras+" cifras");
        }
    }

