package tema2;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vamos a comprobar si los tres numeros son consecutivos:");
        System.out.println("ingrese el primer numero:");
        int numero1 = scanner.nextInt();

        System.out.println("ingrese el segundo numero:");
        int numero2 = scanner.nextInt();

        System.out.println("ingrese el tercer numero:");
        int numero3 = scanner.nextInt();

        if(numero1 == numero2 +1 && numero2 == numero3+1){
            System.out.println("los numeros son consecutivos");
        }else if (numero3 == numero2 +1 && numero2 == numero1+1){
            System.out.println("los numeros son consecutivos");
        }else {
            System.out.println("los numeros no son consecutivos");
        }
    }
}
