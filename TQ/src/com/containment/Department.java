package com.containment;
/*WAP to have Department class created with id, name . Student class has
roll, name and Department object should have id and name. Assign and
print individual values in main method
*/

public class Department {
	int id;
	String name;

	public Department(int id, String name, StudentDepartment obj1) {
		id = 1;
		name = " ";
	}

	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "ID:-" + id + "Department Name:-" + name;

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department obj = new Department(11,"Applied Science");
		System.out.println(obj);
		
		StudentDepartment obj1 = new StudentDepartment(11,"Applied Science");
		System.out.println(obj1);
		
		Department obj2 = new Department(1,"Abhisekh",obj1);
		System.out.println(obj2);

	}

}
