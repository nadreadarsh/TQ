package com.arrayslistdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class StudenrArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(1, "Pankaj"));
		list.add(new Student(5, "Utkarsha"));
		list.add(new Student(8, "Snehal"));
		list.add(new Student(2, "Ishawar"));
		list.add(new Student(9, "Yogesh"));
		list.add(new Student(11, "Sudarshan"));
		list.add(new Student(12, "Jayshree"));
		list.add(new Student(4, "Medha"));
		list.add(new Student(3, "Adarsh"));
		list.add(new Student(7, "Prashant"));

		Iterator<Student> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----------------------------");
		itr = list.iterator();
		while (itr.hasNext()) {
			Student obj = itr.next();
			if (obj.getName().length() >= 7)
				System.out.println(obj);

		}

	}
}
