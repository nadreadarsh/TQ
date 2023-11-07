package com.Basic_String;
/*Write a Java program to trim leading white space characters in a string.*/
public class Trim_Leading {
//To find how many space present in starting;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("      Occurrence r");
		System.out.println(str);
		System.out.println(str.stripLeading());
		System.out.println("---------------------");
		int j=0;
		
		str.trim();
		while(j<str.length() && str.charAt(j)==32) {//32=asky value
			j++;
		}
		System.out.println(j);
		str=str.substring(j,str.length());
		System.out.println(str);

	}

}
