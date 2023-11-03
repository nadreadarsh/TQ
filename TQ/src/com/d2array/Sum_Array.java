package com.d2array;

/*5.	WAP to find sum of each row and column of a matrix.*/
public class Sum_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 8, 7, 6 } };

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum = arr[i][j] + sum;
			}
			System.out.println(sum);
		}

	}

}
