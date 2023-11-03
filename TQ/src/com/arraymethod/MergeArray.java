package com.arraymethod;

/*WAP to merge 2 arrays to 3rd array. 3rd array should not have elements of same value.*/
public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3 };
		int n2[] = { 4, 5, 6 };

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[i] > a[j + 1]) {
					int temp = a[i];
					a[i] = a[j + 1];
					a[j + 1] = temp;

				}
			}
			System.out.println(a);
		}

	}

}
