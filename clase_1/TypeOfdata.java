import java.time.LocalDate;

public class TypeOfdata {

    public static void main(String[] args) {
        float temperature = 12.5f;
        float price = 12.5f;
        String fullName = "Miguel Angel Bazan de la \"O\"";
        LocalDate dateOfbirth = LocalDate.of(1998, 9, 11);
        int numberOfHabitants = 13543100;
        short minutesOfMovie = 125;
        boolean itemAvailable = false;
        float distance = 125.4f;
        String cellphoneNumber = "+51948119306";
        short stock = 200;
        System.out.println("la temperatura actual es: " + temperature + "°C");
        System.out.println("Product price: " + price);
        System.out.println("Full name: " + fullName);
        System.out.println("Date of birth " + dateOfbirth);
        System.out.println("Number of habitants " + numberOfHabitants);
        System.out.println("Movie duration in minutes: " + minutesOfMovie);
        System.out.println("Is the item available? " + itemAvailable);
        System.out.println("distant of 2 cities: " + distance);
        System.out.println("Cellphone number: " + cellphoneNumber);
        System.out.println(" Stock:  " + stock);

    }
}