package com.oops;

public class ArrayDemo1 {
	int arr[];

	public void arrayCreation() {
		// first index foe array
		int arr1[] = new int[5];
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;
		this.showArrayElement(arr1);
		// second sydex for array first class object
		int arr2[] = { 10, 20, 30, 40, 50 };
		this.showArrayElement(arr2);
	}

	public void showArrayElement(int obj[]) {
		for (int i = 0; i < obj.length; i++)
			System.out.println(obj[i]);
		System.out.println("/////////////");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDemo1 a = new ArrayDemo1();
		a.arrayCreation();

	}
}
