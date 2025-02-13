package tema4;

public class Persona {
    private static final int adultAge = 18;
    private static final int retiredAge = 65;
    private final String DNI;
    private String name;
    private String lastname;
    private int age;

    public Persona(String DNI, String name, String lastname, int age) {
        if (checkDNI(DNI)) {
            this.DNI = DNI;
        } else {
            this.DNI = "ERROR DNI";
        }
        this.name = name;
        this.lastname = lastname;
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getDNI() {
        return DNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void print() {
        System.out.println("Nombre: " + getName());
        System.out.println("Apellido: " + getLastname());
        System.out.println("Edad: " + getAge());
        System.out.println("DNI: " + getDNI());
    }

    public void isAdult() {
        if (getAge() >= adultAge) {
            System.out.println(getName() + " es MAYOR de edad");
        } else {
            System.out.println(getName() + " es MENOR de edad");
        }
    }

    public void isRetired() {
        if (getAge() >= retiredAge) {
            System.out.println(getName() + " esta jubilado");
        } else {
            System.out.println(getName() + " NO esta jubilado");
        }
    }

    public void ageDifference(Persona objeto) {
        if (objeto.getAge() > getAge()) {
            System.out.println("La diferencia de edad es de " + (objeto.getAge() - getAge()) + " años");
        } else {
            System.out.println("La diferencia de edad es de " + (getAge() - objeto.getAge()) + " años");
        }
    }

    public static boolean checkDNI(String DNI) {
        boolean result = false;
        if (DNI.length() == 9) {
            String[] DNIarray = DNI.split("");
            String CorrectLetter = checkLetterDNI(DNI);
            if (DNIarray[8].equals(CorrectLetter)) {
                result = true;
            }
        }
        return result;
    }

    private static String checkLetterDNI(String DNI) {
        String[] DNIarray = DNI.split("");
        String DNIarrayNum = DNIarray[0] + DNIarray[1] + DNIarray[2] + DNIarray[3] + DNIarray[4] + DNIarray[5] + DNIarray[6] + DNIarray[7];
        int DNInum = Integer.parseInt(DNIarrayNum);
        int DNIrest = DNInum % 23;
        return switch (DNIrest) {
            case 0 -> "T";
            case 1 -> "R";
            case 2 -> "W";
            case 3 -> "A";
            case 4 -> "G";
            case 5 -> "M";
            case 6 -> "Y";
            case 7 -> "F";
            case 8 -> "P";
            case 9 -> "D";
            case 10 -> "X";
            case 11 -> "B";
            case 12 -> "N";
            case 13 -> "J";
            case 14 -> "Z";
            case 15 -> "S";
            case 16 -> "Q";
            case 17 -> "V";
            case 18 -> "H";
            case 19 -> "L";
            case 20 -> "C";
            case 21 -> "K";
            case 22 -> "E";
            default -> throw new IllegalArgumentException("El DNI proporcionado no es válido");
        };
    }
}