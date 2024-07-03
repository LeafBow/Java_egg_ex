import java.util.Scanner;

public class EjercicioComparacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int number_1 = scanner.nextInt();
        System.out.print("Ingrese otro número entero: ");
        int number_2 = scanner.nextInt();
        System.out.println("El número " + number_1 + " es mayor a " + number_2 + "? = " + (number_1 > number_2));
        System.out.println("El número " + number_1 + " es igual a " + number_2 + "? = " + (number_1 == number_2));
        System.out.println("El primer numero es divisible entre 2? = " + ((number_1 % 2) == 0));
        System.out.print("Ingrese un tercer número entero: ");
        int number_3 = scanner.nextInt();
        System.out.print("Ingrese un cuarto número entero: ");
        int number_4 = scanner.nextInt();
        System.out.println(
                number_1 + " es mayor que " + number_2 + " y " + number_3 + " es mayor que " + number_4 + " ? = "
                        + ((number_1 > number_2) && (number_3 > number_4)));
        System.out.println(
                number_1 + " es mayor que " + number_2 + " o " + number_3 + " es mayor que " + number_4 + " ? = "
                        + ((number_1 > number_2) || (number_3 > number_4)));

        scanner.close();
    }

}
