package ActividadesModulares;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        tablaDeMultiplicar();
    }
    public static void tablaDeMultiplicar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa un numero para poder decir su tabla de multiplicar");
        int numero = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println("la tabla de"+numero);
            System.out.println("es de " +numero+" por "+i+"que es:"+i*numero);
        }
    }
}
