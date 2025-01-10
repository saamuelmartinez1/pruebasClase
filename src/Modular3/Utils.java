package Modular3;

import java.util.Scanner;

public class Utils {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    miles2kilometres();
        getTaxes();
    }
public static double miles2kilometres(){
    Scanner scanner = new Scanner(System.in);
    double kilometros = 0;
    System.out.println("ingresa el valor en millas para pasarlo a kilometros:");
     double millas = scanner.nextDouble();
    kilometros  = millas * 1.60934;
    System.out.println("las millas pasadas a kilometros son:"+kilometros);
        return kilometros;
}
public static double getTaxes(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("ingrese la cantidad en euros, para poder calcular sus impuestos:");
    double euros = scanner.nextDouble();
    double impuestos = 0;
    impuestos = euros *0.79;
    impuestos = Math.round(impuestos * 100) / 100.0;
    return impuestos;
}
}
