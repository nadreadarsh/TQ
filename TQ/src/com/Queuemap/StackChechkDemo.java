package com.Queuemap;

import java.util.Iterator;
import java.util.Stack;

public class StackChechkDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>stk=new Stack<>();
		stk.push(78);
		stk.push(45);
		stk.push(12);
		stk.push(1);
		stk.push(6);
		stk.parallelStream();
		System.out.println(stk);
		System.out.println("Position: "+stk.search(45));
		System.out.println(stk);
		Iterator<Integer>itr=stk.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("*******************************");
		System.out.println(stk.isEmpty());

//		while(!stk.empty())
//			System.out.println(stk.pop());
		
		System.out.println("********************************");
		System.out.println(stk.peek());
		System.out.println(stk);

	}

}
