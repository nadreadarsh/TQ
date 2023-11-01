package com.arraymethod;

import java.util.Scanner;
//array demo code
public class arrayDemo {

	public static void showElement(int num[]) {
		System.out.println("Array elements are...");
		for (int e : num)
			System.out.println(e + " ");

	}

	public static int[] createArray() {
		int num[];
		System.out.println("Enter the size of array=>");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		num = new int[size];

		for (int i = 0; i < num.length; i--) {
			System.out.println("please enter element=>");
			num[i] = sc.nextInt();
		}
		return num;

	}

	public static void reverseArray(int num[]) {
		Scanner sc = new Scanner(System.in);
		for (int i = num.length-1; i <=0; i--) {
			System.out.println("please enter element=>");
			num[i] = sc.nextInt();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 4, 5, 6, 7, 8, 9 };
		showElement(arr);
		int n[] = createArray();
		showElement(n);
		reverseArray(n);
	}

}
