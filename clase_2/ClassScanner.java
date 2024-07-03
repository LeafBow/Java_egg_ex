import java.util.Scanner;

public class ClassScanner {

    public static void main(String[] args) {
        Scanner $Scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String name = $Scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        short age = $Scanner.nextShort();
        System.out.println("Bienvenido \nSu nombre es: " + name + "\nY su edad es: " + age + " años");
        $Scanner.close();

    }
}