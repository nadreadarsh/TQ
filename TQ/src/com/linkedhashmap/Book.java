package com.linkedhashmap;

public class Book {
	int book_id;
	String bookauthor;
	String bookname;
	int price;

	Book() {

	}

	Book(int book_id, String bookauthor, String bookname, int price) {
		this.book_id = book_id;
		this.bookauthor = bookauthor;
		this.bookname = bookname;
		this.price = price;
	}

	public int getBookId() {
		return book_id;
	}

	public void setBookId(int book_id) {
		this.book_id = book_id;
	}

	public String getBookAuthor() {
		return bookauthor;
	}
	public void setBookAuthor(String bookauthor) {
		this.bookauthor=bookauthor;
	}
	public String getBookName() {
		return bookname;
	}
	public void setBookName(String bookanme) {
		this.bookname=bookanme;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public String toString() {
		return "Book ID "+book_id+" Book Author Name "+bookauthor+" Book Name "+bookname+" Book Pirce "+price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
