package module_1_4;

import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        String[] firstNames = {"Matti", "Pekka", "Jorma", "Petteri", "Aleksi"};
        String[] lastNames = {"Lahtinen", "Korhonen", "Uotila", "Mikkola", "Laasio"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many names to generate?");

        int namesToGenerate = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= namesToGenerate; i++) {
            String firstName = getRandomItem(firstNames);
            String lastName = getRandomItem(lastNames);

            System.out.println(firstName + " " + lastName);
        }
    }

    public static String getRandomItem(String[] arr) {
        if (arr.length == 0) return "";

        int idx = (int) (Math.random() * arr.length);

        return arr[idx];
    }
}
