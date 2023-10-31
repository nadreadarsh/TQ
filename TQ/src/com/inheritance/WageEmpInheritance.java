package com.inheritance;

public class WageEmpInheritance extends EmployeeInheritance {
	double hrs, rate;

	public WageEmpInheritance() {
		System.out.println("I am in constructor");

	}

	public WageEmpInheritance(int eid, String ename, double esalary, MyDate d, int noofemp, double bonus, double hrs,
			double rate) {
		super(eid,ename,esalary,d);
		System.out.println("I Am in parameterized constructor");
		this.hrs = hrs;
		this.rate = rate;
	}

	public void setHrs(double hrs) {
		this.hrs = hrs;
	}

	public double getHrs() {
		return hrs;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getRate() {
		return rate;
	}

	public String toString() {
		return super.toString() + hrs + rate;
	}

	public double calculatesalary() {
		System.out.println("I am in wage emp calculating salary");
		double s = super.calculateSalary() + hrs * rate;
		super.setEsalary(s);
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WageEmpInheritance obj1 = new WageEmpInheritance(102, "Sunish", 7500, new MyDate(10, 12, 2023), 2, 2000, 2,
				200);
		ManagerInheritance obj = new ManagerInheritance(101, "Bhakti", 75000, new MyDate(12, 10, 2023), 5, 10000);
		EmployeeInheritance obj2 = new EmployeeInheritance(101,"Abhishek",50000,new MyDate(10, 12, 2023));
		if(obj1 instanceof WageEmpInheritance) {
			System.out.println("I am Wage Employee Inheritance");
		}
		else if(obj instanceof ManagerInheritance ) {
			System.out.println("I am Manager Inheritance");
		}
		else {
			System.out.println("I am EmployeeInheritance");
		}

		System.out.println(obj1);

	}

}
