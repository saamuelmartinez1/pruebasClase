package tema4.funkos;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MainFunkos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funko> listaFunkos = new ArrayList<>();
        int opcion = 0;

        // ✅ 1. Cargar funkos al inicio
        try (BufferedReader br = new BufferedReader(new FileReader("funkos.csv"))) {
            String linea;
            br.readLine(); // Saltamos la cabecera

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");

                String codigo = partes[0];
                String nombre = partes[1];
                String modelo = partes[2];
                double precio = Double.parseDouble(partes[3]);
                int fecha = Integer.parseInt(partes[4]);

                Funko funko = new Funko(codigo, nombre, modelo, precio, fecha);
                listaFunkos.add(funko);
            }

        } catch (IOException e) {
            System.out.println("Error al cargar funkos: " + e.getMessage());
        }

        // ✅ 2. Menú
        do {
            System.out.println("========== MENÚ FUNKO ==========");
            System.out.println("1. Añadir funko");
            System.out.println("2. Borrar funko");
            System.out.println("3. Mostrar todos los funkos");
            System.out.println("4. Mostrar el funko más caro");
            System.out.println("5. Mostrar la media de precio de los funkos");
            System.out.println("6. Mostrar los funkos agrupados por modelos");
            System.out.println("7. Mostrar los funkos del año 2023");
            System.out.println("8. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar salto de línea

            switch (opcion) {
                case 1:
                    anyadirFunko(listaFunkos);
                    break;
                case 8:
                    System.out.println("Saliste del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 8);
    }

    // ✅ 3. Añadir funko y guardarlo bien en el fichero CSV
    public static void anyadirFunko(ArrayList<Funko> listaFunkos) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el código del funko: ");
        String codigo = scanner.nextLine();

        System.out.print("Ingrese el nombre del funko: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el modelo del funko: ");
        String modelo = scanner.nextLine();

        System.out.print("Ingrese el precio del funko: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese el año del funko: ");
        int fecha = scanner.nextInt();

        Funko nuevo = new Funko(codigo, nombre, modelo, precio, fecha);
        listaFunkos.add(nuevo);

        // ✅ Escribir el funko al final del fichero
        try (PrintWriter pw = new PrintWriter(new FileWriter("funkos.csv", true))) {
            // Solo escribir la cabecera si el archivo no existe
            File archivo = new File("funkos.csv");
            if (archivo.length() == 0) {
                pw.println("codigo,nombre,modelo,precio,fecha");
            }

            pw.println(codigo + "," + nombre + "," + modelo + "," + precio + "," + fecha);
            System.out.println("Funko añadido correctamente al fichero.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero.");
            e.printStackTrace();
        }
    }

}

