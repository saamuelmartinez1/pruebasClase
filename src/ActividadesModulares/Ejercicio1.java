package ActividadesModulares;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número para comprobar si es 0, positivo o negativo:");
        int num = scanner.nextInt();

        System.out.println("el resultado es de :"+numberSign(num));


    }

    public static int numberSign(int num) {
        if (num == 0) {
            return 0;
        } else if (num < 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
