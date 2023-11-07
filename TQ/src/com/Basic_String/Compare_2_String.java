package com.Basic_String;

/*Compare string using == when we create without new see same reference is there*/
public class Compare_2_String {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String s2 = new String(" Bhakti");
		String s1 = " Adarsh";
		String s3 = " Bhakti";
		String s5 = "Adarsh";
		String s4 = new String(" Adarsh");

		String n = "Adar";
		String h = "Adar";
		System.out.println(n.compareTo(h));
		System.out.println(n.compareToIgnoreCase(h));
		System.out.println("--------------");

		if (s2 == s1) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}
		if (s2 == s3) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}
		if (s1 == s5) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}
		System.out.println("----------------");
		// System.arraycopy
		// new array tochar aaray(S1 &s2) give to length for loop
		//

		char ch[] = s1.toCharArray();
		System.out.println(s1.toCharArray());
		System.out.println(s1.toCharArray().length);
	}

}
