package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Mosca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablero = new int[15];
        int jugador =0;
        Random random = new Random();
        showPrints();
        int Mosca = random.nextInt(tablero.length);

        do {
            System.out.println("ingresa una posicion:");
             jugador = scanner.nextInt();
             if(jugador>=0 && jugador <=15 ){
                 if(Mosca == jugador){
                     System.out.println("genial has ganado");

                 } else if ( (jugador != Mosca -1 && jugador != Mosca +1 ) ) {
                     System.out.println("la mosca no esta en una posicion adiacente, se queda donde esta");
                 } else if (jugador == Mosca -1 || jugador == Mosca +1 ) {
                     System.out.println("la mosca se espanto, se movera a otra posicion aleatoria");
                     Mosca = random.nextInt(tablero.length);
                 }else{
                     System.out.println("el valor introducido es erroneo, vuelve a probar");
                 }
             }else{
                 System.out.println("valor incorrecto, vuelva a intentarlo");
             }


        } while (jugador != Mosca);

    }

    public static void showPrints() {
        System.out.println("que comience el juego de la mosca:");
        System.out.println("elige una posicion del tablero del 1 al 15, si aciertas ganaras,");
        System.out.println("si eliges una posicion adiacente a la de la mosca, se movera aleatoriamente");
        System.out.println("si no es ninguno de los casos anteriores se quedara donde esta:");

    }
}
