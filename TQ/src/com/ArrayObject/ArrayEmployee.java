package com.ArrayObject;

import java.util.Scanner;

public class ArrayEmployee {
	int id;
	String name;
	int salary;

	ArrayEmployee() {

	}

	ArrayEmployee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {

		Scanner sa = new Scanner(System.in);
		System.out.println("Employee id is: ");

		int id = sa.nextInt();

		ArrayEmployee obj = new ArrayEmployee();
		System.out.println(obj);

		QEmployeeArray obj1 = new QEmployeeArray();
		System.out.println(obj1);

		ArrayEmployee obj2 = new ArrayEmployee();
		System.out.println(obj2);

		ArrayEmployee[] arr;
		arr = new ArrayEmployee[3];
		arr[0] = new ArrayEmployee(101, "Abhishek", 45941);
		arr[1] = new ArrayEmployee(102, "Bhakti", 45164);
		arr[2] = new ArrayEmployee(103, "Sunish", 45164);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Employee:-" + i + "-" + arr[i].id + " " + arr[i].name+" "+arr[i].salary);

		}
		sa.close();
	}

}
