package com.arrayslistdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6);
		ListIterator<Integer> itr = l.listIterator(l.size());
		
		System.out.println("Before Sorting the list: " + l);
		
		while (itr.hasPrevious()) {
			// Sorting the list in ascending order

			System.out.print(itr.previous() + " ");
		}
		System.out.println();
		System.out.println("------------------");
		ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		System.out.println(arr);
		System.out.print(arr.size());
		System.out.println(arr.hashCode());
	}

}
