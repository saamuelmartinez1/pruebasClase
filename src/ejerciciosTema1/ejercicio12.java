package ejerciciosTema1;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca el año");
        int anio = scanner.nextInt();

        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        if(esBisiesto){
            System.out.println("el año es bisiesto");

        } else {
            System.out.println("el año no es bisiesto");

        }


    }
}
