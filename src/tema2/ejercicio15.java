package tema2;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce el mes del año en numero:");
        int mes = scanner.nextInt();
        System.out.println("introduce el año:");
        int year = scanner.nextInt();


        switch (mes){
            case 1,3,5,7,8,10,12:
                System.out.println("tienen 31 dias");
                break;
            case 4,6,9,11:
                System.out.println("tienen 30 dias");
                break;
            case 2:
                if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                    System.out.println("el año es bisiesto,por tanto, febrero tiene 29 dias");
                }else{
                    System.out.println("febrero tiene 28 dias");
                }
                break;

        }

    }
}
