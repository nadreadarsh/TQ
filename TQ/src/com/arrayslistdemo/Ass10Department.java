package com.arrayslistdemo;

public class Ass10Department {
	int did;
	String dname;
	Ass10Department(){
		
	}
	Ass10Department(int did,String dname){
		this.did=did;
		this.dname=dname;
		
	}
	public void setId(int did) {
		this.did=did;
	}
	public int getId() {
		return did;
	}
	public void setName(String dname) {
		this.dname=dname;
	}
	public String getName() {
		return dname;
	}
	@Override
	public String toString() {
		return did+dname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass10Department dep = new Ass10Department();

	}

}
