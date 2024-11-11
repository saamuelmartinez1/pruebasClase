package actividadesBucles;

import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce el numero A");
        int a = scanner.nextInt();
        System.out.println("introduce el numero B");
        int b = scanner.nextInt();


          if(b>a){
              System.out.println("B es mayor que A se mostraran los numeros impares entre b y a");
              for (int i = a; i <= b; i++) {
                  if(i%2!=0){
                      System.out.println(i);
                  }
              }
          }else{
              System.out.println("B no es mayor a A");
          }
        }
    }

