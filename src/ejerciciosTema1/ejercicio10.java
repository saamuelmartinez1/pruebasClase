package ejerciciosTema1;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double multiplicacion;
        double suma;
        double resta;
        double division;
        System.out.println("ingrese el valor del numero 1:");
        double numero1 = scanner.nextDouble();
        System.out.println("ingrese el valor del numero 2:");
        double numero2 = scanner.nextDouble();

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
