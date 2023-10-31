package com.containment;

public class Address {
	String city,state;
	Address(){
		
	}
	Address(String city,String state){
		this.city=city;
		this.state=state;
		
	}
	public String toString() {
		return "Address:- "+city+" State:- "+state;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address obj = new Address();
		System.out.println(obj);
		Address obj1 = new Address();
		System.out.println(obj1);

	}

}
