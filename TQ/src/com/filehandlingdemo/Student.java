package com.filehandlingdemo;

import java.io.Serializable;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private static final long serialVersionUID = 1l;
	int rn;
	String name;
	float mark;

	public Student(int i, String string, float f) {
		rn = i;
		name = string;
		mark = f;

	}

	public int getrn() {
		return rn;
	}

	public void setRn(int rn) {
		this.rn = rn;
	}

	public String getName(String name) {
		return this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMark() {
		return mark;
	}

	public void setMark(float mark) {
		this.mark = mark;
	}

	public String toString() {
		return "RollNo: "+rn + " Name: "+name +" Marks: "+ mark;

	}

}
