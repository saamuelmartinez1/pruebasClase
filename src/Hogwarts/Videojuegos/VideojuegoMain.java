package tema4.Videojuegos;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class VideojuegoMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Videojuego> videojuegos = new ArrayList<>();
        int opcion;

        do {
            System.out.println("1. Añadir videojuego (físico o digital).\n" +
                    "2. Mostrar ranking completo.\n" +
                    "3. Eliminar videojuego por título.\n" +
                    "4. Guardar ranking en fichero binario.\n" +
                    "5. Cargar ranking desde fichero.\n" +
                    "6. Exportar ranking a texto.");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    anyadirVideojuego(scanner, videojuegos);
                    break;
                case 2:
                    MostrarRanking(videojuegos);
                    break;
                case 3:
                    eliminarVideojuegoPorNombre(scanner, videojuegos);
                    break;
                case 4:
                    serializar(videojuegos);
                    break;
                case 5:
                    videojuegos = cargarBinario(videojuegos);
                    break;
                case 6:
                    exportarTexto(videojuegos);
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
    }

    public static void anyadirVideojuego(Scanner scanner, List<Videojuego> videojuegos) {
        System.out.println("Título:");
        String titulo = scanner.nextLine();

        System.out.println("Plataforma:");
        String plataforma = scanner.nextLine();

        System.out.println("Nota (1-10):");
        int nota = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.println("Tipo: 1) Físico  2) Digital");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (tipo == 1) {
            System.out.println("Tienda:");
            String tienda = scanner.nextLine();
            System.out.println("Estado: 1) NUEVO  2) USADO");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            VideojuegoFisico.Estado estado = null;
            if (opcion == 1) {
                estado = VideojuegoFisico.Estado.NUEVO;
            } else if (opcion == 2) {
                estado = VideojuegoFisico.Estado.USADO;

            } else {
                System.out.println("la opcion introducida no es valida");
            }

            VideojuegoFisico videojuegoFisico = new VideojuegoFisico(titulo, plataforma, nota, tienda, estado);
            videojuegos.add(videojuegoFisico);

        } else if (tipo == 2) {
            System.out.println("Tienda Online:");
            String tiendaOnline = scanner.nextLine();

            System.out.println("Tamaño en GB:");
            double tamanio = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer

            VideojuegoDigital videojuegoDigital = new VideojuegoDigital(titulo, plataforma, nota, tiendaOnline, tamanio);
            videojuegos.add(videojuegoDigital);

        } else {
            System.out.println("Tipo inválido.");
            return;
        }


    }

    public static void MostrarRanking(List<Videojuego> videojuegos) {
        System.out.println("se mostrara el ranking ordenado por nota:");
        System.out.println("ranking:");
        Collections.sort(videojuegos, (a, b) -> b.getNota() - a.getNota());

        for (Videojuego v : videojuegos) {
            System.out.println(v);
        }

    }

    public static void eliminarVideojuegoPorNombre(Scanner scanner, List<Videojuego> videojuegos) {
        System.out.println("Introduce el título del videojuego que quieres eliminar:");
        String nombreEliminar = scanner.nextLine();
        boolean eliminado = false;

        for (int i = 0; i < videojuegos.size(); i++) {
            if (videojuegos.get(i).getTitulo().equalsIgnoreCase(nombreEliminar)) {
                System.out.println("Este videojuego será eliminado:");
                System.out.println(videojuegos.get(i));
                videojuegos.remove(i);
                eliminado = true;
                break;
            }
        }

        if (!eliminado) {
            System.out.println("El videojuego no existe.");
        }
    }

    public static void serializar(List<Videojuego> videojuegos) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("listaVideojuegos.dat"));
            oos.writeObject(videojuegos);
            System.out.println("Archivo guardado con exito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Videojuego> cargarBinario(List<Videojuego> videojuegos) {
        videojuegos.clear();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("listaVideojuegos.dat"));
            videojuegos = (ArrayList<Videojuego>) ois.readObject();
            for(Videojuego v: videojuegos){
                System.out.println(v);
            }
            System.out.println("Juegos cargados correctamente");
            return videojuegos;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


    public static void exportarTexto(List<Videojuego> videojuegos) {
        try {
            FileWriter escritor = new FileWriter("listaVideojuegos.txt", true); // true = agregar sin borrar
            escritor.write(videojuegos.toString());
            escritor.close();
            System.out.println("Texto añadido correctamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error.");
            e.printStackTrace();
        }

    }


}







