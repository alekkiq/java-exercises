package module_1_4;

import java.util.Scanner;

public class SubArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the integers into the array:");

        for (int i = 0; i < size; i++) {
            System.out.println("Enter integer " + (i + 1) + ":");
            arr[i] = scanner.nextInt();
        }

        // start with as minimal value to make only negative arrays work
        int largestSum = Integer.MIN_VALUE;
        int currentSum;

        // keep track on the largest sum producing start/end indexes
        int startIdx = 0;
        int endIdx = 0;

        for (int i = 0; i < size; i++) {
            currentSum = 0;
            for (int j = i; j < size; j++) {
                currentSum += arr[j];

                if (currentSum > largestSum) {
                    largestSum = currentSum;
                    startIdx = i;
                    endIdx = j;
                }
            }
        }

        System.out.println("\nMaximum sum: " + largestSum);
        System.out.println("Integers: " + (startIdx+1) + "-" + (endIdx+1));
    }
}
