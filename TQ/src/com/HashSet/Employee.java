package com.HashSet;

import java.util.Objects;

public class Employee {
	int e_id;
	String e_name;
	double salary;

	Employee() {

	}

	Employee(int e_id, String e_name, double salary) {
		this.e_id = e_id;
		this.e_name = e_name;
		this.salary = salary;

	}
	public void setId(int e_id) {
		this.e_id=e_id;
	}
	public int getId() {
		return e_id;
	}
	public void setName(String e_name) {
		this.e_name=e_name;
	}
	public String getName() {
		return e_name;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
	public String toString() {
		return "Employee Id"+e_id+" Employee Name "+e_name+" Employee Salary "+salary;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

	}

	@Override
	public int hashCode() {
		return Objects.hash(e_id, e_name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return e_id == other.e_id && Objects.equals(e_name, other.e_name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

}
