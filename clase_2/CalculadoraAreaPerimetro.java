import java.util.Scanner;

public class CalculadoraAreaPerimetro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de la base: ");
        int baseRectangulo = scanner.nextInt();
        System.out.print("Ingrese el valor de la altura: ");
        int alturaRectangulo = scanner.nextInt();

        int perimetroRectangulo = ((2 * baseRectangulo) + (2 * alturaRectangulo));
        int areaRectangulo = (baseRectangulo * alturaRectangulo);

        System.out.println("El perimetro del rectangulo es: " + perimetroRectangulo);
        System.out.println("El area del rectangulo es: " + areaRectangulo);

        scanner.close();
    }
}
