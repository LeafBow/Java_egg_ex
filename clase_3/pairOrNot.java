import java.util.Scanner;

public class pairOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar num
        System.out.print("Ingrese un numero: ");
        int number = scanner.nextInt();
        // Definir numbero par
        System.out.println("El numero es " + ((number % 2 == 0) ? "par" : "impar"));
        scanner.close();
    }
}
