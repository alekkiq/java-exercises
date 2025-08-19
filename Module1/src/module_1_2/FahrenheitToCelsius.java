package module_1_2;
import java.util.Scanner;

// Task 1
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a temperature in Fahrenheit");
        int temperature = Integer.parseInt(scanner.nextLine());

        System.out.println("Temperature in Celsius: " + formula(temperature));
    }

    public static float formula(int temperature) {
        return (float)(temperature - 32) * 5 / 9;
    }
}
