package com.arrayslistdemo;

public class Ass10Employee {
	int eid;
	String ename;
	double salary;
	Ass10Department dep;
	Ass10Employee(){
		
	}
	Ass10Employee(int eid,String ename,double salary,Ass10Department dep){
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
		this.dep=dep;
		
	}
	public void setId(int eid) {
		this.eid=eid;
	}
	public int getId() {
		return eid;
	}
	public void setName(String ename) {
		this.ename=ename;
	}
	public String getName() {
		return ename;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return eid+ename+salary+dep;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass10Employee emp = new Ass10Employee();
		
		

	}

}
