package ejerciciosTema1;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caraCambiada;
        System.out.println("ingrese la cara del lado");
        int numero = scanner.nextInt();
        if (numero > 6 || numero < 1) {
            System.out.println("la cara no es valida");
        } else{
            caraCambiada = 7- numero;
            System.out.println("la cara contraria es:"+ caraCambiada);
        }
    }
}


