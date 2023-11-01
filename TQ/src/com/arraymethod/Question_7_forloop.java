package com.arraymethod;

import java.util.Arrays;

/*WAP to insert an element in a specific position into an array.*/
public class Question_7_forloop {
	public static void for_Loop() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int originalArray[] = { 1, 2, 3, 4, 5 };
		int insertvalue = 10;
		int insertIndex = 2;

		int newArrayLength = originalArray.length + 1;
		int newArray[] = new int[newArrayLength];
		// step 1
		for (int i = 0; i < insertIndex; i++) {
			newArray[i] = originalArray[i];

		}
		// step 2
		newArray[insertIndex] = insertvalue;
		// step 3
		for (int i = insertIndex; i < originalArray.length; i++) {
			newArray[i + 1] = originalArray[i];
		}
		System.out.println(Arrays.toString(originalArray));
		System.out.println(Arrays.toString(newArray));

	}

}
