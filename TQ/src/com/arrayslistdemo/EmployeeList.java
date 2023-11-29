package com.arrayslistdemo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<EmployeeList>list = new ArrayList<>(Arrays.asList(101,"Abhishek",2500,"Nanded"));
		ArrayList<Integer> arr = new ArrayList<>(1);
		Iterator itr = arr.iterator();
		while(itr.hasNext()) {
			itr.next();
			arr.add(12);
		}
		System.out.println(itr);

	}

}
