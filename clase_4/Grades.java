import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        // Crear el scaner
        Scanner scanner = new Scanner(System.in);
        // Solicitar numero entre 0 y 100
        System.out.print("Ingrese la calificación (0-100): ");
        int number = scanner.nextInt();
        char grade = ' ';
        if (number >= 90 && number <= 100) {
            grade = 'A';
        } else if (number >= 80 && number <= 89) {
            grade = 'B';
        } else if (number >= 70 && number <= 79) {
            grade = 'C';
        } else if (number >= 60 && number <= 69) {
            grade = 'D';
        } else if (number > 60 && number <= 0) {
            grade = 'F';
        } else {
            System.out.println("El número ingresado está fuera del rango válido");
            scanner.close();
            return;
        }
        System.out.println("La nota es: " + grade);
        scanner.close();
    }

}
