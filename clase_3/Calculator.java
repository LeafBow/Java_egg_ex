import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar dos numeros
        System.out.print("Ingrese un numero: ");
        double number1 = scanner.nextDouble();
        System.out.print("Ingrese otro numero: ");
        double number2 = scanner.nextDouble();
        // Declara almacenar operacion realizar
        System.out.println("Elige operacion a realizar: \n1.-Sumar\n2.-Resta\n3.-Multiplicacion\n4.-Division");

        // permitir elegir opcion
        char option = (scanner.next().charAt(0));

        double result = 0;

        switch (option) {
            case '1':
                result = number1 + number2;
                break;
            case '2':

                result = number1 - number2;
                break;
            case '3':

                result = number1 * number2;
                break;
            case '4':

                result = number1 / number2;
                break;
            default:
                System.err.println("La opcion no es valida");
                scanner.close();
                return;

        }

        // mostrar resultado
        System.out.print("El resultado de la operacion es: " + result);
        scanner.close();
    }
}
