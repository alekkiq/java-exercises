package module_8_3;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class CollectionOperations {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(List.of(10, 5, 8, 20, 15, 3, 12));

        System.out.println("Original: " + l);

        l.removeIf(n -> n % 2 == 0);

        System.out.println("Even nums filtered: " + l);

        l.replaceAll(n -> n * 2);

        System.out.println("Odd nums doubled: " + l);

        int[] sum = {0};
        l.forEach(n -> sum[0] += n);

        System.out.println("Sum: " + sum[0]);
    }
}
