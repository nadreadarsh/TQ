package com.oops;

public class EmployeeHike {
	private int eid;
	private String ename;
	private long esalary;

	public void setData(int id, String name, long salary) {
		this.eid = id;
		this.ename = name;
		this.esalary = salary;

	}

	public void findHighSalary(EmployeeHike obj) {
		if (this.esalary > obj.esalary) {
			System.out.println(this.eid + this.ename + " Has more Salary than  " + obj.ename);
		} else {
			System.out.println(this.eid + this.ename + " has more salary than  " + obj.ename);
		}
	}

	public static void main(String[] args) {
		EmployeeHike obj2 = new EmployeeHike();
		EmployeeHike obj1 = new EmployeeHike();
		obj2.setData(5, " Adarsh", 75000);
		obj1.setData(8, " Sunish", 70000);
		obj2.findHighSalary(obj1);

	}

}
