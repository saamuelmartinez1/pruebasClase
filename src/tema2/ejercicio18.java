package tema2;

import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un numero para poder obtener su raiz cuadrada:");
        double numero = scanner.nextDouble();

        if (numero < 0){
            System.out.println("numero no valido:");

        }else{
            double raiz = Math.sqrt(numero);
            System.out.println("la raiz de "+numero+"es"+raiz);}
    }
}

