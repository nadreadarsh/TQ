package com.d2array;

/*3.	WAP to print maximum in row wise in 2D array. Means e.g. 
 * arr[][] = 		{{22, 31, 9}, {12, 25, 16}} output is: 31 and 25.*/
public class Maximum_Row_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 22, 31, 9 }, { 12, 25, 16 } };

		for (int i = 0; i < arr.length; i++) {
			{
				int large = 0;
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j] > large) {
						large = arr[i][j];
					}

				}
				System.out.println(large);

			}
		}

	}

}
