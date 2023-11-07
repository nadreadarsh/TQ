package com.Basic_String;

/*Write a Java program to find first occurrence of a word in a given string.*/
import java.util.Scanner;

public class First_Word_Occurrence_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sam is boy and he is good boy and he is good at coding";
		System.out.println("The Index of word is: " + str.length());
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Word: ");
		String word = sc.next();

		for (int i = 0; i < str.length(); i++) {
			String temp = "";
			int j;
			for (j = i; j < str.length() && str.charAt(j) != 32; j++) {
				temp = temp + str.charAt(j);
			}

			if (temp.equals("is")) {
				System.out.println("------------");
				System.out.println("The index of word is: " + (j - temp.length()));
//				break;
			}

		}

		sc.close();
	}

}
