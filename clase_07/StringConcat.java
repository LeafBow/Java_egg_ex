package clase_07;

import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite su nombre");
        String name = scanner.nextLine();
        System.out.println("Digite su apellido");
        String lastName = scanner.nextLine();

        String fullNameString = name.concat(lastName);
        System.out.println("Tu nombre completo es: " + fullNameString);
        scanner.close();

    }
}
