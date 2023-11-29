package com.Basic_String;

/*Write a Java program to count  of a character in given string.*/
public class Occurrence_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = new String("Occurrence");
		char arr[] = str1.toCharArray();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if ('r' == arr[i]) {
				count++;

			}
			
		}
		System.out.println(count);

	}

}
