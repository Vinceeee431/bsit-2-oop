
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Student Information
        System.out.print("Enter Student ID: ");
        String studentId = input.nextLine();

        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Course: ");
        String course = input.nextLine();

        System.out.print("Enter Section: ");
        String section = input.nextLine();

        // Display Student Info
        System.out.println("\nSTUDENT INFORMATION");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);

        // Scores
        System.out.print("\nEnter Midterm Exam Score (out of 100): ");
        int midtermScore = input.nextInt();

        System.out.print("Enter Final Exam Score (out of 100): ");
        int finalScore = input.nextInt();

        System.out.print("Enter Project Score (out of 100): ");
        int projectScore = input.nextInt();

        System.out.print("Enter Attendance Percentage (out of 100): ");
        int attendanceScore = input.nextInt();

        int totalScore = midtermScore + finalScore + projectScore + attendanceScore;
        double averageScore = totalScore / 4.0;

        String remarks;
        if (averageScore < 75) {
            remarks = "FAILED";
        } else {
            remarks = "PASSED";
        }

        // Display Scores
        System.out.println("\nSTUDENT SCORE");
        System.out.println("Midterm Exam Score: " + midtermScore);
        System.out.println("Final Exam Score: " + finalScore);
        System.out.println("Project Score: " + projectScore);
        System.out.println("Attendance Score: " + attendanceScore);
        System.out.println("\nAverage Score: " + averageScore);
        System.out.println("Remarks: " + remarks);
    }
}
