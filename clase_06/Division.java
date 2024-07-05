package clase_06;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int number1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int number2 = scanner.nextInt();

        try {
            double result = number1 / number2;
            System.out.println("Dividir " + number1 + " entre " + number2 + " da como resultado: " + result);
            scanner.close();
        } catch (ArithmeticException e) {
            System.out.println("Error: no es posible dividir entre 0");
        }
        scanner.close();
    }
}
