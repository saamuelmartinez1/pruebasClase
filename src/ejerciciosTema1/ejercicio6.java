package ejerciciosTema1;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area;
        System.out.println("ingrese el lado del cuadrado");
        double lado = scanner.nextDouble();
    area = lado *lado;
        System.out.println("el area del cudrado es igual a "+area);
    }
}
