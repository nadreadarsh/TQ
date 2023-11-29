package com.arrayslistdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArraysList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(15);
		l1.add(12);
		l1.add(5);
		l1.add(2);
		l1.add(4);

		Object[] arr =  l1.toArray();
		Integer array[]=l1.toArray(new Integer[l1.size()]);
		System.out.println(l1);
		System.out.println(Arrays.toString(array));
		// using for loop
		int sum = 0;
		for (int i = 0; i < l1.size(); i++) {
			sum = sum + l1.get(i);

		}
		System.out.println(sum);
		sum = 0;
		System.out.println();
		System.out.println("_____________________");
		// using enhanced for loop
		for (int i : l1) {
			sum = sum + i;
		}
		System.out.println(sum);
		sum = 0;
//		Using interator way
//		 itr= {1,2,3,4,5};
		Iterator<Integer> itr = l1.iterator();
		while (itr.hasNext()) {

			// System.out.print(itr.next()+" ");
			sum = sum + itr.next();
		}
		System.out.println(sum);

		ArrayList<Integer> l =  (ArrayList<Integer>) Arrays.asList(1, 2, 3, 4, 5, 6);
	}

}
