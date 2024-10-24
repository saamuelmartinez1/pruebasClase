package tema2;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el primer numero:");
        int numero1 = scanner.nextInt();

        System.out.println("ingrese el segundo numero:");
        int numero2 = scanner.nextInt();

        System.out.println("ingrese el tercer numero:");
        int numero3 = scanner.nextInt();

        if (numero1 > numero2 && numero2 > numero3){
            System.out.println("el orden de los numero es:");
            System.out.println(numero1);
            System.out.println(numero2);
            System.out.println(numero3);
        } else if (numero2 > numero1 && numero1 > numero3){
            System.out.println(numero2);
            System.out.println(numero1);


        }
    }
}
