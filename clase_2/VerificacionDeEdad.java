import java.time.*;
import java.util.Scanner;

public class VerificacionDeEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su fecha de año de nacimiento: ");
        int bornDate = scanner.nextInt();
        final int ANIOACTUAL = Integer.parseInt(String.valueOf((LocalDate.now().getYear())));
        int age = ANIOACTUAL - bornDate;
        String answer = (age >= 18) ? "La persona es mayor de edad." : "La persona es menor de edad";
        System.out.println(answer);
        scanner.close();
    }

}
