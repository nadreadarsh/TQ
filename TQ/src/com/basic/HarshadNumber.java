package com.basic;

public class HarshadNumber { 
	

	public static boolean main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int number = 0;
	    while (number > 0) {
	      sum += number % 10;
	      number /= 10;
	    }
	    return number % sum == 0;
	}
}