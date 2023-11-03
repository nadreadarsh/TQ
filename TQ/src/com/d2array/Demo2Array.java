package com.d2array;

public class Demo2Array {
	public static void CreateArray() {
		int arr[][] = { { 10, 20, 30, 40 }, { 50 }, { 60, 70, 80 }, { 90, 100 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)

				System.out.print(arr[i][j] + " ");
			System.out.println();

		}
		System.out.println("Printing 3 row and 2 column");
		for(int i=3;i<arr.length;i++) {
			for(int j=1;j<arr[i].length;j++) 
				System.out.print(arr[i][j]+" ");
			System.out.println();
				
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateArray();

	}

}
