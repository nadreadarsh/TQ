package com.LogicalProgram;

public class SumOfPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum;
//		int primeNumber = 0;
//		boolean isprime = true;
//		for (int i = 2; i <= 20 / 2; i++) {
//			if (primeNumber % i == 0) {
//				isprime = false;
//				break;
//
//			}
//		}
//		if (isprime) {
//			System.out.println(primeNumber + "It is prime number");
//		} else {
//			System.out.println(primeNumber + "It is not a prime number");
//		}
		int num;
		int sum=0;
		for(int i=0;i<20;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i % j==0) {
					count++;
					break;
				}
				
			}
			if(count==0) {
				sum=sum+i;
				System.out.println(sum);
//				System.out.println(i+" ");
			}
			
		}

	}

}
