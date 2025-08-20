package module_1_2;

import java.util.Scanner;

// Task 2
public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Leg A length");
        int legA =  Integer.parseInt(scanner.nextLine());

        System.out.println("Leg B length");
        int legB = Integer.parseInt(scanner.nextLine());

        System.out.println("Hypotenuse length is: " + calculateHypotenuse(legA, legB));
    }

    public static double calculateHypotenuse(int legA, int legB) {
        double squaredResult = Math.sqrt(
                (Math.pow(legA, 2) + Math.pow(legB, 2))
        );

        return Math.round(squaredResult * 100.0) / 100.0;
    }
}
