package ejerciciosTema1;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa el primer numero");
        int numero1 = scanner.nextInt();
        System.out.println("ingresa el segundo numero");
        int numero2 = scanner.nextInt();

        if(numero1 > numero2){
            System.out.println(" el numero 1 es mayor");

        }else if (numero2> numero1){
            System.out.println("El numero 2 es mayor");
        }else{
            System.out.println("los numeros son iguales");
        }
    }
}
