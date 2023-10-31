package com.containment;

public class Student_Con {
	int rno;
	String name;
	Address paddr;
	public Student_Con() {
		rno = 0;
		name=" ";
		paddr = new Address();
	}
	public Student_Con(int rno,String name,Address addr) {
		this.rno=rno;
		this.name=name;
		this.paddr=addr;
	}
	public String toString() {
		return "Student Detail Roll Number: "+rno+ " Student Name "+ name + " Student Address "+ paddr;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_Con obj = new Student_Con();
		System.out.println(obj);
		
		Address obj1 = new Address("New Mumbai","Maharashtra");
		System.out.println(obj1);
		
		Student_Con obj2 = new Student_Con(101,"Sunish yesu Joseph",obj1);
		System.out.println(obj2);
	}

}
