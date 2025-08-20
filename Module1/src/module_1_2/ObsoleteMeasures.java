package module_1_2;

import java.util.Scanner;

public class ObsoleteMeasures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double G_PER_LUOTI = 13.28;
        final int LUOTI_PER_NAULA = 32;
        final int NAULA_PER_LEIVISKA = 20;

        System.out.println("Enter a weight (g)");
        int weight = Integer.parseInt(scanner.nextLine());

        double luotiTotal = weight / G_PER_LUOTI;
        int naulaTotal = (int) luotiTotal / LUOTI_PER_NAULA;
        int leiviskaTotal = naulaTotal / NAULA_PER_LEIVISKA;

        double luotiRemainder = luotiTotal - (naulaTotal * LUOTI_PER_NAULA);
        double roundedLuotiRemainder = Math.round(luotiRemainder * 100.0) / 100.0;

        System.out.println(weight + " grams is " + leiviskaTotal + " leiviskä, " + naulaTotal + " naula, and " + roundedLuotiRemainder + " luoti.");
    }
}
