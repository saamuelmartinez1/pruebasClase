package tema4.funkos;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainFunkos {

    public static final String RUTA_CSV = "C:\\Users\\info\\OneDrive\\Escritorio\\banco\\funkos\\funkos(2).csv";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funko> listaFunkos = new ArrayList<>();
        int opcion = 0;

        // ✅ Cargar funkos
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA_CSV))) {
            String linea;
            br.readLine(); // Saltar cabecera

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");

                String codigo = partes[0];
                String nombre = partes[1];
                String modelo = partes[2];
                double precio = Double.parseDouble(partes[3]);
                // ✅ Extraer solo el año del campo fecha (formato: yyyy-mm-dd)
                int fecha = Integer.parseInt(partes[4].substring(0, 4));

                Funko funko = new Funko(codigo, nombre, modelo, precio, fecha);
                listaFunkos.add(funko);
            }

        } catch (IOException e) {
            System.out.println("Error al cargar funkos: " + e.getMessage());
        }

        do {
            System.out.println("\n========== MENÚ FUNKO ==========");
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
            scanner.nextLine();

            switch (opcion) {
                case 1: anyadirFunko(listaFunkos); break;
                case 2: borrarFunko(listaFunkos); break;
                case 3: mostrarTodos(listaFunkos); break;
                case 4: mostrarMasCaro(listaFunkos); break;
                case 5: mostrarMediaPrecio(listaFunkos); break;
                case 6: mostrarPorModelo(listaFunkos); break;
                case 7: mostrarDe2023(listaFunkos); break;
                case 8: System.out.println("Saliste del programa."); break;
                default: System.out.println("Opción no válida.");
            }
        } while (opcion != 8);
    }

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
        guardarListaEnCSV(listaFunkos);

        System.out.println("Funko añadido correctamente.");
    }

    public static void borrarFunko(ArrayList<Funko> listaFunkos) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el código del funko a borrar: ");
        String codigo = scanner.nextLine();

        boolean eliminado = listaFunkos.removeIf(f -> f.getCodigo().equalsIgnoreCase(codigo));

        if (eliminado) {
            guardarListaEnCSV(listaFunkos);
            System.out.println("Funko eliminado.");
        } else {
            System.out.println("Funko no encontrado.");
        }
    }

    public static void mostrarTodos(ArrayList<Funko> listaFunkos) {
        for (Funko f : listaFunkos) {
            System.out.println(f.getCodigo() + " - " + f.getNombre() + " - " + f.getModelo() +
                    " - $" + f.getPrecio() + " - " + f.getFecha());
        }
    }

    public static void mostrarMasCaro(ArrayList<Funko> listaFunkos) {
        Funko max = listaFunkos.stream()
                .max((f1, f2) -> Double.compare(f1.getPrecio(), f2.getPrecio()))
                .orElse(null);

        if (max != null) {
            System.out.println("Funko más caro: " + max.getNombre() + " ($" + max.getPrecio() + ")");
        } else {
            System.out.println("No hay funkos.");
        }
    }

    public static void mostrarMediaPrecio(ArrayList<Funko> listaFunkos) {
        double media = listaFunkos.stream()
                .mapToDouble(Funko::getPrecio)
                .average()
                .orElse(0.0);

        System.out.printf("Precio medio: %.2f €%n", media);
    }

    public static void mostrarPorModelo(ArrayList<Funko> listaFunkos) {
        listaFunkos.stream()
                .collect(Collectors.groupingBy(Funko::getModelo))
                .forEach((modelo, funkos) -> {
                    System.out.println("Modelo: " + modelo);
                    funkos.forEach(f -> System.out.println(" - " + f.getNombre() + " ($" + f.getPrecio() + ")"));
                });
    }

    public static void mostrarDe2023(ArrayList<Funko> listaFunkos) {
        listaFunkos.stream()
                .filter(f -> f.getFecha() == 2023)
                .forEach(f -> System.out.println(f.getNombre() + " - " + f.getModelo()));
    }

    public static void guardarListaEnCSV(ArrayList<Funko> listaFunkos) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(RUTA_CSV))) {
            pw.println("codigo,nombre,modelo,precio,fecha");
            for (Funko f : listaFunkos) {
                // Guardamos solo el año como fecha
                pw.println(f.getCodigo() + "," + f.getNombre() + "," + f.getModelo() + "," +
                        f.getPrecio() + "," + f.getFecha());
            }
        } catch (IOException e) {
            System.out.println("Error al guardar cambios en CSV.");
        }
    }
}
