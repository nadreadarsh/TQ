package com.TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetFromHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> map = new HashSet<>();
		map.add(16);
		map.add(49);
		map.add(64);
		map.add(79);
		map.add(25);

		TreeSet<Integer> set = new TreeSet<>(map);
		for (Integer h : set)
			System.out.println(h);
		System.out.println();
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

	}

}
