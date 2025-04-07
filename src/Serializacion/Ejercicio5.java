package tema4.Serializacion;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ejercicio5{
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.dat"))) {
            Persona p = (Persona) ois.readObject();
            System.out.println("Persona leída: " + p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

