package Synchronization;

import java.util.ArrayList;

class SafeList {
    private ArrayList<String> list;

    public SafeList() {
        this.list = new ArrayList<>();
    }

    public synchronized void add(String item) {
        // System.out.println("Adding " + item + " by " + Thread.currentThread().getName());
        this.list.add(item);
    }

    public synchronized void remove(int index) {
        // System.out.println("Removing Item at " + index + " by " + Thread.currentThread().getName());
        this.list.remove(index);
    }

    public synchronized int size() {
        return this.list.size();
    }
}

public class ThreadSafeList {
    public static void main(String[] args) {
        SafeList safeList = new SafeList();

        int threadsCount = 8;
        int itemsPerThread = 100;

        Thread[] threads = new Thread[threadsCount];

        // create and start threads
        for (int i = 0; i < threadsCount; i++) {
            Thread t = new Thread(() -> {
                for (int j = 0; j < itemsPerThread; j++) {
                    safeList.add("Item " + j);
                }
                if (safeList.size() > 0) {
                    safeList.remove(0);
                }
            });

            threads[i] = t;
            t.start();
        }

        // wait for threads to finish
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Final list size: " + safeList.size());
    }
}
