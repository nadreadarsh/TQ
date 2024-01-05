package com.Methodargclass;

public class MethodArgClass {
	int data_n=10;
	public MethodArgClass() {
		// TODO Auto-generated constructor stub
	}
	public void showData(Demo obj)
	{
		obj.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodArgClass obj=new MethodArgClass();
		Demo d=new Demo();
	
		
		obj.showData(new Demo() {
			
			
			
		});

	}

}
class Demo
{
	int data=10;
	public Demo() {
		
	}
	public void show()
	{
		System.out.println("In method show() of Demo class");
	}
}



