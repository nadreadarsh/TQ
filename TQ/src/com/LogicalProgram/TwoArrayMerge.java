package com.LogicalProgram;

import java.util.Arrays;

public class TwoArrayMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 11, 22, 33 };
		int i = 0;
		int arr3[] = new int[arr1.length + arr2.length];
		for (i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		int k=i;
		for(int j=0;j<arr2.length;j++,k++) {
			arr3[k]=arr2[j];
		}
		System.out.println(Arrays.toString(arr3));
	}

}
