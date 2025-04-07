package tema4.Serializacion;


    import java.io.*;

public class Ejercicio3 {        public static void main(String[] args) {
            int contadorPalabras = 0;

            try (BufferedReader br = new BufferedReader(new FileReader("texto.txt"))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] palabras = linea.trim().split("\\s+");
                    contadorPalabras += palabras.length;
                }
                System.out.println("Número total de palabras: " + contadorPalabras);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


