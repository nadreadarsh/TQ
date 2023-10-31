package com.containment;

public class StudentDepartment {
	int sid;
	String sname;
	StudentDepartment(){
		
	}
	public StudentDepartment(int sid,String sname) {
		this.sid=sid;
		this.sname=sname;
		
	}
	public String toString() {
		return " Student id= "+sid+" Student Name= "+sname;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDepartment obj = new StudentDepartment();
		System.out.println(obj);
		
		StudentDepartment obj1 = new StudentDepartment();
		System.out.println(obj1);
		
		

	}

}
