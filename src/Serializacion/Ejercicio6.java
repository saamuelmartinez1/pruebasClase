package tema4.Serializacion;

 import java.io.*;
        import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas personas quieres guardar? ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();
            personas.add(new Persona(nombre, edad));
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personas.dat"))) {
            oos.writeObject(personas);
            System.out.println("Lista de personas guardada.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

