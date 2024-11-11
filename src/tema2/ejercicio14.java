package tema2;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precioFinal;
        System.out.println("La tarifa estándar es de 15 €/noche");
        System.out.println(" pero si son más de 5 personas y se quedan al menos una semana el precio se reduce un 25%.");

        System.out.println("ingrese el numero de personas");
        int people = scanner.nextInt();
        System.out.println("ingrese el numero de dias:");
        int days = scanner.nextInt();

if (days> 7 && people >5){
     precioFinal = (15 * days)*0.85;
}else{
    precioFinal = 15 * days;
}
        System.out.println("el precio de la estancia es de:"+precioFinal);

    }
}
