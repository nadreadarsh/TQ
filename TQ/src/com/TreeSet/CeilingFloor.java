package com.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class CeilingFloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>t=new TreeSet<>();
		t.add("Blue");
		t.add("Purple");
		t.add("Green");
		t.add("Grey");
		t.add("Yellow");
		System.out.println("The Greatest and equals to Elements: "+t.ceiling("Brown"));
		System.out.println("The Less than And equals to Elemnts: "+t.floor("Red"));
		System.out.println("Iterating treeset");
		Iterator<String>itr=t.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
