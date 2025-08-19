package module_1_2;

import java.util.Scanner;

public class ObsoleteMeasures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double LUOTI = 13.28;
        final double NAULA = LUOTI * 32;
        final double LEIVISKA = NAULA * 20;

        System.out.println("Enter a weight (g)");
        int weight = Integer.parseInt(scanner.nextLine());


    }
}
