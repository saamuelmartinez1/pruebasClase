package tema2;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cambio;
        System.out.println("conversor de euros a dolares:");
        System.out.println("introduce la cantidad de euros que quieres convertir:");
        double euros = scanner.nextDouble();
        cambio = euros * 1.09;
        System.out.println("el cambiuo es:"+cambio);
    }
}
