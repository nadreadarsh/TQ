package com.arraymethod;

import java.util.Arrays;

public class LargeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 15, 12, 453, 44, 5 };
		int large = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (large > arr[i]) {
				large = arr[i];
			}
		}
		int min_2 = large;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < large) {
				min_2 = arr[i];
			}
		}
		System.out.println(small);

	}

}
