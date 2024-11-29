package ActividadesModulares;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion =0;
        double dolaresFinales =0;
        double eurosFinales =0;
        showMenu(opcion,dolaresFinales,eurosFinales);

    }
    public static void showMenu(int opcion,double dolaresFinales,double eurosFinales){
        Scanner scanner = new Scanner(System.in);



        do{
            System.out.println("1) pasar de euros a dolares:");
            System.out.println("2)pasar de dolares a euros:");
            System.out.println("3) salir:");
            System.out.println("ingrese la opcion que desee");
             opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    euro2dolar( eurosFinales);
                    break;
                case 2:
                    dolar2euro( dolaresFinales);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("opcion no valida, intentelo de nuevo");

            }

        }while(opcion !=3);
    }
    public static double euro2dolar(double eurosFinales){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ha elegido la opcion de pasar de euros a dolares:");
        System.out.println("ingrese la cantidad de euros:");
        double euros = scanner.nextDouble();
        eurosFinales = euros * 1.06;
        System.out.println("los euros a dolares son:"+eurosFinales);
        return euros;
    }
    public static double dolar2euro(double dolaresFinales){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ha elegido la opcion de pasar de dolares a euros");
        System.out.println("ingrese la cantidad en dolares:");
        double dolares = scanner.nextDouble();
        dolaresFinales = dolares * 0.95;
        System.out.println("los dolares a euros son:"+dolaresFinales);


        return dolares;
    }
}


