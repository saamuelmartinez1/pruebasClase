package modular2;

public class MyMath {

    public static double squarePerimeter(double side) {
        return 4 * side;
    }

    public static double squareArea(double side) {
        return side * side;
    }

    public static double rectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    public static double circlePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNotPrime(int number) {
        return !isPrime(number);
    }

    public static int numberOfDigits(int number) {
        number = Math.abs(number);
        return String.valueOf(number).length();
    }

    public static int countEvenDigits(int number) {
        int count = 0;
        number = Math.abs(number);
        while (number > 0) {
            if ((number % 10) % 2 == 0) {
                count++;
            }
            number /= 10;
        }
        return count;
    }

    public static int countOddDigits(int number) {
        int count = 0;
        number = Math.abs(number);
        while (number > 0) {
            if ((number % 10) % 2 != 0) {
                count++;
            }
            number /= 10;
        }
        return count;
    }

    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos");
        }
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static long factorialRecursive(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos");
        }
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * factorialRecursive(number - 1);
    }

    public static int quadraticSolutions(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            return 2;
        } else if (discriminant == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int sumDigits(int number) {
        int sum = 0;
        number = Math.abs(number);
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
