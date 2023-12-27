package com.Basic_String;
//equal method always overridden
//find length of an String and hashcode();
/*Compare string using new operator when new is present see different reference is there.*/
public class Length_of_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2 = new String(" Bhakti");
		String s1=" Adarsh";
		String s3 = " Abhishek";
		String s4= new String(" Sunish");
		String s6 = "Maroti";
		System.out.println(s6.length());
		System.out.println("---------------------------------------------");
		System.out.println(s1.hashCode());
		System.out.println((s2.hashCode()));
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println("-------------------");
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s4.length());
		
		System.out.println("-------------");
		
		String s5 = s1.concat(s2+s3+s4);
		System.out.println(s5);
		
		
	}

}
