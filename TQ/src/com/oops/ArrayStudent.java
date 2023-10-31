package com.oops;

public class ArrayStudent {
	private float percentage;
	private int rollNo;
	private String name;
	private char Grade;
	private int arr[];

	ArrayStudent() {
		arr = new int[5];
		
	}
	public void setData(int rollNo,float percentage,String name,char Grade,int arr) {}

	public void studentArrayCreation() {
		int arr1[] = new int[5];
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;

	}

	public float calculatePercentage() {
		int sum = 0;
		for (int i : arr)
			return percentage;

		return percentage = ((float) sum / 500) * 100;
	}

	public void caluculateGrade() {
		if (percentage >= 90) {
			System.out.println("A+");
		} else if (percentage >= 75) {
			System.out.println("A");
		} else if (percentage >= 55) {
			System.out.println("B");
		} else if (percentage >= 40) {
			System.out.println("c");
		} else {
			System.out.println("Fail");
		}
					
			
		

	}

	public static void main(String[] args) {
		int a[] = { 45, 51, 62, 68, 71 };
		ArrayStudent obj = new ArrayStudent();
		obj.calculatePercentage();
		obj.caluculateGrade();

	}

}
