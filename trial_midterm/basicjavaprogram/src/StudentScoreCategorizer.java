import java.util.Scanner;

public class StudentScoreCategorizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Accept three scores from the user
        System.out.print("Enter the first score (0-100): ");
        int score1 = scanner.nextInt();

        System.out.print("Enter the second score (0-100): ");
        int score2 = scanner.nextInt();

        System.out.print("Enter the third score (0-100): ");
        int score3 = scanner.nextInt();

        // Process: Calculate the average score
        double average = (score1 + score2 + score3) / 3.0;

        // Determine the performance category
        String performance;
        if (average > 85) {
            performance = "Excellent";
        } else if (average > 70) {
            performance = "Good";
        } else if (average > 50) {
            performance = "Average";
        } else {
            performance = "Poor";
        }

        // Output: Display the calculated average and performance category
        System.out.printf("Average Score: %.2f\n", average);
        System.out.println("Performance Category: " + performance);

        scanner.close();
    }
}