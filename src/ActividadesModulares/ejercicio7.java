
package ActividadesModulares;
import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número entero positivo (0 para salir): ");
            numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("Programa terminado.");
            } else if (numero < 0) {
                System.out.println("Por favor, introduce un número positivo.");
            } else {
                if (esPrimo(numero)) {
                    System.out.println("El número " + numero + " es primo.");
                } else {
                    System.out.println("El número " + numero + " no es primo.");
                }
            }
        } while (numero != 0);
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
