package tema2;

import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce la opcion que quieras");
        int opcion = scanner.nextInt();

        switch (opcion){

            case 0 ->{
                System.out.println("introduce un lado del cuadrado:");
                double lado = scanner.nextInt();
                double superficie = lado * lado;
                double perimetro = lado *4;
                System.out.println("el area es:"+superficie);
                System.out.println("el perimetro:"+perimetro);

            }
            case 1 ->{
                System.out.println("introduce la base de un rectangulo:");
                double base = scanner.nextDouble();
                System.out.println("introduce la altura de un rectangulo:");
                double altura = scanner.nextDouble();
                double area = base * altura;
                double perimetroRectangulo = altura*2 + base*2;
                System.out.println("el area es "+area+"el perimetro es "+perimetroRectangulo);
            }

            case 2 ->{
                System.out.println("introduce la altura del triangulo:");
                double alturaTriangulo = scanner.nextDouble();
                System.out.println("introduce la base del triangulo:");
                double baseTriangulo = scanner.nextDouble();
                double areaTriangulo = baseTriangulo * alturaTriangulo /2;
                double perimetroTriangulo = baseTriangulo * areaTriangulo *2;
                System.out.println("el area es "+areaTriangulo+"el perimetro es "+perimetroTriangulo);

            }

            default ->{
                System.out.println("opcion no valida");
            }
        }
    }
}
