package me.alexandroff.oca.gupta.book;

public class Book {

    private int isbn;
    private String bookName;
    private String authorName;

    public Book() {
        this(1234, "The Gulf", "Jack E. Davis");
        //Constructor call must be first

        //Book(1234, "The Gulf", "Jack E. Davis"); - A constructor cannot be invoked by the class name.
    }

    public Book(int isbn, String bookName, String authorName) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.authorName = authorName;
    }

   /* public Book Book2() {
        Book book2 = this(5678, "Nine Continents", "Xiaolu Guo");
        return book2;
    } */ //won't compile


    public String toString() {
        return "Book Title: " + bookName + "\nAuthor: "
                + authorName + "\nISBN: " + isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

}