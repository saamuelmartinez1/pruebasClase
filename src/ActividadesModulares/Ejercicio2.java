package ActividadesModulares;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce la edad:");
        int edad = scanner.nextInt();
        System.out.println("¿es mayor de edad?: "+isAdult(edad));
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
    public static boolean  isAdult(int edad) {
        if (edad>=18) {
            return true;
        } else{
              return false;
            }
    }
}
