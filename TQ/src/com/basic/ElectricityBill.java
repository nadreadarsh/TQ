package com.basic;
import java.util.Scanner;
 class ElectricityBill {
	 String name;
	 String mount;
	 int unit;
	 int totalbill;
	 
	 public void setData(String cons_name, String cons_mount, int cons_unit,int cons_bill)
	 {
		 name=cons_name;
		 mount=cons_mount;
		 unit=cons_unit;
		 totalbill=cons_bill;
	 }
	 public void calculatebill() {
		 if(unit<=100) {
			 totalbill=(unit*5);
		 }
		 else if(unit>=100) {
			 totalbill = (500+(100-unit)*8);
		 }
		 else if(unit>=300)
		 {
			 totalbill =(500+1600+(100-unit)*10);
		 }
		 
	 }
	 public void displayTotal() {
		 System.out.println("Enter Name: "+name);
		 System.out.println("Enter mount: "+mount);
		 System.out.println("Enter Unit: "+unit);
		 System.out.println("Enter Total Bill: "+totalbill);
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricityBill obj = new ElectricityBill();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = sc.next();
		
		System.out.println("Enter Mount: ");
		String mount = sc.next();
		
		System.out.println("Enter Unit: ");
		int unit = sc.nextInt();
		
		obj.setData(name, mount, unit, unit);
		obj.calculatebill();
		obj.displayTotal();
		

	}

}
