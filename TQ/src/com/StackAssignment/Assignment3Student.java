package com.StackAssignment;

public class Assignment3Student {
	int rollno;
	String name;

	public Assignment3Student() {
		
	}

	public Assignment3Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Assignment3Student [rollno=" + rollno + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment3Student obj = new Assignment3Student();
		

	}

}
