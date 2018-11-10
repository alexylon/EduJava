package me.alexandroff.booktest;

public class Bookstore {

    String bookstoreName;
    String bookstoreAddress;

    public Bookstore(String bookstoreName, String bookstoreAddress) {
        this.bookstoreName = bookstoreName;
        this.bookstoreAddress = bookstoreAddress;
    }



    public String getBookstoreName() {
        return bookstoreName;
    }

    public void setBookstoreName(String bookstoreName) {
        this.bookstoreName = bookstoreName;
    }

    public String getBookstoreAddress() {
        return bookstoreAddress;
    }

    public void setBookstoreAddress(String bookstoreAddress) {
        this.bookstoreAddress = bookstoreAddress;
    }

    @Override
    public String toString() {
        return "Bookstore{" +
                "bookstoreName='" + bookstoreName + '\'' +
                ", bookstoreAddress='" + bookstoreAddress + '\'' +
                '}';
    }
}
