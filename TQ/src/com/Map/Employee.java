package com.Map;
/*// WAP to create a map using Custom class as key and any other JDK provided object as value*/
public class Employee {
	//Create employee class to use as object to create MapList
	int e_id;
	String e_name;
	double e_salary;
	int d_id;
	
	Employee(){
		
	}
	
	Employee(int e_id,String e_name,double e_salary,int d_id){
		this.e_id=e_id;
		this.e_name=e_name;
		this.e_salary=e_salary;
		this.d_id=d_id;
	}
	public void setEid(int e_id) {
		this.e_id=e_id;
	}
	public int getEid() {
		return e_id;
	}
	public void setEname(String e_name) {
		this.e_name=e_name;
	}
	public String getEname() {
		return e_name;
	}
	public void setEsalary(double e_salary) {
		this.e_salary=e_salary;
	}
	public double getSalary() {
		return e_salary;
	}
	public void setDid(int d_id) {
		this.d_id=d_id;
	}
	public int getDid() {
		return d_id;
	}

	@Override
	public String toString() {
		return "Employee [e_id=" + e_id + ", e_name=" + e_name + ", e_salary=" + e_salary +" Department id "+d_id+ "]";
	}

	
	
	

}
