package com.arrayslistdemo;

import java.util.ArrayList;
import java.util.Iterator;

/*Show in program, that size of an ArrayList dynamically changes*/
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>arr=new ArrayList<>();
		arr.add("Black");
		arr.add("Pink");
		arr.add("Purple");
		arr.add("White");
		arr.add("Red");
		System.out.println(arr.size());
		Iterator<String>itr=arr.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
