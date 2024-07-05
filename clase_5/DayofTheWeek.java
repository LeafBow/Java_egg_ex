
package clase_5;

import java.util.Scanner;

public class DayofTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar numero
        System.out.print("Ingrese un numero (1-7): ");
        int number = scanner.nextInt();
        String day = "";
        // mostrar en pantalla numero correspondiente al dia
        switch (number) {
            case 1:
                day = "Lunes";
                break;
            case 2:
                day = "Martes";
                break;
            case 3:
                day = "Miercoles";
                break;
            case 4:
                day = "Jueves";
                break;
            case 5:
                day = "Viernes";
                break;
            case 6:
                day = "Sabado";
                break;
            case 7:
                day = "Domingo";
                break;

            default:
                System.out.println("Numero no valido");
                scanner.close();
                return;
        }

        System.out.println("Hoy es " + day);
        scanner.close();
    }

}
