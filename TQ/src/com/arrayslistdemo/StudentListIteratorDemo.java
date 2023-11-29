package com.arrayslistdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentListIteratorDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StudentListIterator> list=new ArrayList<>();
		ArrayList<Integer> l1=new ArrayList<>(Arrays.asList(78,56,90,70,78));
		list.add(new StudentListIterator(1,"Pankaj",l1));
		ArrayList<Integer> l2=new ArrayList<>(Arrays.asList(87,89,90,71,65));
		list.add(new StudentListIterator(5,"Utkarsha",l2));
		ArrayList<Integer> l3=new ArrayList<>(Arrays.asList(45,58,81,70,67));
		list.add(new StudentListIterator(8,"Snehal",l3));
		ArrayList<Integer> l4=new ArrayList<>(Arrays.asList(78,56,90,70,78));
		list.add(new StudentListIterator(2,"Ishawar",l4));
		ArrayList<Integer> l5=new ArrayList<>(Arrays.asList(89,82,90,56,72));
		list.add(new StudentListIterator(9,"Yogesh",l5));
		ArrayList<Integer> l6=new ArrayList<>(Arrays.asList(75,66,60,90,88));
		list.add(new StudentListIterator(11,"Sudarshan",l6));
		ArrayList<Integer> l7=new ArrayList<>(Arrays.asList(88,86,95,75,58));
		list.add(new StudentListIterator(12,"Pankaj",l7));
		ArrayList<Integer> l8=new ArrayList<>(Arrays.asList(58,61,60,50,68));
		list.add(new StudentListIterator(4,"Medha",l8));
		ArrayList<Integer> l9=new ArrayList<>(Arrays.asList(98,96,90,86,88));
		list.add(new StudentListIterator(3,"Adarsh",l9));
		ArrayList<Integer> l10=new ArrayList<>(Arrays.asList(58,66,80,75,78));
		list.add(new StudentListIterator(7,"Prashant",l10));
		
		Iterator<StudentListIterator>itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		System.out.println("Sorting using Student name");
		
		Collections.sort(list);
		itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
