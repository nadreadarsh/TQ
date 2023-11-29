package com.arrayslistdemo;

public class Department {
	int d_id;
	String d_name;
	String d_location;

	Department() {

	}

	public Department(int d_id, String d_name, String d_location) {
		super();
		this.d_id = d_id;
		this.d_name = d_name;
		this.d_location = d_location;
	}

	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public String getD_location() {
		return d_location;
	}

	public void setD_location(String d_location) {
		this.d_location = d_location;
	}
	

	@Override
	public String toString() {
		return "Department [d_id=" + d_id + ", d_name=" + d_name + ", d_location=" + d_location + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department dep = new Department();       
		Department dep1 = new Department(101,"IT","Amarkantak");
		Department dep2 = new Department(102,"HR","New Mumbai");
		Department dep3 = new Department(103,"Finance","Hyderabad");
		Department dep4 = new Department(104,"Non-IT","Pune");
		Department dep5 = new Department(105,"Sales","Nagpur");
		Department dep6 = new Department(106,"Production","Chenai");
		

	}

}
