package com.Basic_String;
/*String create with new operator and without new*/
public class Demo_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Start";
		String s2=" Bike";
		String str = new String();
		//we attached with String together with the help of concat which is in java.lang package
		String s3 = s1.concat(s2);
		System.out.println(s3);
		//we attached with string together with the help of + operator
		String s4 = s1+s2;
		System.out.println(s4);

	}

}
