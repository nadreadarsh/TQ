package com.d2array;

import java.util.Scanner;
import java.util.Arrays;

public class Demo_2D_Array {
//	public  void Array2D() {
//		int arr[][] = new int[3][3];
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//
//		arr[1][0] = 4;
//		arr[1][1] = 5;
//		arr[1][2] = 6;
//
//		arr[2][0] = 7;
//		arr[2][1] = 8;
//		arr[2][2] = 9;
//		printArray(arr);
//
//	}

	public  void createArray() {
		int arr[][];
		System.out.println("Enter the size row");
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		arr = new int[row][];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the of col");
			
			int col = sc.nextInt();
			 arr[i] = new int[col];
			
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.println("enter the element");
				int ele=sc.nextInt();
				arr[i][j]=ele;

			}
			
		}
		printArray(arr);

	}
	public  void printArray(int p[][]) {
		for(int i=0;i<p.length;i++) {
			for(int j=0;j<p[i].length;j++) {
				System.out.print(p[i][j]+"\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo_2D_Array obj = new Demo_2D_Array();
//		obj.Array2D();
		obj.createArray();
		

	}

}
