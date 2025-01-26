import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Parejas {
    public static void main(String[] args) {
        String[] animales = {"León", "Mandril", "Suricata", "Facóquero", "Elefante",
                "Jirafa", "Cebra", "Tigre", "Hipopótamo", "Cocodrilo"};

        ArrayList<String> listaParejas = new ArrayList<>();
        for (String animal : animales) {
            listaParejas.add(animal);
            listaParejas.add(animal);
        }
        Collections.shuffle(listaParejas);

        String[] tablero = listaParejas.toArray(new String[0]);

        boolean[] visibles = new boolean[20];

        Scanner scanner = new Scanner(System.in);
        int paresEncontrados = 0;

        while (paresEncontrados < 10) {
            mostrarTablero(tablero, visibles);

            System.out.println("Selecciona la primera posición (1-20): ");
            int pos1 = scanner.nextInt() - 1;
            System.out.println("Selecciona la segunda posición (1-20): ");
            int pos2 = scanner.nextInt() - 1;

            if (pos1 < 0 || pos1 >= 20 || pos2 < 0 || pos2 >= 20 || pos1 == pos2 || visibles[pos1] || visibles[pos2]) {
                System.out.println("Posiciones inválidas. Intenta de nuevo.");
                continue;
            }

            System.out.println("Has seleccionado:");
            System.out.println("Posición " + (pos1 + 1) + ": " + tablero[pos1]);
            System.out.println("Posición " + (pos2 + 1) + ": " + tablero[pos2]);

            if (tablero[pos1].equals(tablero[pos2])) {
                System.out.println("¡Es un par! Estas posiciones quedan visibles.");
                visibles[pos1] = true;
                visibles[pos2] = true;
                paresEncontrados++;
            } else {
                System.out.println("No es una pareja. Intenta de nuevo.");
            }

            System.out.println("Presiona Enter para continuar...");
            scanner.nextLine();
            scanner.nextLine();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }

        System.out.println("¡Felicidades! Has encontrado todas las parejas.");
        mostrarTablero(tablero, visibles);
        scanner.close();
    }

    public static void mostrarTablero(String[] tablero, boolean[] visibles) {
        System.out.println("Tablero:");
        for (int i = 0; i < tablero.length; i++) {
            if (visibles[i]) {
                System.out.print("[" + tablero[i] + "] ");
            } else {
                System.out.print("[*] ");
            }
        }
        System.out.println();
    }
}
