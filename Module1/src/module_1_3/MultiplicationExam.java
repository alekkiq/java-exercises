package module_1_3;

import java.util.Scanner;

public class MultiplicationExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean succeeded = false;

        while (!succeeded) {
            int pointsPerExam = 0;
            for (int i = 1; i <= 10; i++) {
                int x = (int) (Math.random() * 10) + 1;
                int y = (int) (Math.random() * 10) + 1;

                System.out.println("Question " + i + ": " + x + " * " + y);
                int answer = Integer.parseInt(scanner.nextLine());
                int correct = (x * y);

                if (answer == correct) {
                    System.out.println("Correct!\n");
                    pointsPerExam++;
                } else {
                    System.out.println("Wrong! The correct answer was: " + correct);
                    System.out.println("\nResit the exam.");
                }
            }

            if (pointsPerExam == 10) {
                succeeded = true;
                System.out.println("Good job! You aced the exam.");
                break;
            } else {
                System.out.println("You failed. Your score is " + pointsPerExam);
            }
        }
    }
}
