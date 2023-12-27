package com.StackAssignment;

import java.util.Stack;

/*WAP to check if a Stack has values*/
public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stk = new Stack<>();
		stk.push(15);
		stk.push(27);
		stk.push(59);
		stk.push(79);

		System.out.println(stk);
		System.out.println("while stack has a value: " + stk.empty());
		stk.clear();
		System.out.println("While stack don't have value: " + stk.empty());

	}

}
