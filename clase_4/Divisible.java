import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int number = scanner.nextInt();
        if (number % 5 == 0 && number % 3 == 0) {
            System.err.println("El numero es divisible por 3 y 5");
        } else if (number % 5 == 0) {
            System.err.println("El numero es divisible por 5");
        } else if (number % 3 == 0) {

            System.err.println("El numero es divisible por 3");
        } else {

            System.err.println("El numero no es divisible por 3 o 5");
        }
        scanner.close();
    }
}
