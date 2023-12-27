package com.treemapassignment;

public class Book implements Comparable<Book> {
	int bookId;
	String bookName;
	String bookAuthor;
	int price;

	public Book() {
	//	System.out.println("I am In default constructor");
	}

	public Book(int bookId, String bookName, String bookAuthor, int price) {
		//System.out.println("I am in Parameterized constructor");
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", price=" + price
				+ "]";
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
