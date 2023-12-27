package com.Queuemap;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class StudentQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student o1 = new Student(100," Pankaj");
		Student o2 = new Student(10," Ramesh");
		Student o3 = new Student(70," Seeta");
		Student o4 = new Student(7," Vinod");
		Student o5 = new Student(15," Abhishek");
		
		Queue<Student>que=new PriorityQueue<>();
		que.add(o1);
		que.add(o2);
		que.add(o3);
		que.add(o4);
		que.add(o5);
		Iterator<Student>itr=que.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("______________________________________________");
		System.out.println("Remove using poll() "+que.poll());
		System.out.println(que);
//		System.out.println("Remove all Elements "+que.removeAll(que));
//		System.out.println(que.poll());
//		System.out.println(que.remove());
		System.out.println(que.offer(o4));
		System.out.println(que);
		
		

		
		

	}

}
