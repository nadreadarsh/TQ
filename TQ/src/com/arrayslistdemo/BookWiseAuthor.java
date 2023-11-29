package com.arrayslistdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BookWiseAuthor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Book author1 = new Book(101,"Rich Dad Poor Dad","Robert Kiyosaki",250);
//		Book author2 = new Book(105,"Fantastic Beast","J.K. Rowling",1050);
//		Book author6 = new Book(103,"The Alchemist","Paulo Coelho",450);
//		Book author3 = new Book(102,"Why we want you to be rich","Robert Kiyosaki",350);
//		Book author4 = new Book(104,"Harry Potter Series","J.K. Rowling",850);
//		Book author5 = new Book(106,"Second Chance","Robert Kiyosaki",650);
//		ArrayList<Book>bk=new ArrayList<>(Arrays.asList(author1,author2,author3,author4,author5,author6));
//		bk.add(author5);

		ArrayList<Book> bk = new ArrayList<>();
		bk.add(new Book(101, "NeverTheLess", "J.K.Rowling", 1250));
		bk.add(new Book(102, "Rich Dad Poor Dad", "Robert Kiyosaki", 250));
		bk.add(new Book(103, "Fantastic Beast", "J.K.Rowling", 1050));
		bk.add(new Book(104, "The Alchemist", "Paulo Coelho", 450));
		bk.add(new Book(105, "Why we want you to be rich", "Robert Kiyosaki", 350));
		bk.add(new Book(106, "Harry Potter Series", "J.K.Rowling", 850));
		bk.add(new Book(107, "Second Chance", "Robert Kiyosaki", 650));
		
		System.out.println(bk);

		int cnt = 0;
		for (int i = 0; i < bk.size(); i++) {
			cnt = 0;

			for (int j = 0; j < bk.size(); j++) {
//				cnt=cnt+1;
				if (bk.get(i).bookAuthor.equals(bk.get(j).bookAuthor) && j < i)
					break;
				else if (bk.get(i).bookAuthor.equals(bk.get(j).bookAuthor))
 					cnt++;

			}
			if (cnt > 0)
				System.out.println(bk.get(i).bookAuthor + "=" + cnt);

		}
	}

}
