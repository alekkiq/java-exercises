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

        int idx = 0;
        for (int item : arr) {
            boolean isDuplicate = false;

            for (int j = 0; j < idx; j++) {
                if (cleanedArr[j] == item) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                cleanedArr[idx] = item;
                idx++;
            }
        }

        System.out.println("Duplicates cleaned array");
        for (int i = 0; i < idx; i++) {
            System.out.println(cleanedArr[i]);
        }
    }
}
