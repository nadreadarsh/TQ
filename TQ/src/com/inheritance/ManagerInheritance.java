package com.inheritance;

public class ManagerInheritance extends EmployeeInheritance {
	int noofemp;
	double bonus;

	public ManagerInheritance() {
		System.out.println("I am in constructor");

	}

	public ManagerInheritance(int eid, String ename, double esalary, MyDate d, int noofemp, double bonus) {
		super(eid, ename, esalary, d);
		System.out.println("I am in parameterized constructor");
		this.noofemp = noofemp;
		this.bonus = bonus;
	}

	public void calculateSal() {
		System.out.println("Calculating Salary");
		double s = super.getEsalary() + bonus;
		super.calculateSalary();

	}

	public void setNoofemp(int noofemp) {
		this.noofemp = noofemp;
	}

	public int getNoofemp() {
		return noofemp;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public String toString() {
		return super.toString() + noofemp + bonus;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerInheritance obj = new ManagerInheritance(101, "Bhakti", 75000, new MyDate(12, 10, 2023), 5, 10000);
		System.out.println(obj);

	}

}
