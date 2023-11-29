package LinkedListDemo;

import java.util.Collections;
import java.util.LinkedList;

/*  WAP to display the elements and their positions in a linked list.
12.  WAP to remove a specified element from a linked list.
13.  WAP to remove first and last element from a linked list.
14.  WAP to remove all the elements from a linked list.*/
public class LinkedListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>l1=new LinkedList<>();
		l1.add("Abhishek");
		l1.add("is");
		l1.add("helping");
		l1.add("Sunish");
		System.out.println(l1);
		System.out.println();
		LinkedList<String>l2=new LinkedList<>();
		l2.add("Snehal");
		l2.add("is");
		l2.add("Coping");
		l2.add("Abhishek's");
		l2.add("Code");
		System.out.println(l2);
		//WAP to display the elements and their positions in a linked list.
		l1.indexOf(2);
		System.out.println("display the elements and their positions in a linked list");
		System.out.println(l1);
		System.out.println();
		
		l1.remove("is");
		System.out.println("remove a specified element from a linked list");
		System.out.println(l1);
		System.out.println();
		
		Collections.shuffle(l1);
		System.out.println("UseShuffle");
		System.out.println(l1);
		System.out.println();
		
		l1.addAll(l2);
		System.out.println("After adding two linkedlist");
		System.out.println(l1);
		System.out.println();
		
		l1.isEmpty();
		System.out.println(l1);
		
//		LinkedList<String>l1=new LinkedList<>();
//		l1.add("Abhishek");
//		l1.add("is");
//		l1.add("helping");
//		l1.add("Sunish");
//		System.out.println(l1);

//		// WAP to clone a linked list to another linked list.
		System.out.println();
		l1.clone();
		System.out.println(l1);
	}

}
