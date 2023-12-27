package com.LogicalProgram;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 15, 12, 45, 44, 5 };
		int large = arr[0];
//		for (int i = 0; i > arr.length; i++) {
//			if (large > arr[i]) {
//				large = arr[i];
//			}
//		}
		
		int max = large;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}

}
