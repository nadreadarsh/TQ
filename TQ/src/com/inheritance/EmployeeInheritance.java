package com.inheritance;

public class EmployeeInheritance {
    private int eid;
	private String ename;
	private double esalary;
	private MyDate doj;
	public EmployeeInheritance() {
		System.out.println("I am in default constructor of employee");
		eid =0;
		ename=" ";
		esalary=0;
		doj=new MyDate();
	}
	
	public  double calculateSalary() {
		return esalary;
		
	}
	public double getSalary() {
		return esalary;
	}
	public EmployeeInheritance(int eid,String ename,double esalary,MyDate d) {
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
		this.doj=d;
	}
	
	public void setEid(int eid) {
		this.eid=eid;
	}
	public int getEid() {
		return eid;
	}
	public void setEsalary(double esalary) {
		this.esalary=esalary;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEname(String ename) {
		this.ename=ename;
	}
	public String getEname() {
		return ename;
	}
	public void setDoj(MyDate o) {
		this.doj=o;
	}
	public MyDate getMyDate() {
		return doj;
	}
	public String toString() {
		return "EID "+eid+" EName "+ename+" Esalary "+esalary+" Date of Joining "+doj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeInheritance obj = new EmployeeInheritance();
		System.out.println(obj);
		MyDate d = new MyDate(10,10,2023);
		System.out.println(d);
		EmployeeInheritance obj2 = new EmployeeInheritance(101,"Abhishek",50000,d);
		
		System.out.println(obj2);
		
		EmployeeInheritance obj3 = new EmployeeInheritance();
		obj2.setDoj(new MyDate(20,10,2023));
		obj2.setEid(102);
		obj2.setEname("Abhishek");
		
		int id = obj.getEid();
		String name = obj.getEname();
		MyDate doj = obj.getMyDate();
		System.out.println(id);
		System.out.println(name);
		System.out.println(doj);
	}

}
