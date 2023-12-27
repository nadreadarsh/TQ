package com.StackAssignment;

import java.util.Iterator;
import java.util.Stack;

/*WAP to create a Stack with some colors (String) &amp; using generics*/
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String>stk=new Stack<>();
		stk.add("Orange");
		stk.push("Red");
		stk.add("Black");
		stk.push("White");
		stk.add("Purple");
		System.out.println(stk);
		
		Iterator<String>itr=stk.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
