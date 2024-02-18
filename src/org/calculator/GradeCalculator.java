package org.calculator;
import java.util.*;

public class GradeCalculator {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the Simple Grade Calculator!");

	        // Input marks for each subject
	        System.out.print("Enter marks obtained (out of 100) in each subject, separated by spaces: ");
	        String[] subjectMarks = scanner.nextLine().split(" ");

	        int totalMarks = 0;
	        int numSubjects = subjectMarks.length;

	        // Calculate total marks
	        for (String mark : subjectMarks) {
	            totalMarks += Integer.parseInt(mark);
	        }

	        // Calculate average percentage
	        double averagePercentage = (double) totalMarks / numSubjects;

	        // Display total marks and average percentage
	        System.out.println("\nResults:");
	        System.out.println("Total Marks: " + totalMarks);
	        System.out.println("Average Percentage: " + averagePercentage + "%");

	        // Assign grades based on the average percentage
	        String grade = calculateGrade(averagePercentage);

	        // Display the corresponding grade
	        System.out.println("Grade: " + grade);
	    }

	    public static String calculateGrade(double averagePercentage) {
	        if (averagePercentage >= 90) {
	            return "A+";
	        } else if (averagePercentage >= 80) {
	            return "A";
	        } else if (averagePercentage >= 70) {
	            return "B";
	        } else if (averagePercentage >= 60) {
	            return "C";
	        } else if (averagePercentage >= 50) {
	            return "D";
	        } else {
	            return "F";
	        }
	    }
	}
