package LinkedListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student1> al=new ArrayList<>();
		
		al.add(new Student1(1, "Sapana", 101, 45));
		al.add(new Student1(2 ,"Komal", 101, 75));
	
		//System.out.println("******" + al.get(1)+"\n");
	
		//same method will work with Linked list
		//difference internally uses doubly linked list as data structure
	
		LinkedList<Student1> ll=new LinkedList<>();
	
		ll.add(new Student1(1, "Pushkar", 102, 75));
		ll.add(new Student1(2, "Ajay", 102, 35));
		ll.add(new Student1(3, "Amit", 102, 65));
		ll.add(new Student1(4, "Ram", 102, 30));
		ll.add(2,new Student1(5,"Pranav",102, 50));
		
		//System.out.println(ll.get(3));
		
		ll.set(0, new Student1(6,"Abhijeet",101, 87));

		//Collections.sort(ll);
		/*for(Student s:ll)
		System.out.println("linklist " +s);*/

		/*Iterator<Student> iter=ll.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}*/
		
		
		LinkedList<String> ll1=new LinkedList();
		ll1.add("Shubhangi");
		ll1.add("Triveni");
		ll1.add("Madhav");
		ll1.add("Ajay");
		ll1.add("Ram");
		ll1.add(0,"Paritosh");
		
		/*for(String s:ll1)
			System.out.println(s);*/
		
		//ll1.addFirst("Hrishi");
		/*for(String s:ll1)
			System.out.println(s);*/
		
		//ll1.addLast("Jayshree");
		/*for(String s:ll1)
			System.out.println(s);*/
		
		//ll1.removeFirst();
		
		//ll1.removeLast();
		
		
		/*Collections.sort(ll1);
		
		for(String s:ll1)
			System.out.println(s);*/
		
		LinkedList<String> languages = new LinkedList<>();

	    // add elements in the linked list
	    languages.add("Python");
	    languages.add("Java");
	    languages.add("JavaScript");
	    System.out.println("LinkedList: " + languages);

	    // get the element from the linked list
	    String str = languages.get(1);
	    System.out.print("Element at index 1: " + str);
	  }

	}

