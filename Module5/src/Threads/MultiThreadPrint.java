package Threads;

import java.util.Scanner;

public class MultiThreadPrint extends Thread {
    private boolean isEven;
    private int start;
    private int end;

    public MultiThreadPrint(boolean isEven, int start, int end) {
        this.isEven = isEven;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = this.start; i <= this.end; i++) {
            if (this.isEven && i % 2 == 0) {
                System.out.println("Even: " + i);
            } else if (!this.isEven && i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Range start:");
        int start = s.nextInt();

        System.out.println("Range end:");
        int end = s.nextInt();

        if (start >= end) {
            System.out.println("Invalid range");
            return;
        }

        new MultiThreadPrint(true, start, end).start();
        new MultiThreadPrint(false, start, end).start();
    }
}
