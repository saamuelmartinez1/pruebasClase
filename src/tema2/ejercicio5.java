package tema2;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mediaDecimal;
        int mediaExacta;
        System.out.println("introduce el primer numero");
        double num1 = scanner.nextDouble();

        System.out.println("introduce el segundo numero");
        double num2 = scanner.nextDouble();

        System.out.println("introduce el tercer numero");
        double num3 = scanner.nextDouble();

        mediaDecimal = num2+num1+num3/3;
        mediaExacta =(int) Math.round(mediaDecimal);
        System.out.println("la media de los tres numeros sin decimales es: "+mediaExacta);
        System.out.println("la media de los tres numeros con decimales es: "+mediaDecimal);



    }
}
