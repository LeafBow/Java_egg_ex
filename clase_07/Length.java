package clase_07;

import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribar una palabra");
        String text = scanner.nextLine();
        System.out.println("La longitud del String " + text + " es: " + text.length());
        scanner.close();
    }

}
