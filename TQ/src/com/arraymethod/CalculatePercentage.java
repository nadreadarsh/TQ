package com.arraymethod;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatePercentage {
	static int marks[];
	static double percentage;

	Scanner scanner = new Scanner(System.in);

	public static  String getGrade(double percentage2) {
		 int totalMarks = 0;
	        for (int mark : marks) {
	            totalMarks += mark;
	        }
	
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
	}
	public static void displayMarks() {
		String grade = getGrade(percentage);

		double totalMarks=0;
		double percentage = ((double) totalMarks / (marks.length * 100)) * 100;

		System.out.println("Marks: " + Arrays.toString(marks));
		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Percentage: " + percentage + "%");
		System.out.println("Grade: " + grade);

	}

	public static void main(String[] args) {

		int[] marks = { 85, 92, 78, 65, 90 };
		displayMarks();
		getGrade(percentage);

	}
}
