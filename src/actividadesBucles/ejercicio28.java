package actividadesBucles;

import java.util.Random;
import java.util.Scanner;

public class ejercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("elija un numero hasta el 99999:");
        int numero = scanner.nextInt();
             int randomInt = random.nextInt(99999);

        if(numero == randomInt){
            System.out.println("numero correcto");
            System.out.println(randomInt);

        }else{
            System.out.println("numero incorrecto");
            System.out.println(randomInt);
        }

    }
}
