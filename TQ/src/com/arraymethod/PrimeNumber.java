package com.arraymethod;
import java.util.Scanner;
public class PrimeNumber {
	public static void showElements(int num[]) {
		System.out.println("Array Elements are as:");
		for(int e:num)
			System.out.println(e+" ");
		
	}
	public static int[] createArray() {
		int num[];
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		num = new int[size];
		
		for(int i=0;i<num.length;i++) {
			System.out.println("Please enter in element");
			num[i]=sc.nextInt();
		}
		return num;
		
	}
	public static void primeNumber(int num[]) {
		System.out.println("Prime number of the array");
		for(int i=0;i<num.length;i++) {
			int count=0;
			for(int j=2;j<num[i];j++) {
				if(num[i] % j==0) {
					count++;
					break;
				}
				
			}
			if(count==0) {
				System.out.println(num[i]+" ");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		showElements(arr);
		int n[];
		n = createArray();
		primeNumber(n);
		
		

	}

}
