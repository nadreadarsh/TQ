package com.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* WAP to create a HashSet from an ArrayList*/
public class AssignmentQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<>();
		list.add("Abhishek");
		list.add("Sunish");
		list.add("Amit");
		list.add("Pritam");
		HashSet<String>set=new HashSet<>(list);
		
		Iterator<String>itr=set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		

	}

}
