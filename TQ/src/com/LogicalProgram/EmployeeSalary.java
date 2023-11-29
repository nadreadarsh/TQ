package com.LogicalProgram;
import java.util.Scanner;
 class EmployeeSalary {
	 int eid;
	 String ename;
	 Long basicsal;
	 static float pf;
	 static float hra;
	 static float da;
	 static float netsal;
	 public void setData(int eid2, String ename2, long employeeSalary, float employeePf, float employeeHra, float employeeDa, float employeeNetsal)
	 {
		 System.out.println("In set Data");
		 eid = eid2;
		 ename = ename2;
		 basicsal = employeeSalary;
		 pf = employeePf;
		 hra = employeeHra;
		 da = employeeDa;
		 netsal = employeeNetsal;
		 
	 }
	 public void findPf() {
		 pf = (basicsal*10)/100;
		 System.out.println(pf);
		 
	 }
	 public void findHra() {   
		 hra = (basicsal*15)/100;
		 System.out.println(hra);
	 }
	 public void findDa() {
		 da = (basicsal*20)/100;
		 System.out.println(da);
		 
	 }
	 public void findNetsal() {
		 netsal = basicsal-pf+hra+da;
		 System.out.println(netsal);
	 }
	 public void displayemployee() {
		 System.out.println("Employee id:- "+eid);
		 System.out.println("Employee name:- "+ename);
		 System.out.println("Employee BasicSalary:- "+basicsal);
		 System.out.println("Employee pf:- "+pf);
		 System.out.println("Employee hra:- "+hra);
		 System.out.println("Employee da:- "+da);
		 System.out.println("Employee netsalary:- "+netsal);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id:- ");
		int eid = sc.nextInt();
		System.out.println("Enter Employee name:- ");
		String ename = sc.next();
		System.out.println("Enter Employee Basic Salary:- ");
		long basicsal = sc.nextLong();
		
		EmployeeSalary obj = new EmployeeSalary();
		obj.setData(eid,ename,basicsal,pf,hra,da,netsal);
		obj.displayemployee();
	
	}
	

}
