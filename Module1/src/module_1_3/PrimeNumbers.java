package module_1_3;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the start integer");
        int start = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the end integer");
        int end = Integer.parseInt(scanner.nextLine());

        System.out.println("Prime numbers in " + start + "-" + end);

        boolean notPrime;
        for (int i = start; i <= end; i++) {
            if (i < 2) continue;

            notPrime = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    notPrime = true;
                    break;
                }
            }
            if (!notPrime) System.out.println(i);
        }
    }
}
