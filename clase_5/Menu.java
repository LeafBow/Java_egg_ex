package clase_5;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la opcion:\nOpción 1: 'Guardar'\nOpción 2: 'Cargar'\nOpción 3: 'Salir'");
        int number = scanner.nextInt();

        String option = switch (number) {
            case 1 -> "Guardar";
            case 2 -> "Cargar";
            case 3 -> "Salir";

            default -> "No valido";
        };
        System.out.println(option);
        scanner.close();
    }
}