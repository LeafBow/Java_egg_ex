package clase_5;

import java.util.Scanner;

/**
 * Geometry
 */
public class Geometry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la opcion:\nOpción 1: Circulo\nOpción 2: Cuadrado\nOpción 3: Triangulo");
        int number = scanner.nextInt();
        double area = 0;
        String option = switch (number) {
            case 1 -> "Circulo";
            case 2 -> "Cuadrado";
            case 3 -> "Triangulo";

            default -> "No valido";
        };
        switch (number) {
            case 1 -> {
                System.out.print("Ingrese el valor del radio: ");
                double radio = scanner.nextDouble();
                area = (3.14 * radio * radio);
                break;
            }
            case 2 -> {
                System.out.print("Ingrese el valor del lado: ");
                double lado = scanner.nextDouble();
                area = (lado * lado);
                break;
            }
            case 3 -> {
                System.out.print("Ingrese el valor de la base: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese el valor de la altura: ");
                double altura = scanner.nextDouble();
                area = ((base * altura / 2));
                break;
            }

            default -> {
                scanner.close();
                return;
            }
        }
        System.out.println("El area del " + option + " es " + area);
        scanner.close();
    }
}