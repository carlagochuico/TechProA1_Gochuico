import java.util.Scanner;

public class SeatworkThirteen {
    // Method 1: Grade based on percentage (e.g., 85%)
    public static String calculatedGrade(double percentage) {
        if (percentage >= 90) return "A";
        else if (percentage >= 80) return "B";
        else if (percentage >= 70) return "C";
        else if (percentage >= 60) return "D";
        else return "F";
    }

    // Method 2: Grade based on raw score (e.g., 45 out of 50)
    public static String calculatedGrade(int score, int maxScore) {
        double percentage = (double) score / maxScore * 100;
        return calculatedGrade(percentage); // reuse Method 1
    }

    // Method 3: Grade based on average of multiple subjects
    public static String calculatedGrade(double[] subjectScore) {
        double total = 0;
        for (double score : subjectScore) {
            total += score;
        }
        double average = total / subjectScore.length;
        return calculatedGrade(average); // reuse Method 1
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example 1: Grade by percentage
        System.out.print("Enter percentage score: ");
        double percent = scanner.nextDouble();
        System.out.println("Grade: " + calculatedGrade(percent));

        // Example 2: Grade by raw score
        System.out.print("\nEnter raw score: ");
        int score = scanner.nextInt();
        System.out.print("Enter maximum score: ");
        int max = scanner.nextInt();
        System.out.println("Grade: " + calculatedGrade(score, max));

        // Example 3: Grade by multiple subjects
        System.out.print("\nEnter number of subjects: ");
        int numSubjects = scanner.nextInt();
        double[] subjects = new double[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter score for subject " + (i + 1) + ": ");
            subjects[i] = scanner.nextDouble();
        }

        System.out.println("Final Grade: " + calculatedGrade(subjects));

        scanner.close();
    }
}
