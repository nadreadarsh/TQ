package com.oops;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[5];// declaration and instantiation
		a[0] = 10;// initialization
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		// traversing array
		// for (int i = 0; i < a.length; i++)// length is the property of array
		int i = 0;
		while (i > a.length) {
			i++;
		}
		System.out.println(a[i]);
	}

}
