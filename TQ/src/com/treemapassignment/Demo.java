package com.treemapassignment;

import java.util.NavigableSet;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String>tmap=new TreeMap<>();
		tmap.put(15, "Abhishek");
		tmap.put(64, "Yogesh");
		tmap.put(61, "Suraj");
		tmap.put(89, "Sunish");
		tmap.put(05, "Pritam");
		
		System.out.println(tmap);
		System.out.println();
		NavigableSet<Integer>ni=tmap.descendingKeySet();
		for(int i:ni)
		System.out.println(i+":"+""+tmap.get(i));
		System.out.println();
		System.out.println(tmap.floorKey(05));
		System.out.println();
		

	}

}
