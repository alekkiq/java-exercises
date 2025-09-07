package DataStreams;

import java.io.*;

public class FibonacciCSV {
    public static void main(String[] args) {
        String filename = "fibonacci.csv";
        File f = new File(filename);

        int n = 60;

        try (BufferedWriter w = new BufferedWriter(new FileWriter(filename))) {
            long a = 0, b = 1;

            for (int i = 0; i <= n; i++) {
                w.write(Long.toString(a));
                w.newLine();
                long next = a + b;
                a = b;
                b = next;
            }

            System.out.println("Fibonacci sequence from 0 to " + n + " written to " + filename);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
