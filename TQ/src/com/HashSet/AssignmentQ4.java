package com.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/*WAP to empty a HashSet.*/
public class AssignmentQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Python");
		list.add("C++");
		list.add("C");
		list.add("HTMl");
		list.add("Angular");
		System.out.println(list);
		HashSet<String> set = new HashSet<>(list);

//		Iterator<String>itr=set.iterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
		System.out.println(set);
		System.out.println("Empty HashSet");
		set.removeAll(set);
//		set.clear();
		System.out.println(set);
		System.out.println("___________________________________________________________________");

		HashSet<String> set1 = new HashSet<>();
		set1.isEmpty();
		System.out.println(set1);
	}

}
