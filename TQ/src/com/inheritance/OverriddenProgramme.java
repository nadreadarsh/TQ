package com.inheritance;
/*WAP to create class Programmer with Method workingHours().
 * create class Employee which extends Programmer implement 
 * workingHours()differently in child.*/
public class OverriddenProgramme {
	public void workingHours() {
		System.out.println(" Workinh hours of an employee is upto 8 hrs ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverriddenProgramme obj = new OverriddenProgramme();
		obj.workingHours();
		

	}

}
