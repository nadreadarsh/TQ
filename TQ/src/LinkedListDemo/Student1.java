package LinkedListDemo;

import java.util.LinkedList;

public class Student1 implements Comparable<Student1> {
	int id;
	String name;
	int mark;
	int perc;

	public Student1(int id, String name, int mark, int perc) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.perc = perc;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMark() {
		return mark;
	}


	public void setMark(int mark) {
		this.mark = mark;
	}


	public int getPerc() {
		return perc;
	}


	public void setPerc(int perc) {
		this.perc = perc;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Student1>std=new LinkedList<>();
		

	}

	@Override
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
