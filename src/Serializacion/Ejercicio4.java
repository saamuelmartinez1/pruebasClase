package tema4.Serializacion;

 import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Ejercicio4{
    public static void main(String[] args) {
        Persona p = new Persona("jose luis", 39);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.dat"))) {
            oos.writeObject(p);
            System.out.println("Persona serializada en persona.dat");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

