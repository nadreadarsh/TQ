package com.linkedhashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import com.Map.Department;
import com.Map.Employee;

import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// does not contain insertion order it gives random value
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(13, "B");
		hmap.put(1, "C");
		hmap.put(24, "A");
		System.out.println(hmap);

		// contain insertion order
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();
		lmap.put(13, "B");
		lmap.put(1, "C");
		lmap.put(24, "A");
		System.out.println(lmap);

		HashMap<Integer, String> m = new HashMap<>();
		m.put(94, "adarsh");
		m.put(13, "Bhakti");
		m.put(1, "Abhishek");
		m.put(24, "Sunish");
		m.put(54, "yogesh");

		LinkedHashMap<Integer, String> lm = new LinkedHashMap<>(m);
		lm.put(55, "Suraj");
		lm.put(23, "Ishwar");
		lm.put(15, "Pritam");
//		

//		
		// WAP to delete all elements from a given LinkedHashMap
		lm.clear();
		System.out.println(lm.isEmpty());
		System.out.println(lm);

		// WAP to find maximum key
		Set<Integer> s1 = lm.keySet();

		int max = 0;
		for (Integer x : s1) {
			if (x > max)
				max = x;
		}
		System.out.println(max + lm.get(max));
		for (Integer x : s1) {
			if (x < max)
				max = x;
		}
		System.out.println(max + lm.get(max));

	}

}
