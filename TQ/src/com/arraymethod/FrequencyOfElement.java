package com.arraymethod;

/*14.	WAP to count frequency of each element in an array.*/
public class FrequencyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 3, 4, 3, 6, 9, 8, 9 };
		int frequency = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				frequency++;
			}

		}
		System.out.println(a);
	}

}
