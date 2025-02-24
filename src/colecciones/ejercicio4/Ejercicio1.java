package Tema5.Colecciones1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> lista = new HashSet<>();
        int breakWhile = 0;
        while (breakWhile == 0) {
            System.out.println("Escribe el producto que quieras:");
            String producto = in.next();

            if (lista.contains(producto)){
                System.out.println("El producto ya esta en la lista");
            }else {
                lista.add(producto);
            }

            System.out.println("Quieres añadir otro producto? s/n");
            String confirmacion = in.next();
            if (!Objects.equals(confirmacion, "s")){
                System.out.println("La lista contenia: ");
                for (String n : lista) {
                    System.out.println(n);
                }
                breakWhile++;
            }
        }
    }
}
