package clase_07;

import java.util.Scanner;

public class StringIndexOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ingresar una palabra
        System.out.println("Ingrese un palabra: ");
        String word = scanner.nextLine();
        // Encontrar un caracter en la palbra usando el metodo indexOf
        System.out.println("Ingrese un caracter:  ");
        String character = scanner.nextLine();
        // Buscar el caracter en el string
        // word.indexOf(character);
        // Si no existe el caracter el resultado dara -1
        if ((word.indexOf(character)) != -1) {
            System.out.println("El caracter ha sido encontrado");
        } else {
            System.out.println("El caracter no existe en el String");
        }
        scanner.close();
    }

}
