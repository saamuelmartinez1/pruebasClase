package actividadesBucles;

import java.util.Scanner;

public class ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aprobados = 0;
        int suspendidos =0;
        double nota =0;
        System.out.println("cuantos alumnos va a introducir?");
        int alumnos = scanner.nextInt();

        for (int i = 1; i <= alumnos  ; i++) {
            System.out.println("introduzca la nota del alumno "+i);
             nota = scanner.nextDouble();
            if (nota >= 5) {
                aprobados ++;
            }else {
                suspendidos ++;
            }
        }

        System.out.println("los aprobados son: "+aprobados);
        System.out.println("los suspendidos son: "+suspendidos);
    }
}
