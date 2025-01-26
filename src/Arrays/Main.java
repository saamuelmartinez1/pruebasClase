package Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] miArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("array completo:");
        imprimirArray(miArray);
        System.out.println("");
        System.out.println("mayor valor:");
        imprimirArray(arrayMax(miArray));
        System.out.println("");
        System.out.println("el valor minimo del array es:");
        imprimirArray(arraymin(miArray));
        System.out.println("");
        System.out.println("la media de valores del array es de:");
        imprimirArray(arrayMean(miArray));
        System.out.println("");
        if(arrayValueExist(miArray)){
            System.out.println("el valor ingresado existe");
        }else{
            System.out.println("valor no encontrado");
        }
        System.out.println("");
        System.out.println("la suma de vectores:");
        imprimirArray(sumaArray());
        System.out.println("");
        System.out.println("resta de vectores");
        imprimirArray(restaArray());
        System.out.println("");
        System.out.println("producto de arrays");
        imprimirArray(productoArrays());
        System.out.println("");
        System.out.println("invertir arrays:");
        imprimirArray(ordenArrays(miArray));



    }

    public static void imprimirArray(int[] miArray) {
        for (int i = 0; i < miArray.length; i++) {
            System.out.print(miArray[i] + " ");
        }
    }

    public static int[] arrayMax(int[] miArray) {
        int Mayor = miArray[0];
        for (int i = 1; i < miArray.length; i++) {

            if (miArray[i] > Mayor) {
                Mayor = miArray[i];
            }
        }
        return new int[]{Mayor};
    }

    public static int[] arraymin(int[] miArray) {
        int minimo = miArray[0];
        for (int i = 1; i < miArray.length; i++) {

            if (miArray[i] < minimo) {
                minimo = miArray[i];
            }
        }
        return new int[]{minimo};

    }

    public static int[] arrayMean(int[] miArray) {

        int arrayMean = miArray[0];
        for (int i = 1; i < miArray.length; i++) {
            arrayMean += miArray[i];
        }
        arrayMean = arrayMean/miArray.length;

        return new int[]{arrayMean};
    }

    public static boolean arrayValueExist(int[] miArray) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un valor para comprobar si el valor existe en el array:");
        int  value = scanner.nextInt();
        for (int i = 0; i < miArray.length; i++) {
            if (miArray[i] == value) {
                return true;

            }
        }
        return false;

    }
    public static int[] sumaArray(){
int [] vector1 ={1,2,3,4,5};
int [] vector2 ={1,2,3,4,5};

if(vector1.length != vector2.length){
    throw new IllegalArgumentException("suma no valida, no tienen el mismo tamaño");
}
int[] resultado = new int[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            resultado[i] =vector1[i] + vector2[i];
        }
        return resultado;
    }
    public static int [] restaArray (){
        int [] vector1 ={1,2,3,4,5};
        int [] vector2 ={1,2,3,4,5};
        if(vector1.length != vector2.length){
            throw new IllegalArgumentException("suma no valida, no tienen el mismo tamaño");
        }
        int[] resultado = new int[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            resultado[i] =vector1[i] - vector2[i];
        }
        return resultado;
    }
    public static int[] productoArrays(){
        int [] vector1 ={1,2,3,4,5};
        int [] vector2 ={1,2,3,4,5};
        if(vector1.length != vector2.length){
            throw new IllegalArgumentException("suma no valida, no tienen el mismo tamaño");
        }
        int[] resultado = new int[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            resultado[i] =vector1[i] * vector2[i];
        }
        return resultado;
    }
    public static int[] ordenArrays(int[] miArray){
        for (int i = 1; i < miArray.length; i++) {
if(i<5){
    miArray[i] = miArray[miArray.length -i];

}else{
    i=i+1;
    miArray[i] = miArray[miArray.length -i];

}
        }
        return miArray;
    }
}