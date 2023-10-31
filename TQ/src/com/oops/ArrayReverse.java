package com.oops;

public class ArrayReverse {
	public void reverse() {
		int arr[] = { 1, 2, 3, 4, 5 };
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(i);
			System.out.println("-----------");
//		int i = 0;
//		while (i > arr.length) {
//			i++;
//		}
//		System.out.println(arr[i]);
//		System.out.println("--------------");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayReverse obj = new ArrayReverse();
		obj.reverse();

	}

}
