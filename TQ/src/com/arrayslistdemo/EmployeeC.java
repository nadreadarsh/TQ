package com.arrayslistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeC implements Comparable<EmployeeC> {
	int e_id;
	String e_name;
	int age;
	double e_sal;
	String designation;
	Department dep;

	EmployeeC() {

	}

	public EmployeeC(int e_id, String e_name, int age, double e_sal, String designation, Department dep) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.age = age;
		this.e_sal = e_sal;
		this.designation = designation;
		this.dep = dep;
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public double getE_sal() {
		return e_sal;
	}

	public void setE_sal(double e_sal) {
		this.e_sal = e_sal;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "\nEmployeeC [e_id=" + e_id + ", e_name=" + e_name + "E_Age= " + age + ", e_sal=" + e_sal
				+ ", designation=" + designation + ", dep=" + dep + "]";
	}
	// Comparing by id
//	@Override
//	public int compareTo(EmployeeC o) {
//		// TODO Auto-generated method stub
//		if(this.e_id==o.e_id)
//		return 0;
//		else if(this.e_id>o.e_id)
//			return -1;
//		else
//			return 1;
//	}

	// Comparing by Name
//	@Override
//	public int compareTo(EmployeeC o) {
//		// TODO Auto-generated method stub
//	return this.e_name.compareTo(o.e_name);	
//	}

//	@Override
//	public int compareTo(EmployeeC o) {
//		// TODO Auto-generated method stub
//		if(this.age==o.age)
//		return 0;
//		else if(this.age>o.age)
//			return -1;
//		else
//			return 1;
//	}

	// Compare using salary if name is same

//	@Override
//	public int compareTo(EmployeeC o) {
//		// TODO Auto-generated method stub
//		if(this.e_sal==o.e_sal)
//		return 0;
//		else if(this.e_sal>o.e_sal)
//			return -1;
//		else
//			return 1;
//	}

	// compare by designation
//	@Override
//	public int compareTo(EmployeeC o) {
//		// TODO Auto-generated method stub
//		
//			return this.designation.compareTo(designation);
//	}

	// compare using department
//	@Override
//	public int compareTo(EmployeeC o) {
//		// TODO Auto-generated method stub
//		if (this.dep == o.dep)
//			return 0;
//		else
//			return 1;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department dep1 = new Department(101, "IT", "Pune");
		Department dep2 = new Department(102, "IT", "New Mumbai");
		Department dep3 = new Department(103, "Finance", "Hyderabad");
		Department dep4 = new Department(104, "Non-IT", "Pune");
		Department dep5 = new Department(105, "Sales", "Nagpur");
		Department dep6 = new Department(106, "Production", "Chenai");

		ArrayList<EmployeeC> emp = new ArrayList<>();
		emp.add(new EmployeeC(201, "Abhishek", 26, 25000, "Sr Developer", dep1));
		emp.add(new EmployeeC(202, "Adarsh", 24, 19000, "Jr Developer", dep2));
		emp.add(new EmployeeC(203, "Sunish", 21, 22000, "HR Manager", dep3));
		emp.add(new EmployeeC(201, "Bhakti", 25, 20000, "Accountant", dep4));
		emp.add(new EmployeeC(205, "Suraj", 24, 17000, "Executive", dep5));
		emp.add(new EmployeeC(206, "Sunish", 23, 15000, "Quality Analysis", dep6));

		System.out.println("Before Sorting: " + emp);
		Collections.sort(emp);
		System.out.println();

		
		System.out.println("After Sorting By ID: " + emp);
		Collections.reverse(emp);

		System.out.println();
		System.out.println("After Sorting By ID Descending order: " + emp);

		// Find max salary of employee who is working in "IT" department

//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter department Name");
//			String deptname = sc.next();
//			double max=0;
//			for(int i=0;i<emp.size();i++) {
//				if(emp.get(i).dep.d_name.equals(deptname)) {
//					if(max<emp.get(i).e_sal)
//						max = emp.get(i).e_sal;
//				}
//				
//			}
//			System.out.println("Maximum Salary: "+max);
//			
//		}
		// Find employee who's name starts with 'A'
		System.out.println();
		System.out.println("Employee who's name starts with 'A'");
		for (int i = 0; i < emp.size(); i++) {
			if (emp.get(i).getE_name().startsWith("A")) {

				System.out.println(emp.get(i));
			}
		}
	}

	@Override
	public int compareTo(EmployeeC o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
