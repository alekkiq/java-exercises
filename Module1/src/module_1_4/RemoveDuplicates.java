package module_1_4;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many values to enter?");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Insert numbers");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] cleanedArr = new int[size];

        for (int item : arr) {
            System.out.println(item);
        }
    }
}
