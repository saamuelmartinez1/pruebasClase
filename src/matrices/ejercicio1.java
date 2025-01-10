package matrices;

public class ejercicio1 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        showMenu();
       imprimirMatriz(matriz);






    }
    public static void showMenu(){
        System.out.println("a) Un procedimiento que imprima la matriz");
        System.out.println("b) Una función que devuelva el máximo de la matriz.");
        System.out.println("c) Una función que devuelva el mínimo de la matriz.");
        System.out.println("d) Una función que devuelva la media de la matriz.");
        System.out.println("e) Una función que te diga si un elemento existe en la matriz o no.");
        System.out.println("f) Una función que devuelva cuantas veces se repite un número en una matriz.");
        System.out.println("g) Una función que haga la suma de dos matrices.");
        System.out.println("h) Una función que haga la resta de dos matrices.");
        System.out.println("i) Una función que compruebe si una matriz es la matriz unidad, es\n" +
                "decir tiene el mismo número de filas y de columnas ytiene en su\n" +
                "diagonal principal 1s y el resto 0s.");

    }
    public static int[][] imprimirMatriz(int [][] matriz){
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
        return matriz;
    }

}
