package clase_06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NotNumber {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        try {

            System.out.println("Ingrese un numero");
            int number1 = myScanner.nextInt();

            System.out.println("Ingrese el segundo numero");
            int number2 = myScanner.nextInt();
            int substraction = number1 - number2;
            System.out.println("La resta de " + number1 + " menos " + number2 + " es " + substraction);

        } catch (InputMismatchException e) {

            System.out.println("No ingreso un numero valido");
        }
        myScanner.close();
    }
}
