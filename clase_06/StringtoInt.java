package clase_06;

import java.util.Scanner;

public class StringtoInt {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingrese un texto para convertir a numero");
        String numberString = myScanner.nextLine();
        try {

            int number = Integer.parseInt(numberString);
            System.out.println("Se convirtio el String del numero " + number + " a Int");

        } catch (NumberFormatException e) {

            System.out.println("El dato ingresado no se puede convertir a Int");
        }

        myScanner.close();
    }

}
