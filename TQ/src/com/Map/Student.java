package com.Map;

//// WAP to create a map using Custom class as key and any other JDK provided object as value
public class Student {
	int s_id;
	String s_name;
	int s_marks;

	Student() {

	}

	Student(int s_id, String s_name, int s_marks) {
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_marks = s_marks;
	}

	public void setStudentid(int s_id) {
		this.s_id = s_id;
	}

	public int getStudentid() {
		return s_id;
	}

	public void setStudentName(String s_name) {
		this.s_name = s_name;

	}

	public String getStudentName() {
		return s_name;
	}

	public void getStudentMarks(int s_marks) {
		this.s_marks = s_marks;
	}

	public int setStudentMarks() {
		return s_marks;
	}

	public String toString() {
		return "Student ID: " + s_id + " Student Name: " + s_name + " Student Marks: " + s_marks;
	}

}
