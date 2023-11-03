package com.ArrayObject;

import java.util.Scanner;

/*2.WAP to print the employees from Employee[] array who has same joining date. 
 * 	You have Employee class which has 4 attributes id, name, salary, date
 * 	(date is another object which has 3 attributes day, month, year) and 
 *  add employee objects to your array*/
public class Q2Employee1 {
	private int id;
	private int esalary;
	private String name;
	private int date;

	public Q2Employee1() {
		System.out.println("I am In default constructor");
	}

	 
	Q2Employee1(int id, int salary, String name, int date) {
		this.id = id;
		this.esalary = salary;
		this.name = name;
		this.date = date;
	}

	public void compareSalary(Q2Employee1 xyz[]) {
		 double esalary1=15000;
		for (int i = 0; i < xyz.length; i++) {
			if (esalary1 == xyz[i].esalary) {
				System.out.println(xyz[i].id);
				System.out.println(xyz[i].name);
			}
		}
		 
	}

	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2Employee1 obj = new Q2Employee1();
		Q2Employee1[] xy;
		xy = new Q2Employee1[4];
		xy[0] = new Q2Employee1(101,25000, "Bhakti", 25);
		xy[1] = new Q2Employee1(102, 15000, "Adarsh", 25);
		xy[2] = new Q2Employee1(103, 15000, "Abhishek", 15);
		xy[3] = new Q2Employee1(104, 5000, "Sunish", 5);
		 
		 obj.compareSalary(xy);

	}

}
