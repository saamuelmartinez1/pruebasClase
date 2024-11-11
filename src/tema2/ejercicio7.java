import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double resultado;
        System.out.println("introduzca el numero 1: ");
        double numero1 = scanner.nextDouble();
        System.out.println("introduzca el numero 2");
        double numero2 = scanner.nextDouble();

        if(numero1>numero2){
            resultado= numero1-numero2;
            System.out.println("el resultado es:"+resultado);
        } else{
            resultado= numero2-numero1;
            System.out.println("el resultado es:"+resultado);
        }
    }
}
