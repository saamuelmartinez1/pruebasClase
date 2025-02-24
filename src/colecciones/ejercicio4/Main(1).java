package Tema5.Colecciones1.Ejercicio4;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> lista = new HashSet<>();
        Set<String> carrito = new HashSet<>();
        Set<String> productosOlvidados = new HashSet<>();


        int breakWhile = 0;
        while (breakWhile == 0) {
            System.out.println("Escribe el producto que quieras:");
            String producto = in.next().toLowerCase();

            if (lista.contains(producto)) {
                System.out.println("El producto ya esta en la lista");
            } else {
                lista.add(producto);
            }

            System.out.println("Quieres añadir otro producto? s/n");
            String confirmacion = in.next().toLowerCase();
            if (!Objects.equals(confirmacion, "s")) {
                System.out.println("La lista contiene: ");
                for (String n : lista) {
                    System.out.println(n);
                    productosOlvidados.add(n);
                }
                int break2 = 0;
                while (break2 == 0) {
                    System.out.println("Añade los productos que quieras al carrito(Escribe STOP para dejar de añadir al carrito)");
                    String productoCarrito = in.next().toLowerCase();
                    if (!productoCarrito.equals("stop")) {
                        if (lista.contains(productoCarrito)) {
                            carrito.add(productoCarrito);
                            productosOlvidados.remove(productoCarrito);
                        } else {
                            System.out.println("Este producto no esta en la lista");
                        }
                    } else {
                        System.out.println("El contenido del carrito es:");
                        for (String n : carrito) {
                            System.out.println(n);
                        }
                        System.out.println("Quieres ver los productos de la lista no añadidos al carrito? s/n");
                        String confirmacion2 = in.next().toLowerCase();
                        if (Objects.equals(confirmacion2, "s")) {
                            System.out.println("Los productos no añadidos son: ");
                            for (String n : productosOlvidados) {
                                System.out.println(n);
                            }
                        }
                        break2++;
                        breakWhile++;
                    }
                }

            }
        }
    }
}
