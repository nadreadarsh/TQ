package com.filehandlingdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int eid;
	private String name;
	private transient double salary;
	private MyDate doj;

	public Employee() {
		System.out.println("Default constructor of Employee1");
		eid = 0;
		name = "";
		salary = 0.0;
		doj = new MyDate();
	}

	public Employee(int eid, String name, double sal, MyDate d) {

		System.out.println("Parameter constructor of Employee1");

		this.eid = eid;
		this.name = name;
		this.salary = sal;
		this.doj = d;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public MyDate getDoj() {
		return doj;
	}

	public void setDoj(MyDate doj) {
		this.doj = doj;
	}

	public String toString() {
		return "Employee [Id : " + eid + " Name : " + name + " Salary : " + salary + " Date of Joining : " + doj + "]";
	}


	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Employee obj = new Employee(01, "Yogesh", 50000, new MyDate(25, 10, 2023));
		

		FileOutputStream fos = new FileOutputStream(".//src//com//filehandlingdemo//Employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.flush();
		oos.close();
		fos.close();
		System.out.println(obj);


	}

}
