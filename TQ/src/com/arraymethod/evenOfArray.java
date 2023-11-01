package com.arraymethod;

import java.util.Scanner;
//print sum of all even numbers
public class evenOfArray {
//	public static void showElements(int num[]) {
//		System.out.println("Array Elemenst are");
//		for (int e : num)
//			System.out.println(e + " ");
//
//	}

	public static int[] createArray() {
		int num[];
		System.out.println("Enter the size of array=>");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		num = new int[size];

		for (int i = 0; i < num.length; i++) {
			System.out.println("please enter elements =>");
			num[i] = sc.nextInt();

//			int sum = 0;
//			sum = sum + num[i];
			
		}
		return num;
	}

	public static void EvenNumber(int num1[]) {
		int sum=0;
		for(int i=0; i<num1.length;i++) {
			if(num1[i]%2==0) {
				sum=sum+num1[i];
				
			}
		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = { 1, 2, 3, 4, 5 };
//		showElements(arr);
		int n[];
		n=createArray();
		EvenNumber(n);
		//showElements(n);
		
		
		

	}
}