package com.arraymethod;

import java.util.Scanner;

public class AvgArray {
	public static int[] createArray() {
		int num[];
		System.out.println("Enter size of Array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		num = new int[size];

		for (int i = 0; i < num.length; i++) {
			int sum = 0;
			sum = sum + num[i];
			System.out.println("Please Enter the number=>");
			num[i] = sc.nextInt();
		}
		return num;

	}
	public static void lessAvg() {
		int arr[] = { 1, 2, 3, 4, 5 };
		int avg=1;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
		}
		avg=sum+arr.length;
		System.out.println("Avg is: "+avg);
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<avg) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void SumArray(int num[]) {
		System.out.println("sum of array");
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println(sum);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5 };
		int n[] = createArray();
		SumArray(n);
		lessAvg();

	}

}
