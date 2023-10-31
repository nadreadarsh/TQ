package com.ArrayObject;
import java.util.Scanner;
/*2.WAP to print the employees from Employee[] array who has same joining date. 
 * 	You have Employee class which has 4 attributes id, name, salary, date
 * 	(date is another object which has 3 attributes day, month, year) and 
 *  add employee objects to your array*/
public class  Q2Employee1 {
	private int id;
	private int esalary;
	private String name;
	private int date;
	 public Q2Employee1(){
		System.out.println("I am In default constructor");
	}
	public  Q2Employee1(int id,String name,int salary,int date){
		System.out.println("I am in parameterized constructor");
		
	}
	
	 Q2Employee1(int id,int salary,String name,int date){
		this.id=id;
		this.salary=salary;
		this.name=name;
		this.date=date;
	}
	public int Q2Employee_Id() {
		int temp = 0;
		for(int i = 0; i < xyz.length; i++) {
			if(salary == xyz[i].salary) {
				System.out.println(xyz[i]);
			}
		}
		return temp;
	}
	
	public void Q2Employee(int salary, Q2Employee1 [] xyz)
	{
	 Q2Employee1[] xyz;
	xyz = new  Q2Employee1[4];
	xyz[0] = new  Q2Employee1(101,id, "Bhakti",25000);
	xyz[1] = new  Q2Employee1(102,id,"Adarsh",25000);
	xyz[2] = new  Q2Employee1(103,id,"Abhishek",15000);
	xyz[3] = new  Q2Employee1(104,id,"Sunish",5000);
	}
	int salary = Q2Employee(id,xyz);
	Q2Employee1(salary,xyz);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Q2Employee1 obj = new  Q2Employee1();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		int id = sc.nextInt();
		
		

	}

}
