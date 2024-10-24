package ejerciciosTema1;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        int multiplicacion;
        int suma;
        int resta;
        int division;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el valor del numero 1:");
        int numero1 = scanner.nextInt();
        System.out.println("ingrese el valor del numero 2:");
        int numero2 = scanner.nextInt();

        multiplicacion = numero1* numero2;
        suma= numero1+numero2;
        resta= numero1-numero2;
        division = numero1/numero2;
        System.out.println("el resultado de la suma es:"+suma);
        System.out.println("el resultado de la resta es:"+resta);
        System.out.println("el resultado de la multiplicacion es:"+multiplicacion);
        System.out.println("el resultado de la division es:"+division);

    }
}
