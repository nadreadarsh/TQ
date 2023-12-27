package com.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class ReturnAndRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set1 = new TreeSet<>();
		set1.add("ABlue");
		set1.add("BPurple");
		set1.add("CGreen");
		set1.add("DGrey");
		set1.add("EYellow");
		set1.add("FWhite");
		// 1st way
		System.out.println("the remove Last element : " + set1.pollLast());

		for (String x : set1)
			System.out.print(x+" ");
		System.out.println();
		
		// 2nd way
		System.out.println("Remove Last element : "+set1.remove(set1.last()));
		for(String x:set1)
			System.out.print(x+" ");
		System.out.println();


		// 3rd way
		Iterator<String> itr1 = set1.iterator();
		String y = set1.first();
		while (itr1.hasNext()) {
			String i = itr1.next();
			if (y.equals(i)) {
				itr1.remove();
			}
		}
		System.out.println("Using iterator....");
		for(String x:set1)
			System.out.print(x+" ");


	}

}
