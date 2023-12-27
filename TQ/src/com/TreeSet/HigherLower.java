package com.TreeSet;

import java.util.TreeSet;

public class HigherLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> n = new TreeSet<>();
		n.add(1);
		n.add(3);
		n.add(4);
		n.add(6);
		n.add(7);
		n.add(9);
		n.add(10);
		System.out.println("The Greatest and equals to Elements: " + n.ceiling(5));
		System.out.println("The Less than And equals to Elements: " + n.floor(5));
		System.out.println("The Higher Number in The list: " + n.higher(8));
		System.out.println("The Lowest Number in The List: " + n.lower(8));

	}

}
