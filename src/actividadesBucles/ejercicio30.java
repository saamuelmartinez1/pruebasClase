package actividadesBucles;

import java.util.Scanner;

public class ejercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int opcion =0;
        double suma =0;
        double resta =0;
        double multiplicacion =0;
        double division = 0;
double resto =0;

do{
    System.out.println("opcion 1 sumar");
    System.out.println("opcion 2 restar ");
    System.out.println("opcion 3 multiplicar");
    System.out.println("opcion 4 dividir");
    System.out.println("opcion 5 resto");
    System.out.println("opcion 6 salir ");
    System.out.println("INGRESA EL NUMERO 1");
    double numero1 = scanner.nextDouble();
    System.out.println("INGRESA EL NUMERO 2");
    double numero2 = scanner.nextDouble();
    System.out.println("ingrese una opcion:");
     opcion = scanner.nextInt();
    switch(opcion){
        case 1:
           suma = numero1 + numero2;
            System.out.println(suma);
            break;
        case 2:
            resta = numero1-numero2;
            System.out.println(resta);
            break;
        case 3:
            multiplicacion = numero1*numero2;
            System.out.println(multiplicacion);
            break;
        case 4:
            division = numero1/numero2;
            System.out.println(division);
            break;
        case 5:
            resto = numero1 % numero2;
            System.out.println(resto);
            break;
        case 6:
            System.out.println("salio del programa");
            break;

    }


} while(opcion!=6);

}


        }

