package com.treemapassignment;

import java.util.NavigableSet;
import java.util.TreeMap;

public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tmap = new TreeMap<>();
		tmap.put(15, "Abhishek");
		tmap.put(10, "Sunish");
		tmap.put(61, "Bhakti");
		tmap.put(25, "Yogesh");
		tmap.put(45, "Suraj");
		tmap.put(24, "Yogesh");
		System.out.println(tmap);
		NavigableSet<Integer>ni=tmap.descendingKeySet();
		System.out.println(ni);
		System.out.println(tmap.descendingKeySet());
		System.out.println(tmap.descendingMap());

	}

}
