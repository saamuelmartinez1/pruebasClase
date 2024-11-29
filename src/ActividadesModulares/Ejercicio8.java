package ActividadesModulares;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        comprobarMes();

    }

    public static void comprobarMes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa un numero para indicar el mes del año(1-12)");
        int mes = scanner.nextInt();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("ahora ingresa el numero de dias");
                int dias = scanner.nextInt();
                if (dias == 31) {
                    System.out.println("el mes tiene 31, acertaste");
                } else {
                    System.out.println("fallaste, tiene 31 dias");
                }
                break;
            case 4, 6, 9, 11:
                System.out.println("ahora ingresa el numero de dias");
                 dias = scanner.nextInt();
                if (dias == 30) {
                    System.out.println("el mes tiene 30, acertaste");
                } else {
                    System.out.println("fallaste, tiene 30 dias");
                }
                break;
            case 2:
                System.out.print("Introduce un año: ");
                int year = scanner.nextInt();

                if (isLeapYear(year)) {
                    System.out.println(year + " es un año bisiesto, tiene 29 dias.");
                } else {
                    System.out.println(year + " no es un año bisiesto, tiene 28 dias.");
                }
                break;
            default:
                System.out.println("valor incorrecto");
        }
    }

    public static boolean isLeapYear(int year) {
        // Un año es bisiesto si:
        // Es divisible entre 4 y no divisible entre 100, o es divisible entre 400.
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    }
