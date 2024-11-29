package ActividadesModulares;

public class Ejercicio9 {
    public static void main(String[] args) {
        printTriangle('a', 5);

        }
    public static void printTriangle(char character, int lines) {
        for (int i = 1; i <= lines; i++) {
            int numChars = 2 * i - 1;
            int spaces = lines - i;

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < numChars; j++) {
                System.out.print(character);
            }

            System.out.println();
        }
        }
    }


