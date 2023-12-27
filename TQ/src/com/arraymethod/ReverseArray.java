package com.arraymethod;

public class ReverseArray {
	public void arraycreation() {
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		System.out.println(arr.length);
		displayarray(arr);

	}

	public void displayarray(int array[]) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);

		}
		System.out.println(array.length); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseArray obj1 = new ReverseArray();
		obj1.arraycreation();
		

	}

}
