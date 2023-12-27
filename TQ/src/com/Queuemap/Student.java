package com.Queuemap;

import java.util.Objects;

public class Student implements Comparable<Student> {
	int rollNo;
	String Name;
	public Student() {
		
	}
	public Student(int rollNo,String Name) {
		this.rollNo=rollNo;
		this.Name=Name;
	}
	@Override
	public String toString() {
		
		return rollNo+Name;
	}
//	@Override
//	public int hashCode() {
//		
//		
//		return Objects.hash(Name,rollNo);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if(this==obj)
//			return true;
//		if(obj==null)
//			return false;
//		if(getClass()!=obj.getClass())
//			return false;
//		Student other = (Student)obj;
//		return Objects.equals(obj);
//	}
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
@Override
public int compareTo(Student o1) {
	System.out.println("I am in compareble");
	
	if(rollNo>o1.rollNo)
		return 1;
	else if(rollNo<o1.rollNo)
		return -1;
	else
	return 0;

}

}
