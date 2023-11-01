package com.arraymethod;

import java.util.Arrays;

public class SmallElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {15,12,453,44,5};
		int small = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(small>arr[i]) {
				small=arr[i];
			}
		}
		int min_2=small;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<small) {
				min_2=arr[i];
			}
		}
		System.out.println(small);
	
	}

}
