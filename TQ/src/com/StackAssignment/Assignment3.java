package com.StackAssignment;

import java.util.Iterator;
import java.util.Stack;
/* WAP to create a Stack with user defined class objects &amp; using generics*/
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Assignment3Student>stk=new Stack<>();
		stk.push(new Assignment3Student(101,"Abhishek"));
		stk.push(new Assignment3Student(102,"Sunish"));
		stk.push(new Assignment3Student(103,"Bhakti"));
		stk.push(new Assignment3Student(104,"Adarsh"));
		stk.push(new Assignment3Student(105,"Pritam"));
		stk.push(new Assignment3Student(106,"Suraj"));
		
		Iterator<Assignment3Student>itr=stk.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("___________________________________________________");
		
		while(!stk.empty())
			System.out.println(stk.pop());
		
		

	}

}
