package com.HashSet;
/*WAP to iterate through all elements in a HashSet and print the elements. Observe the order of elements.*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class AssignmentQ3 {

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
