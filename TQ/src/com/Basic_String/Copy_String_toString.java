package com.Basic_String;
/*Write a Java program to copy one string to another string*/
public class Copy_String_toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Adarsh";
		String s1 = "Abhishek";
		char ch1[]=s1.toCharArray();
		System.out.println(s1.length());
		System.out.println(s1);
		
		System.out.println(s.length());
		System.out.println(s);
		char ch[]=s.toCharArray();
		System.out.println("Abhishek to Adarsh: "+s1.copyValueOf(ch));
		System.out.println("Adarsh to Abhishek: "+s.copyValueOf(ch1));

	}

}
