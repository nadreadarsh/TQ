package com.linkedhashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.arrayslistdemo.Book;

/*WAP to Create LinkedHashMap with Book Object as key and
 * No of copies as a vlaue.Find out which book is having maximum copies and minimum copies*/
public class BookAuthorLinkedhashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Book,Integer>bk=new LinkedHashMap<>();
		
		bk.put(new Book(101, "NeverTheLess", "J.K.Rowling",156), 56);
		bk.put(new Book(102, "Rich Dad Poor Dad", "Robert Kiyosaki", 250),145);
		bk.put(new Book(103, "Fantastic Beast", "J.K.Rowling", 1050),62);
		bk.put(new Book(104, "The Alchemist", "Paulo Coelho", 450),46);
		
		System.out.println(bk);
		Set<Entry<Book,Integer>>set=bk.entrySet();
		Iterator<Entry<Book,Integer>>itr=set.iterator();
		int max=0;
		Book obj=null;
		while(itr.hasNext()) 
		{
			Entry<Book,Integer>s=itr.next();
			
			if (s.getValue()>max)
			{
				max=s.getValue();
				obj=s.getKey();
				
			}
		}
		System.out.println(max + " "+obj.getBookName());
		
		
		ArrayList<Integer>list=new ArrayList<>(bk.values()) ;
			Collections.sort(list);
			System.out.println(list.get(0));
			int minval=list.get(0);
			Set<Book>b=bk.keySet();
			for(Book b1:b) {
				if(bk.get(b1)==minval)
				{
					System.out.println(minval+" "+b1.getBookName());
					break;
					
				}
			}
			
		}

}
