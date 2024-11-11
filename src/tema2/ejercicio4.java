import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca el primer numero:");
        double num1 = scanner.nextDouble();
        System.out.println("introduzca el segundo numero:");
        double num2 = scanner.nextDouble();
        System.out.println("introduzca el tercer numero:");
        double num3 = scanner.nextDouble();

        if(num1>num2 && num1> num3) {
            System.out.println("el numero mayor es el "+num1);

        } else if(num2>num1 && num2>num3){
            System.out.println("el numero mayor es el "+num2);

        }else{
            System.out.println("el numero mayor es el "+num3);

        }
    }
    }
