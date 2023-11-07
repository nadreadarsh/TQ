package com.Basic_String;
/*Write a Java program to count total number of words in a string.*/
public class Count_Number_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Abhishek is a naugty and dirty boy";
		char ch[] =str.toCharArray();
		
//		int j=0;
//		str.trim();
//		while(j<str.length()&&str.charAt(j)==32) {
//			j++;
//		}
//		System.out.println(j);
//		str=str.substring(j,str.length());
//		System.out.println(str);
//		System.out.println("--------");
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				count++;
				
			}
		}
		System.out.println(count);
		

	}

}
