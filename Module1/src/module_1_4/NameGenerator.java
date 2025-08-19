package module_1_4;

import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        String[] firstNames = {"Matti", "Pekka", "Jorma", "Petteri", "Aleksi"};
        String[] lastNames = {"Lahtinen", "Korhonen", "Uotila", "Mikkola", "Laasio"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many names to generate?");

        int namesToGenerate = scanner.nextInt();
        String[] names = new String[namesToGenerate];

        for (int i = 0; i <= names.length - 1; i++) {
            String firstName = firstNames[(int)(Math.random() * 5)];
            String lastName = lastNames[(int)(Math.random() * 5)];
            names[i] = firstName + " " + lastName;

            System.out.println(names[i]);
        }
    }
}
