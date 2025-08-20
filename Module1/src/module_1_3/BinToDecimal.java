package module_1_3;

import java.util.Scanner;

public class BinToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an unsigned binary value");
        String binValue = scanner.nextLine();

        int sum = 0;
        int power = 0;

        for (int i = binValue.length() - 1; i >= 0; i--) {
            int intVal = binValue.charAt(i) - '0';
            // alternative way of converting to int:
            // int intVal = Character.getNumericValue(binValue.charAt(i));
            sum += intVal * (int) Math.pow(2, power);
            power++;
        }

        System.out.println("Decimal value is: " + sum);
    }
}
