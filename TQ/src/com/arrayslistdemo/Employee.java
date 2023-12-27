package com.arrayslistdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*Sort arraylist of employees on employee names using comparable interface.*/
public class Employee implements Comparable <Employee>{
	int eid;
	String ename;
	double esalary;
	String city;
	public Employee() {
		System.out.println();
		
	}
	

	public Employee(int eid, String ename, double esalary, String city) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.city = city;
	}

	
	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public double getEsalary() {
		return esalary;
	}


	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", city=" + city + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		// comparing by name
		int res=this.ename.compareTo(o.ename);
		
		return res;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(101,"Abhi",25000,"Pune");
		Employee emp2 = new Employee(102,"Bhakti",50000,"Mumbai");
		Employee emp3 = new Employee(103,"Adarsh",30000,"Latur");
		
		ArrayList<Employee> em = new ArrayList<>(Arrays.asList(emp1,emp2,emp3));
		System.out.println("Before Sorting ArrayList");
		System.out.println(em);
		Collections.sort(em);
		System.out.println("After Sorting ArrayList");
		System.out.println(em);

	}

}
