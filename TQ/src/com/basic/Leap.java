package com.Leap;

public class Leap {

	public static void main(String[] args) {
		
			   int year=1800;
			if(year%4==0 && year%100!=0 || year%400==0)
		{
			System.out.println("Leap Year");
		}
			else {
				System.out.println("Not Leap year");
			}
			

	}

}
