package LinkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;

/* WAP to append the specified element to the end of a linked list.
2.  WAP to iterate through all elements in a linked list.
3.  WAP to iterate through all elements in a linked list starting at the specified position.
4.  WAP to iterate a linked list in reverse order.
5.  WAP to insert the specified element at the specified position in the linked list.*/
public class LinedListDemo1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WAP to append the specified element to the end of a linked list.
		LinkedList<String>l1=new LinkedList<>();
		l1.add("Sunish");
		l1.add("is Absent");
		System.out.println("Before Adding element at last");
		System.out.println(l1);
		System.out.println();
		l1.addLast("From Monday");
		System.out.println("After adding element at last");
		System.out.println(l1);
		System.out.println();
		l1.addFirst("Good Boy");
		System.out.println("Adding element at first");
		System.out.println(l1);
		
		System.out.println();
		////WAP to insert the specified element at the specified position in the linked list
				l1.add(1, "Deshmukh");
		System.out.println("After adding deshmukh");
		System.out.println(l1);
		//WAP to iterate a linked list in reverse order.
		System.out.println();
		Iterator iterator1 = l1.descendingIterator();
		System.out.println("Printing in reverse order");
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
			
		}
		
		//WAP to iterate through all elements in a linked list.
		Iterator iterator = l1.iterator();
		System.out.println();

		System.out.println("Before Iterating list");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
		
		 //WAP to iterate through all elements in a linked list starting at the specified position.
//		for(int i=1;i<l1.size();i++) {
//			System.out.println(l1.size());
//		}
		// WAP to get the first and last occurrence of the specified elements in a linked list.
		LinkedList<Integer>l3=new LinkedList<>();
		l3.add(1);
		l3.add(2);
		l3.add(1);
		l3.add(6);
		System.out.println(l3);
		
		int count=0;
		int firstO=0;
		int lastO=0;
		for(int j=0;j<l3.size();j++) {
			if(l3.get(j) ==1) {
					count++;
			}
			if(count==1) {
				firstO=j;
			}
			else {
				lastO=j;
				
			}
			
		}
		System.out.println(count);
		System.out.println(firstO);
		System.out.println(lastO);
		
		// WAP to display the elements and their positions in a linked list.
	}

}
