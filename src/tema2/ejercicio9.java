import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cambio;
        System.out.println("conversor de  dolares a euros :");
        System.out.println("introduce la cantidad de dolares que quieres convertir:");
        double dolares = scanner.nextDouble();
        cambio = dolares * 0.92;
        System.out.println("el cambiuo es:"+cambio);
    }
}
