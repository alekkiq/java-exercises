package module_1_3;

import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quadratic equation solver");

        System.out.println("Value of a:");
        double a = Integer.parseInt(scanner.nextLine());
        System.out.println("Value of b:");
        double b = Integer.parseInt(scanner.nextLine());
        System.out.println("Value of c:");
        double c = Integer.parseInt(scanner.nextLine());

        System.out.println(solveQuadratic(a, b, c));
    }

    public static String solveQuadratic(double a, double b, double c) {
        double discriminant = Math.pow(b, 2) - (4 * a * c);

        if (discriminant < 0) {
            return "No real roots.";
        }
        if (discriminant == 0) {
            double result = -b / (2 * a);
            return "One real root: " + result;
        }

        double plusResult = (-b + Math.sqrt(discriminant)) / (2 * a);
        double minusResult = (-b - Math.sqrt(discriminant)) / (2 * a);

        return "Two real roots: " + plusResult + ", " + minusResult;
    }
}
