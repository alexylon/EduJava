package booktest;

public class Book {

    String bookName;
    int isbn;
    Author author;

    public Book(String bookName, int isbn, Author author) {
        this.bookName = bookName;
        this.isbn = isbn;
        this.author = author;
    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", isbn=" + isbn +
                ", author=" + author +
                '}';
    }
}
