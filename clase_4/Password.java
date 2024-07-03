import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userPassword = "asd1234";
        System.out.print("Ingrese la contraseña: ");
        String password = scanner.nextLine();

        if (userPassword.equals(password)) {
            System.out.print("Acceso Concedido");
        } else {
            System.out.print("Acceso Denegado");
        }
        scanner.close();
    }
}
