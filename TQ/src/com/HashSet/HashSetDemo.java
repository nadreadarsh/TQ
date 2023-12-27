package com.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>s=new ArrayList<>();
		s.add("Blue");
		s.add("Red");
		s.add("Purple");
		s.add("Blue");
		s.add("White");
		System.out.println("Showing ArrayList");
		System.out.println(s);
		HashSet<String>set= new HashSet<>(s);
		for(String x:s)
			
		System.out.println(s.add(x));
		System.out.println("Showing HashSet");
		System.out.println(set);
		System.out.println("After iteratings");
//		Iterator<String>itr=set.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		set.remove("Blue");
		System.out.println(set);
		System.out.println();
//		System.out.println("After clearing list");
//		set.clear();
//		System.out.println(set);
		System.out.println("Using contains");
		set.contains("Blue");
		System.out.println(set);
		
		
		System.out.println("using isEmpty");
		set.isEmpty();
		System.out.println(set);
		
		System.out.println("Check size");
		set.size();
		System.out.println(set);
		
		System.out.println("Using remove");
		set.remove("Blue");
		System.out.println(set);
		
		System.out.println("removeall");
		set.removeAll(set);
		System.out.println(set);
		
		

	}

}
