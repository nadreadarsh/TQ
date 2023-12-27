package com.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeCompareTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(101, "Abhishek");
		Employee e2 = new Employee(102, "Sunish");
		Employee e3 = new Employee(103, "Suraj");
		Employee e4 = new Employee(104, "Ishwar");
		Employee e5 = new Employee(105, "Ganesh");

//		TreeSet<Employee> tree = new TreeSet<>();
		TreeSet<Employee> tree = new TreeSet<>(new IdComparatorEmployee());
		tree.add(e1);
		tree.add(e2);
		tree.add(e3);
		tree.add(e4);
		tree.add(e5);

		for (Employee x : tree)
			System.out.println(x);
		System.out.println();
		System.out.println("First Element: " + tree.first());

		System.out.println("Last Element: " + tree.last());
		System.out.println("_________________________________________________________");
		Employee e6 = new Employee(102, "Sunish");
		tree.add(e6);
		for (Employee s : tree)
			System.out.println(s);
		System.out.println("####################################################################################");

		TreeSet<String> set = new TreeSet<>();
		set.add("Blue");
		set.add("Purple");
		set.add("Green");
		set.add("Grey");
		set.add("Yellow");
		set.add("White");

		System.out.println("Size By using method: " + set.size());

		int cnt = 0;
		for (String x : set)
			cnt++;
		System.out.println("Size By Using for loop and cnt: " + cnt);
		System.out.println();
		System.out.println("Before Removing Elements");
		for (String x : set)
			System.out.println(x);
		System.out.println();
		set.remove("Green");
		System.out.println("After Removing Elements");
		for (String x : set)
			System.out.println(x);

		TreeSet<String> set1 = new TreeSet<>();
		set1.add("ABlue");
		set1.add("BPurple");
		set1.add("CGreen");
		set1.add("DGrey");
		set1.add("EYellow");
		set1.add("FWhite");
		Iterator<String> itr1 = set1.iterator();
		String y = set1.first();
		while (itr1.hasNext()) {
			String i = itr1.next();
			if (y.equals(i)) {
				itr1.remove();
			}
		}
		System.out.println("Using Iterator");
		for (String a : set)
			System.out.println(a + " ");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		set1.descendingIterator();
		Iterator<String> itr2 = set1.iterator();
		while (itr2.hasNext())
			System.out.println(itr2.next());

	}

}
