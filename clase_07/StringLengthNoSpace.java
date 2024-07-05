package clase_07;

import java.util.Scanner;

public class StringLengthNoSpace {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto: ");
        String text = myScanner.nextLine();
        String text2 = text.replace(" ", "");

        System.out.println("La longitud de la cadena sin espacios es: " + text2.length());
        myScanner.close();

    }

}
