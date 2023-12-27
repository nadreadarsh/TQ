package com.arrayslistdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Assignment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrInt = new ArrayList<>(Arrays.asList(12, 2, 33, 14, 55, 76));
		System.out.println("Before Sorting ");
		System.out.println(arrInt);
		Iterator<Integer>itr=arrInt.iterator();
		for(Integer x :arrInt)
			System.out.println(x);

	}

}
