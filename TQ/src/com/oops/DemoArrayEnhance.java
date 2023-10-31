package com.oops;

public class DemoArrayEnhance {
	int arr[];

	DemoArrayEnhance() {
		arr = new int[5];
		for (int i = 0; i < arr.length; i++)
			arr[i] = i;
		System.out.println("i am in Defualt");
	}

	DemoArrayEnhance(int o[]) {
		arr = o;
		System.out.println("I am In parametrazied");
	}

	public int addArrayElements() {
		int sum = 0;
		for (int i : arr)
			sum = sum + i;
		return sum;
	}

	// return array from method
	public int[] reverseArr() {
		int newArr[] = new int[arr.length];
		int j = arr.length - 1;
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[j];
			j--;
		}
		return newArr;
	}

	public void printElement() {
		for (int i : arr)
			System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoArrayEnhance obj = new DemoArrayEnhance();
		System.out.println(obj.addArrayElements());
		int objArr[] = { 5, 6, 7, 8, 9 };

		DemoArrayEnhance obj1 = new DemoArrayEnhance(objArr);
		System.out.println(obj1.addArrayElements());
		int resArr[] = obj1.reverseArr();
		for (int i : resArr)
			System.out.println(i);
	}

}
