package me.alexandroff.misc.book;

public class Book {

	private int isbn;
	private String bookName;
	private String authorName;

	public Book(int isbn, String bookName, String authorName) {
		this.isbn = isbn;
		this.bookName = bookName;
		this.authorName = authorName;
	}

	public void printBook() {
	    System.out.println(this);
    }

	public String toString() {
		return "Book Title: " + bookName + "\nAuthor: " 
		+ authorName + "\nISBN: " + isbn;
	}

	public String getBookName() { return bookName; }

	public void setBookName (String bookName) { this.bookName = bookName; }

	public String getAuthorName() { return authorName; }

	public void setAuthorName(String authorName) {this.authorName = authorName; }
	
}