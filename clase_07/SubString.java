package clase_07;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String textString = myScanner.nextLine();

        System.out.println("Ingrese el indice inicial: ");
        int index1 = myScanner.nextInt();
        System.out.println("Ingrese el indice final: ");
        int index2 = myScanner.nextInt();

        String newTextString = textString.substring(index1, index2 + 1);

        System.out.println("la nueva frase es: \n" + newTextString);
        myScanner.close();

    }
}
