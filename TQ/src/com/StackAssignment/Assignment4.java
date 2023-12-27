package com.StackAssignment;

import java.util.Stack;

/* Use  different method calls to add elements to a Stack.*/
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>stk=new Stack<>();
		stk.push(15);
		stk.push(46);
		stk.push(13);
		stk.push(03);
		stk.push(49);
		System.out.println(stk);
		stk.peek();
		System.out.println(stk);
		stk.remove(03);
		System.out.println(stk);
		stk.pop();
		System.out.println(stk);
		stk.search(46);
		System.out.println(stk.search(stk));
		
		
	}

}
