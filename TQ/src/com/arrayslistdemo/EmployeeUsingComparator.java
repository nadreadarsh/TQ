package com.arrayslistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeUsingComparator implements Comparator <EmployeeC> {

	@Override
	public int compare(EmployeeC o1, EmployeeC o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department dep = new Department();
		
		ArrayList<EmployeeC>empl=new ArrayList<>();
		
		empl.add(new EmployeeC(101,"Abhishek",25,25400,"IT",dep));
		empl.add(new EmployeeC(102,"Bhakti",21,20000,"Finance",dep));
		empl.add(new EmployeeC(103,"Adarsh",26,15400,"Sales",dep));
		empl.add(new EmployeeC(104,"Sunish",20,12400,"QA",dep));
		System.out.println("Before Sorting");
		System.out.println(empl);
		Collections.sort(empl);
		System.out.println("After Sorting");
		System.out.println(empl);
		
		EmployeeUsingComparator obj = new EmployeeUsingComparator();
		Collections.sort(empl, obj);
		for(EmployeeC b :empl)
			System.out.println(b);
		
		
		

	}

	
	
		
	

}
