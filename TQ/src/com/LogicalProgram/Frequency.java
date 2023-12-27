package com.LogicalProgram;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Peter Pen";
		char ch[] = str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			boolean visited=false;
			int cnt=1;
			for(int j=i-1;j>=0;j--) {
				if(str.charAt(i)==str.charAt(j)) {
					visited=true;
					break;
				}
							}
//			System.out.println(str.charAt(i));
			if(visited==false) {
				for(int k=i+1;k<str.length();k++) {
					if(str.charAt(i)==str.charAt(k)) {
						cnt++;
					}
				}
				System.out.println(str.charAt(i));
				System.out.println("--->"+cnt);
			}
			System.out.println();
		}
		

	}

}
