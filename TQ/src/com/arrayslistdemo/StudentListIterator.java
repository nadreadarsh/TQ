package com.arrayslistdemo;

import java.util.ArrayList;

public class StudentListIterator implements Comparable<StudentListIterator> {
	int rollno;
	String name;
	ArrayList<Integer> marks;
	double percentage;
	String grdade;

	public StudentListIterator() {

	}

	public StudentListIterator(int rollno, String name, ArrayList<Integer> l) {

		this.rollno = rollno;
		this.name = name;
		this.marks = l;
		calculatePercentage();
		calculateGrade();
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void calculatePercentage() {
		int sum = 0;
		for (int m : marks)
			sum = sum + m;
		this.percentage = sum / 5;
	}

	public void calculateGrade() {
		if (this.percentage >= 90)
			this.grdade = "A+";
		else if (this.percentage >= 80)
			this.grdade = "A";
		else if (this.percentage >= 70)
			this.grdade = "B";

		else if (this.percentage >= 60)
			this.grdade = "C";
		else
			this.grdade = "D";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", percentage=" + percentage
				+ ", grdade=" + grdade + "]";
	}

	@Override
	public int compareTo(StudentListIterator o) {

		if (this.rollno == o.rollno)
			return 0;
		else if (this.rollno > o.rollno)
			return -1;
		else
			return 1;

	}

}
