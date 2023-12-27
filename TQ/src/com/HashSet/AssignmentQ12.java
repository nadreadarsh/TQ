package com.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* WAP to add user defined objects of type Employee in a HashSet. Print the contents in the Set.*/
public class AssignmentQ12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Employee> set = new LinkedHashSet<>();
		Employee e1 = new Employee(101, "Abhishek", 25000);
		Employee e2 = new Employee(102, "Sunish", 26400);
		Employee e3 = new Employee(103, "Bhakti", 65000);
		Employee e4 = new Employee(104, "Ishwar", 46509);
		Employee e5 = new Employee(105, "Suraj", 1649102);
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		HashSet<Employee> emp = new HashSet<>(set);

		Iterator<Employee> itr = emp.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

	}

}
