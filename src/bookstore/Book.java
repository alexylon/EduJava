package bookstore;

public class Book {

    private String bookName;
    private Author author;
    private String isbn;
    private int bookNumber;

    public Book(String bookName, Author author, String isbn, int bookNumber) {

        this.bookName = bookName;
        this.author = author;
        this.isbn = isbn;
        this.bookNumber = bookNumber;
    }

    public String toString() {
        return "Book name: " + this.bookName + "\nAuthor: " + this.author
                + "\nISBN: " + this.isbn + "\nAvailable: " + this.bookNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }
}
