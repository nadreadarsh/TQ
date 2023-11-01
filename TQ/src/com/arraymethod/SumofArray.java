package com.arraymethod;

import java.util.Scanner;

//find sum of all elements of array
public class SumofArray {
	public static void showElement(int num[]) {
		System.out.println("Array elements are...");
		for (int e : num)
			System.out.println(e + " ");
	}

	public static int[] createArray() {

		int num[];
		System.out.println("please enter size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		num = new int[size];

		for (int i = 0; i < num.length; i++) {
			int sum = 0;
			sum = sum + num[i];
			System.out.println("please enter elements =>");
			num[i] = sc.nextInt();

		}
		return num;

	}

	public static void sumOfArray(int num[]) {
		System.out.println("Sum of the Array");
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];

		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 11, 12, 13, 14, 15 };
		showElement(arr);
		int n[] = createArray();
		sumOfArray(arr);
		showElement(n);

	}

}
