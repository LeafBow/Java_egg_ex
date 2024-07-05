package clase_5;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar calificacion
        System.out.println("Ingrese una nota: ");
        int number = scanner.nextInt();
        // mostrar calificacion en letras
        switch (number) {
            case 1 -> System.out.println("Muy deficiente");
            case 2 -> System.out.println("Deficiente");
            case 3 -> System.out.println("Suficiente");
            case 4 -> System.out.println("Notable");
            case 5 -> System.out.println("Sobresaliente");

            default -> {
                System.out.println("No es valido");
                scanner.close();
                return;
            }
        }
        scanner.close();
    }

}
