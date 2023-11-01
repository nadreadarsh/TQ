package com.arraymethod;

/*7.	WAP to insert an element in a specific position into an array.*/
import java.util.Scanner;

public class SpecificElement {
	public static void showElement(int num[]) {
//inserting element without increasing array size
		Scanner sc = new Scanner(System.in);
		System.out.println("Show the elements");
		for (int e : num)
		System.out.println(e + " ");

	}
	public static void addElement() {
		int arr[]= {1,2,3,4,5};
		int poo =2;
		int val=10;
		arr[poo-1]=val;
		System.out.println(arr);
		
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oriarr[] = { 1, 2, 3, 4, 5 };
		int newarr[] = { 1, 11, 3, 4, 5 };
		
	}

}
