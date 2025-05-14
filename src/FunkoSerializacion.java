package tema4.funkos;

import java.io.*;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class FunkoSerializacion implements Serializable {
    @Serial
    private static final long serialVersionUID = 100L;

    private String cod;
    private String name;
    private String modelo;
    private double precio;
    private Date fecha;

    public FunkoSerializacion(String cod, String name, String modelo, double precio, String fecha) {
        this.cod = cod;
        this.name = name;
        this.modelo = modelo;
        this.precio = precio;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            this.fecha = dateFormat.parse(fecha);
        } catch (ParseException e) {
            throw new RuntimeException("Formato de fecha incorrecto. Usa yyyy-MM-dd");
        }
    }

    @Override
    public String toString() {
        return """
                Cod: %s
                Nom: %s
                Modelo: %s
                Precio: %.2f
                Fecha: %s
                ----------------------------------------------------------------
                """.formatted(cod, name, modelo, precio, new SimpleDateFormat("yyyy-MM-dd").format(fecha));
    }

    // Getters
    public String getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public Date getFecha() {
        return fecha;
    }

    // MAIN
    public static void main(String[] args) {
        Path fichero = Path.of("funkos.obj"); // ← usa .obj para objetos serializados

        // Lista de funkos a guardar
        List<FunkoSerializacion> lista = new ArrayList<>();

        // Añadir funko desde consola
        addFunko(lista);

        // Guardar lista serializada
        saveFunkos(fichero, lista);

        // Leer funkos del fichero
        readFunkos(fichero);
    }

    // Guardar una lista de funkos en fichero
    public static void saveFunkos(Path fichero, List<FunkoSerializacion> funkos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero.toFile()))) {
            oos.writeObject(funkos);
            System.out.println("Funkos guardados correctamente.");
        } catch (IOException e) {
            System.out.println(" Error al guardar funkos.");
            e.printStackTrace();
        }
    }

    // Leer lista de funkos del fichero
    public static void readFunkos(Path fichero) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero.toFile()))) {
            Object obj = ois.readObject();

            if (obj instanceof List<?> lista) {
                for (Object o : lista) {
                    if (o instanceof FunkoSerializacion funko) {
                        System.out.println(funko);
                    }
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(" Error al leer funkos.");
            e.printStackTrace();
        }
    }

    // Añadir funko por consola
    public static void addFunko(List<FunkoSerializacion> funkos) {
        Scanner in = new Scanner(System.in);
        System.out.print("Código: ");
        String cod = in.nextLine();
        System.out.print("Nombre: ");
        String nom = in.nextLine();
        System.out.print("Modelo: ");
        String mod = in.nextLine();
        System.out.print("Precio: ");
        double precio = in.nextDouble();
        in.nextLine(); // limpiar buffer
        System.out.print("Fecha (YYYY-MM-DD): ");
        String fecha = in.nextLine();

        funkos.add(new FunkoSerializacion(cod, nom, mod, precio, fecha));
    }
}
