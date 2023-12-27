package com.LogicalProgram;

import java.util.Scanner;

public class Findcnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {23,54,6,46,14};
		int max=arr[0];
		int maximum=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				maximum=arr[i];
			}
			else if(arr[i]<max && arr[i]>maximum) {
				maximum=arr[i];
			}
		}
		System.out.println(maximum);

	}

}
