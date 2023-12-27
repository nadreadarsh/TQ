package com.Map;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2Student {
	int s_rollNo;
	String s_name;
	double per;
	String grade;
	ArrayList<Integer> marks;

	Q2Student() {

	}

	Q2Student(int s_rollNo, String s_name, ArrayList<Integer> marks) {
		super();
		this.s_rollNo = s_rollNo;
		this.s_name = s_name;
		this.marks = marks;
		this.per = calculatePercentage();
		this.grade = calculateGrade();
		
	}

	public double calculatePercentage() {
		double sum = 0;
		for (int i : marks)
			sum = sum + i;
		per = (sum * 100) / 500;
		return per;
	}

	public String calculateGrade() {
		if (per > 90)
			grade = "A";
		else if (per > 80)
			grade = "B";
		else if (per > 70)
			grade = "C";
		else if (per > 60)
			grade = "D";
		else if (per > 50)
			grade = "E";
		else
			grade = "FAIL";
		return grade;
	}

	public int getS_rollNo() {
		return s_rollNo;
	}

	public void setS_rollNo(int s_rollNo) {
		this.s_rollNo = s_rollNo;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public ArrayList<Integer> getMarks() {
		return marks;
	}

	public void setMarks(ArrayList<Integer> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Q2Student [s_rollNo=" + s_rollNo + ", s_name=" + s_name + ", per=" + per + ", grade=" + grade + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(98, 98, 96, 89, 88));
		Q2Student obj = new Q2Student(101, "Abhishek", arr);
		System.out.println(obj);

	}

}
