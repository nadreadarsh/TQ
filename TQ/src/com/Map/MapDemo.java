package com.Map;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;


public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer , String> hMap = new HashMap<>();
		hMap.put(1, "Adarsh");
		hMap.put(2,"Abhishek");
		hMap.put(3,"Sunish");
		hMap.put(4,"Bhakti");
		hMap.put(5,"Pritam");
		System.out.println(hMap);
		System.out.println();
		System.out.println(hMap.put(1, "Aadarsh"));
		System.out.println(hMap);
		System.out.println();
		
		System.out.println("Map Size"+hMap.size());
		System.out.println();
		System.out.println("Using KeySet");
		for(Integer s:hMap.keySet()) {
			System.out.println(s+" "+hMap.get(s));
		}
		
		
		System.out.println();
		Set<Entry<Integer,String>> set =hMap.entrySet();
		System.out.println("Using Enhanced for loop using entryset");
		System.out.println();
		
		
		//Iterating using enhance for loop
		System.out.println("Using Enhance For loop");
		for(Entry<Integer,String> ob: set) {
		System.out.println(ob.getKey()+ob.getValue());
		}
		System.out.println();
		
		
		//iterating using iterator
		System.out.println("Using Iterator");
		Iterator<Entry<Integer,String>>itr = set.iterator();
		while(itr.hasNext()) {
			Entry<Integer , String>e = itr.next();
			System.out.println(e.getKey()+e.getValue());
		}
		System.out.println();
		
		
		System.out.println("Demo for KeySet Method");
		System.out.println("Using keyset and Interator");
		Set<Integer>keys = hMap.keySet();
		Iterator<Integer>kitr = keys.iterator();
		while(kitr.hasNext()) {
			int key = kitr.next();
			System.out.println(key+hMap.get(key));
		}
		System.out.println("Using keySet and enhanced for loop");
		for(Integer k :keys) {
			System.out.println("key = "+k);
			System.out.println("Value = "+hMap.get(k));
		}
		
	}

}
