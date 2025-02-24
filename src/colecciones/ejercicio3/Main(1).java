package Tema5.Colecciones1.Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FuncionesCola banco = new FuncionesCola();
        Scanner in = new Scanner(System.in);
        int breakWhile = 0;
        while (breakWhile == 0) {
        showMenu();
        int option = in.nextInt();
        switch (option) {
            case 1:
                System.out.print("Ingrese nombre del usuario: ");
                String nombre = in.next();
                System.out.print("Ingrese edad del usuario: ");
                int edad = in.nextInt();
                System.out.print("Ingrese DNI del usuario: ");
                String dni = in.next();
                Usuario nuevoUsuario = new Usuario(nombre, edad, dni);
                banco.agregarUsuario(nuevoUsuario);
                break;
            case 2:
                banco.eliminarPrimero();
                break;
            case 3:
                System.out.print("Ingrese DNI del usuario a quitar de la cola: ");
                String DNI = in.next();
                banco.eliminarPorDNI(DNI);
                break;
            case 4:
                breakWhile++;
                break;
            default:
                System.out.println("Recuerda poner un numero entre 1 y 4");
                break;
        }
        }
    }
    public static void showMenu(){
        System.out.println("""
                1. Añadir a la cola
                2. Sacar de la cola
                3. Me he cansado
                4. Salir.
                """);
    }
}
