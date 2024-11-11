package tema2;
import java.util.Scanner;


public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("comprobemos si los numeros estan ordenados de mayor a menor:");
        System.out.println("introduce el numero 1");
        double numero1 = scanner.nextDouble();
        System.out.println("introduce el numero 2");
        double numero2 = scanner.nextDouble();
        System.out.println("introduce el numero 3");
        double numero3 = scanner.nextDouble();
if (numero3>numero2 && numero2>numero1){
    System.out.println("los numeros estan introducidos de menor a mayor");
}else{
    System.out.println("no estan ordenados");
}
    }
}
