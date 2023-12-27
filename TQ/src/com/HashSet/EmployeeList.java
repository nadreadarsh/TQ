package com.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee>set=new HashSet<>();
		Employee e1=new Employee(101,"Abhishek",25000);
		Employee e2=new Employee(102,"Sunish",26400);
		Employee e3 = new Employee(103,"Bhakti",65000);
		Employee e4 = new Employee(104,"Ishwar",46509);
		Employee e5 = new Employee(105,"Suraj",1649102);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		System.out.println("HashCode for e3"+e3.hashCode());
		set.add(e4);
		set.add(e5);
		
//		for(Employee x:set)
//			System.out.println(x);
//		System.out.println("_________________________________");
		Iterator<Employee>itr=set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		Employee e6=new Employee(103,"Bhakti",65000);
		System.out.println("HashCode for e6"+e6.hashCode());
		for(Employee x:set)
		System.out.println(x);
		
		
		
//		ArrayList<Employee>emp=new ArrayList<>();
		

	}

}
