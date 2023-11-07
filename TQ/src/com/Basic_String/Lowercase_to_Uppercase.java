package com.Basic_String;

/*Write a Java program to convert lowercase string to uppercase*/
public class Lowercase_to_Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("AdArSh");
//		System.out.println("Lower case " + s);
//		System.out.println("Upper case " + s.toUpperCase());
//		String s1 = "BHAKTI";
//		System.out.println(s1);
//		System.out.println("Lower case " + s1.toLowerCase());
//		
//		System.out.println("/////////////");
		
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]>='A'&&c[i]<='Z') {
				c[i]=(char)(c[i]+32);
			}else if(c[i]>='a'&&c[i]<='z') {
				c[i]=(char)(c[i]-32);
			}
			
		}
		for(char x:c)
			System.out.print(x);
		
		
	}

}
