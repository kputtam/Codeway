import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the total number of subjects
        System.out.print("Enter! How Many Subjects Are There In Your Course: ");
        int numSubjects = scanner.nextInt();

        // Initialize arrays to store marks and pass/fail status
        int[] marks = new int[numSubjects];
        boolean[] isPass = new boolean[numSubjects];

        // Input marks for each subject and verify pass/fail
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter Marks of Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            isPass[i] = marks[i] >= 33;
        }

        // Calculate total marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Assign grades based on average percentage
        char grade;
        if (averagePercentage >= 80) {
            grade = 'A';
        } else if (averagePercentage >= 60) {
            grade = 'B';
        } else if (averagePercentage >= 40) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        // Display pass/fail status for each subject
        System.out.println("\nSubject-wise Pass/Fail:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Subject " + (i + 1) + ": " + (isPass[i] ? "Pass" : "Fail"));
        }

        scanner.close();
    }
}
