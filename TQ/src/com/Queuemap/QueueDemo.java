package com.Queuemap;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new PriorityQueue<>();
		q.add(15);
		q.add(49);
		q.add(79);
		q.add(95);
		q.add(26);
		Iterator<Integer> itr = q.iterator();
		while (itr.hasNext())

			System.out.println(itr.next());

		System.out.println("Remove the element using remove()" + q.remove());

		System.out.println("Remove element using poll()" + q.poll());
		
		System.out.println(q);

		System.out.println("___________________________________________________");

		Integer v;
		while ((v = q.poll()) != null) {
			System.out.println(v);
		}

	}

}
