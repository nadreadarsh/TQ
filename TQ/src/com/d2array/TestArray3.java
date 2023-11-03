package com.d2array;

public class TestArray3 {
	public void createArray() {
		int a[][] = { { 1 }, { 3, 4, 5 }, { 5, 6, }, { 6, 1 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestArray3 obj = new TestArray3();
		obj.createArray();

	}

}
