package tema4;

public class PersonaMain {
    public static void main(String[] args) {
        Persona persona1 = new Persona("20911538Y", "samuel","martinez", 21);
        Persona persona2 = new Persona("201834573Y", "samuel","martinez",54);
        persona1.print();
        persona1.isAdult();
        persona1.isRetired();
        persona2.ageDifference(persona1);
    }
}