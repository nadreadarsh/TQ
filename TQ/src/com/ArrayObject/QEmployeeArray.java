package com.ArrayObject;

public class QEmployeeArray {
	private int id;
	private String name;
	private int salary;

	public QEmployeeArray() {
		System.out.println("I am in Default Constructor");
	}

	public QEmployeeArray(int i, String na, int sal) {
		this.id = i;
		this.name = na;
		this.salary = sal;
		System.out.println("I am in Para Constructor");
	}

	public String toString() {
		return "Employee id: " + id + " Employee Name: " + name + " Employee salary: " + salary;
	}

	public void setId(int i) {
		this.id = i;
	}

	public int getId() {
		return id;
	}

	public void setName(String na) {
		this.name = na;
	}

	public String getName() {
		return name;
	}

	public void setSalary(int sal) {
		this.salary = sal;
	}

	public int getSalary() {
		return salary;
	}

	public void CreationArray() {

		ArrayEmployee[] arr;
		arr = new ArrayEmployee[3];
		arr[0] = new ArrayEmployee(101, "Abhishek", 45941);
		arr[1] = new ArrayEmployee(102, "Bhakti", 45164);
		arr[2] = new ArrayEmployee(103, "Sunish", 45164);
		arr[3] = new ArrayEmployee(104, "Adarsh", 45164);

		if (salary != 0) {
			for (int i = 0; i < arr.length; i++)
				;
			System.out.println("Same Salary Of Employee Is :");
		}
		else {
			System.out.println("Employee Salary Is Not Same :");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QEmployeeArray obj = new QEmployeeArray();
		System.out.println(obj);
		
		ArrayEmployee obj1 = new ArrayEmployee();
		System.out.println(obj1);
		
		QEmployeeArray obj2 = new QEmployeeArray();
		System.out.println(obj2);
		
		

	}

}
