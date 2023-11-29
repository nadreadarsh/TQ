package com.arrayslistdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ListIteratorSrotingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create ArrayList using new keyword
		ArrayList<Integer> arrInt = new ArrayList<>(Arrays.asList(12, 2, 33, 14, 55, 76));
		System.out.println("Before Sorting ");
		System.out.println(arrInt);
		// Sorting the array in ascending order using sort on collections class
		Collections.sort(arrInt);
		System.out.println();
		System.out.println("After Sorting");
		System.out.println(arrInt);

		// reverse the list using reverse method in collections
		Collections.reverse(arrInt);
		System.out.println();
		System.out.println("Reversing the Integer list");
		System.out.println(arrInt);
		System.out.println();

		// Sorting list of string in collections class
		ArrayList<String> arrStr = new ArrayList<>(Arrays.asList("Adarsh", "Abhishek", "Sunish", "Bhakti"));
		System.out.println("Before Sorting");
		System.out.println(arrStr);

		// reversing the list
		Collections.reverse(arrStr);
		System.out.println();
		System.out.println("Reversing the String list");
		System.out.println(arrStr);
		System.out.println();

		// Sorting the String list using sort in ascending order
		Collections.sort(arrStr);
		System.out.println("Sorting The String List");
		System.out.println(arrStr);

	}

}
