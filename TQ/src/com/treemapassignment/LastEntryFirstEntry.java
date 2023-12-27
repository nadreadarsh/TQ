package com.treemapassignment;

import java.util.TreeMap;

public class LastEntryFirstEntry {

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
		System.out.println(tmap.lastKey());
		System.out.println(tmap.lastEntry());
		System.out.println(tmap.firstKey());
		System.out.println(tmap.firstEntry());

	}

}
