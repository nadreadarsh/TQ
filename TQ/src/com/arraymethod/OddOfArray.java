package com.arraymethod;

import java.util.Scanner;
//print all sum of odd numbers
public class OddOfArray {

	public static int[] createArray() {
		int num[];
		System.out.println("Enter the size of array=>");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		num = new int[size];

		for (int i = 0; i < num.length; i++) {
			System.out.println("please enter elements =>");
			num[i] = sc.nextInt();

		}
		return num;
	}

	public static void EvenNumber(int num1[]) {
		int sum = 0;
		for (int i = 0; i < num1.length; i++) {
			if (num1[i] % 2 != 0) {
				sum = sum + num1[i];

			}
		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[];
		n = createArray();
		EvenNumber(n);

	}

}