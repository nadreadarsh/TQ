package com.arraymethod;

import java.util.ArrayList;
import java.util.Arrays;

/*WAP to merge 2 arrays to 3rd array. 3rd array should not have elements of same value.*/
public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[] = { 1, 2, 3 };
//		int n2[] = { 4, 5, 6 };
//
//		for (int i = 0; i < a.length - 1; i++) {
//			for (int j = 0; j < a.length - 1; j++) {
//				if (a[i] > a[j + 1]) {
//					int temp = a[i];
//					a[i] = a[j + 1];
//					a[j + 1] = temp;
//
//				}
//
//			}
//			System.out.println(Arrays.asList(n2));
//
//		}
		  int a[] = { 1, 2, 3 };
	        int n2[] = { 4, 5, 6 };
	        int arr[] = new int[a.length + n2.length];
	        for (int i = 0; i < a.length; i++) {

	            arr[i] = a[i];

	        }
	        // System.out.println(Arrays.toString(arr));
	        int j = 0;
	        for (int i = a.length; i < arr.length; i++) {

	            arr[i] = n2[j];
	            j++;

	        }
	        System.out.println(Arrays.toString(arr));


	}

}
