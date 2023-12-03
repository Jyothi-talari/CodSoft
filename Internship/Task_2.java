package Internship;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int num_Subj = sc.nextInt();
       //Sum of the each subject marks
        int Total_Marks = 0;
        for (int i = 1; i <= num_Subj; i++) {
            System.out.println("Enter marks obtained in subject " + i + " (out of 100):");
            int marks = sc.nextInt();
            Total_Marks = Total_Marks+ marks;
        }
        // Average Percentage of marks
        double averagePercentage = (double) Total_Marks / num_Subj;

        System.out.println("Total Marks: " + Total_Marks);
        System.out.println("Average Percentage: " + averagePercentage + "%");

        // Grades calculation based on average percentage
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        sc.close();
    }
}
