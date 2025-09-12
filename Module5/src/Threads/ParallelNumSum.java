package Threads;

import java.util.Random;

class SumThread extends Thread {
    private int[] nums;
    private int start;
    private int end;
    private int core;
    private long partSum;

    public SumThread(int[] nums, int start, int end, int core) {
        this.nums = nums;
        this.start = start;
        this.end = end;
        this.core = core;
        this.partSum = 0;
    }

    @Override
    public void run() {
        System.out.printf("[%s] Start: %d, End: %d%n",
            Thread.currentThread().getName(),
            start, end);
        for (int i = start; i < end; i++) {
            partSum += nums[i];
        }
    }

    public long getPartSum() {
        return this.partSum;
    }

    public int getCore() {
        return this.core;
    }
}

public class ParallelNumSum {
    public static void main(String[] args) {
        final int N = 100_000;
        int[] numbers = new int[N];

        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            numbers[i] = rand.nextInt(100); // draw random value 0-99
        }

        int cores = Runtime.getRuntime().availableProcessors();
        int chunkSize = (N / cores) + 1;
        SumThread[] threads = new SumThread[cores];

        for (int i = 0; i < cores; i++) {
            int start = i * chunkSize;
            int end = (i == cores - 1) ? N : start + chunkSize;
            threads[i] = new SumThread(numbers, start, end, (i + 1));
            threads[i].start();
        }

        long sum = 0;
        for (SumThread t : threads) {
            try {
                t.join();
                sum += t.getPartSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Total sum: " + sum);
    }
}
