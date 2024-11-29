package ActividadesModulares;

import java.util.Scanner;

import static ActividadesModulares.Ejercicio1.numberSign;
import static ActividadesModulares.Ejercicio2.isAdult;
import static ActividadesModulares.ejercicio4.dolar2euro;
import static ActividadesModulares.ejercicio7.esPrimo;

public class Ejercicio10 {
    public static void main(String[] args) {
String opcion ="p";
        optionsMenu(opcion);
    }
    public static void showMenu(){
                System.out.println("a) Muestra el signo de un número introducido por el usuario.");
                System.out.println("b) Indica si el usuario es mayor de edad o no.");
                System.out.println("c) Calcula el área y perímetro de un círculo.");
                System.out.println("d) Conversor de euros a dólares y de dólares a euros.");
                System.out.println("e) Mostrar tabla de multiplicar de un número.");
                System.out.println("f) Mostrar tablas de multiplicar del 1 al 10.");
                System.out.println("g) Comprobador de números primos.");
                System.out.println("h) Comprobador de fechas.");
                System.out.println("i) Dibujar triángulos.");
                System.out.println("j) salir");
                System.out.println("ingrese una opcion");
            }
            public static void optionsMenu(String opcion){
                Scanner scanner = new Scanner(System.in);

        do{
            showMenu();
             opcion = scanner.nextLine();
             switch(opcion){
                 case "a":
                     System.out.println("ingrese el numero:");
                     int num = scanner.nextInt();
                numberSign(2);
                     System.out.println(numberSign(num));
                     break;
                 case "b":
                     System.out.println("ingrese la edad para veriicar si es adulto:");
                     int edad = scanner.nextInt();
                isAdult(edad);
                     System.out.println(isAdult(edad));
                     break;
                 case "c":
                     System.out.println("Introduce un radio mayor que 0:");
                     double radio = scanner.nextDouble();
                     Ejercicio3.validRadius(radio);

                     System.out.println("el area es de "+Ejercicio3.calculateCircleArea(radio));
                     System.out.println("el perimetro es"+Ejercicio3.calculateCirclePerimeter(radio));
                     break;
                 case "d":
                     System.out.println("ingrese los dolares:");
                     double dolares = scanner.nextDouble();
                     System.out.println("ingresa los euros:");
                     double euros = scanner.nextDouble();
                     System.out.println(ejercicio4.dolar2euro(dolares));
                     System.out.println(ejercicio4.euro2dolar(euros));
                     break;
                 case "e":
                     Ejercicio5.tablaDeMultiplicar();
                     break;
                 case "f":
                        ejercicio6.tablasMultiplicar();
                     break;
                 case "g":
                     System.out.println("introduce un numero:");
                     int numero = scanner.nextInt();
                esPrimo(numero);
                     break;
                 case "h":
                     break;
                 case "i":
                     break;
                 case "j":
                     System.out.println("salio del programa:");
                     break;
                 default:
                     System.out.println("valor incorrecto");

             }

        }while(opcion.equals("j"));
            }
        }

