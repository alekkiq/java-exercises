package module_1_2;

import java.util.Scanner;

// Task 2
public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give first leg length");
        int firstSide =  Integer.parseInt(scanner.nextLine());
        System.out.println("Give second leg length");
        int secondSide = Integer.parseInt(scanner.nextLine());

        System.out.println(calculateHypotenuse(firstSide, secondSide));

        scanner.close();
    }

    public static float calculateHypotenuse(int leg1, int leg2) {
        int squaredResult = (int) (Math.pow(leg1, 2) + Math.pow(leg2, 2));
        return (float) Math.sqrt(squaredResult);
    }
}
