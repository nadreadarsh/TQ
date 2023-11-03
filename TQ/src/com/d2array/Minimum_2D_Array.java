package com.d2array;
/*4.	WAP to print minimum in columns. Means e.g. 
 * arr[][]={{22, 31, 9}, {12, 5,16}, {34, 42, 2}} output is: 12, 5, 2.*/
public class Minimum_2D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{22, 31, 9}, {12, 5,16}, {34, 42, 2}};
		
		for(int i=0;i<arr.length;i++) {
			int small=arr[0][0];
			for(int j=0;j<arr[i].length;j++) {
				if(small>arr[i][j]) {
					small=arr[i][j];
				}
			}
			System.out.println(small);
		}
		

	}

}
