package com.inheritance;

public class MyObjectHashCode {
	private int id;
	private String name;
	public MyObjectHashCode(int id, String name) {
		this.id=id;
		this.name=name;
		
	}
	
	public int hashcode() {
		return Integer.hashCode(id)+ name.hashCode();		
	}
	public boolean equals() {
		if(this == obj) {
			return true;
		}
		else if (obj == null || getClass() != getClass() ) {
			return false;
			MyObjectHashCode other = (MyObjectHashCode) obj;
			    return id == other.id && name.equals(other.name);
			
		}
	
	
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
