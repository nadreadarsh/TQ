package com.Basic_String;
/*Write a Java program to find first occurrence of a character in a given string*/
//use index of for first occurrence
//
public class Occurence_of_Char {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//USing method indexof
		String str = new String("Occurrence");
		str.charAt(5);
		System.out.println(str.indexOf('r'));
		
		
		
//		using logic 
		String str1 = new String("Occurrence");
		char arr[]=str1.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if('r'==arr[i]) {
				System.out.println(i);
				break;
			}
			
		}
		

	}

}
