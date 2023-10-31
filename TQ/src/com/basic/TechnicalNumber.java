package com.basic;

import java.util.*;

public class TechnicalNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Read or initialize a number (num).
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();

		// Find the number of digits of the given number (num).
		int numDigits = String.valueOf(num).length();

		// If the number of digits is not even, the number (num) is not even.
		if (numDigits % 2 != 0) {
			System.out.println("The number is not a tech number.");
			
		}

		// Else, split the given number into two parts (num1 and num2), equally.
		int num1 = num / 2;
		int num2 = num - num1;

		// Sum up the numbers (num1+num2) and store the result in a variable.
		int sum = num1 + num2;

		// Find the square of the variable sum and store it in a variable square.
		int square = sum * sum;

		// Compare the num with the square of the sum if they are equal print Tech
		// Number, else print Not a Tech Number.
		if (num == square) {
			System.out.println("The number is a tech number.");
		} else {
			System.out.println("The number is not a tech number.");
		 scanner.close();
		}

	}

}
