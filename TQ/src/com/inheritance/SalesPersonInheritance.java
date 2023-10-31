package com.inheritance;

public class SalesPersonInheritance extends EmployeeInheritance {
	double sale,comm;
	public SalesPersonInheritance() {
		System.out.println("I am in constructor");
	}
	public SalesPersonInheritance(int eid,String ename,double esalary,MyDate d,double sale,double comm) {
		
		System.out.println("I am in parameterized constructor");
		this.sale=sale;
		this.comm=comm;
	}
	public void setSale(double sale) {
		this.sale=sale;
	}
	public double getSale(double sale) {
		return sale;
	}
	public void setComm(double comm) {
		this.comm=comm;
	}
	public double getComm(double comm) {
		return comm;
	}
	public String toString() {
		return super.toString()+sale+comm;
	}
	public double calculateSalary() {
		System.out.println("I am Calculating Salary");
		double s = super.calculateSalary()+sale*comm;
		super.setEsalary(s);
		return s;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesPersonInheritance obj2 = new SalesPersonInheritance();
		System.out.println(obj2);

	}

}
