package com.oops;

public class Employee2 {

	 
	 int eid;
	 String ename,desg,dname,addr,email;
	 long contactNum;
	 double sal;
	 boolean fullTimeStatus;
	 static String compnayName;
	 static
	 {
		 System.out.println("I am in static block");
		 
	 }
	 public  Employee2(int id,String name,String d,String dnm,
	
	 String ad,String e,long cnum,double s,boolean status)
	{
		 System.out.println("in setData()");
		 eid=id;
		 ename=name;
		 desg=d;
		 dname=dnm;
		 addr=ad;
		 email=e;
		 contactNum=cnum;
		 sal=s;
		 fullTimeStatus=status;
		
		
	}
	 
	public void displayEmployee()
	{
		System.out.println("Employee id "+eid);
		System.out.println("Employee Name "+ename);
		System.out.println("Employee Designation "+desg);
		System.out.println("Employee Department  "+dname);
		System.out.println("Employee Address "+addr);
		System.out.println("Employee Email "+email);
	    System.out.println("Employee Contact Number "+contactNum);
	    System.out.println("Employee Salary "+sal);
	    System.out.println("Employee Fulltime Status "+fullTimeStatus);
		System.out.println("Company Name     :-`       "+compnayName );
			
	}
	public static void setCompanyName(String nm)
	{
		compnayName=nm;
		
	}

	public static void main(String[] args) {
		
		 System.out.println("I am in main()");
			Employee2 obj=new Employee2(1,"Pankaj Kapoor", "Manager","Televion", "Mumbai", "pankaj@gmail.com",  9881134172L, 8700000, true);
			
			obj.displayEmployee();
			
			System.out.println("----------------");
			
			Employee2.setCompanyName("New Name ");
			
			Employee2 obj1=new Employee2(2, "Shahid Kapoor", "Star", "Flim", "Delhi", "S@gmail.com",7298923473L, 7800000L, false);
			obj1.displayEmployee();
			obj.displayEmployee();

	}

}
