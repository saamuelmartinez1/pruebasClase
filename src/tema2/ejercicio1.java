package tema2;
import java.util.Scanner;

public class ejercicio1{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double area;
    double perimetro;
    System.out.println("introduzca el lado del cuadrado:");
    double lado = scanner.nextDouble();
    area = lado*lado;
    perimetro= lado*4;
    System.out.println("el perimetro del cuadrado es:"+perimetro);
    System.out.println("el area del cuadrado:"+area);
}
}
