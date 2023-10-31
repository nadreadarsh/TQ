package com.oops;

public class StaticDemo {
	static int count = 501;
	private String ename;
	private float salary;
	private int eid;
	static String cname;
	static {
		 cname = "Thinkquotient";

	}

	public StaticDemo() {
		this.eid = count++;

	}

	public String toString() {
		return "ID: " + eid + " Name: " + ename + " Salary: " + salary + " Company Name: " + cname;

	}

	public StaticDemo(String Sal, int j, String name) {
		// TODO Auto-generated constructor stub

		eid = count++;
		ename = name;
		salary = j;
		cname = Sal;

	}

	public void setData(String ename, float salary, String cname) {
		this.ename = ename;
		this.salary = salary;
		this.cname = cname;
	}

	public void displayData() {
		System.out.println("ID: " + eid + " Name: " + ename + " Salary: " + salary + " Company Name: " + cname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo obj = new StaticDemo(cname, 1245, "Adarsh");
		StaticDemo obj1 = new StaticDemo(cname, 75, "Sunish");
		StaticDemo obj3 = new StaticDemo(cname, 646, "Abhishek");

		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj3);

	}

}
