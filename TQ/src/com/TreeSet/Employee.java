package com.TreeSet;

import java.util.Comparator;

public class Employee {
	int eid;
	String ename;

	public Employee() {

	}

	public Employee(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}

	public String toString() {
		return "Employee ID " + eid + " Employee Name " + ename;
	}

	public int CompareTo(Employee o) {
		System.out.println("I am in Compare");
		if (this.eid > o.eid)
			return 1;
		else if (this.eid < o.eid)
			return -1;
		else
			return 0;

	}

}

class IdComparatorEmployee implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.eid > o2.eid)
			return -1;
		else if (o1.eid < o2.eid)
			return 1;
		else
			return 0;
	}

}
