package com.arraymethod;

import java.util.Arrays;

public class Test_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6 };// 6 5 4 1 2 3
        int j=arr.length/2;
		for (int i = 0; i < arr.length/2; i++) {
			 {
				int temp;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;

			}
			//System.out.print(arr[i]+"\t");
		}
		System.out.println(Arrays.toString(arr));
	}

}
