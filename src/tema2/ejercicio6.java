import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca un numero");
       double numero = scanner.nextDouble();
       if(numero> 0){
           System.out.println("el numero es positivo");
       } else if (numero<0){
           System.out.println("el numerpo es negativo");
       }else{
           System.out.println("el numero es igual a cero");
       }
    }
}
