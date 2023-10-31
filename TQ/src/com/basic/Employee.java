package com.basic;
class Employee {
	 int Eid;
	 String Name;
	 String add;
	 String dprt;
	 String mail;
	 long cnum;
	 double slry;
	 boolean regl;
	
public void setData(int id, String name, String ad, String depart, String email, long contact, double salary, boolean regular)
{
	System.out.println("In setdata()");
	Eid = id;
    Name = name;
	add=ad;
	dprt=depart;
	mail=email;
	cnum=contact;
	slry=salary;
	regl=regular;
}
	public void DisplayEmployee(){
		System.out.println("Employee id: "+ Eid);
		System.out.println("Employee Name: "+Name);
		System.out.println("Employee Addreee: "+add);
		System.out.println("Employee Department: "+dprt);
		System.out.println("Employee Email: "+mail);
		System.out.println("Employee Contact: "+cnum);
		System.out.println("Employee Salary: "+slry);
		System.out.println("Employee Regular: "+regl);
		System.out.println("_______________________");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj = new Employee();
		obj.setData(1,"Adarsh Nadre","Nanded","Java Developer","adarshunadre@gmail.com",7066646404l,60000, true);
		obj.DisplayEmployee();
		System.out.println("_______________________");
		obj.setData(2,"Amol Nadre","Nanded","Acountant","amolnadre7707@gmail.com",9545617707l,80000,true);
		obj.DisplayEmployee();
 	
			

	}
	
	
}