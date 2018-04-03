package model;

import java.util.Arrays;
import java.util.Comparator;

public class Book {

    private static int numberOfBooks;

    int id;
    String name;
    String author;
    double price;


    public Book(int i, String n, String a, double p) {
        numberOfBooks++;
        this.id = i;
        this.name = n;
        this.author = a;
        this.price = p;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "The name of the book is: " + this.name;
    }

    public static void main(String[] args) {
        Book book1 = new Book(1, "Java 1", "James Mwangi", 5.3);
        Book book2 = new Book(2, "Angular 5", "Bob Slay", 4.1);

        Book[] books = new Book[] {book1, book2};
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(Book book:books) {
            System.out.println("Name: " + book.getName() + "; Author: " + book.author);
        }
        System.out.println();
        System.out.println(book1);
        System.out.println(book2);
        System.out.println();
        System.out.println("Book count = " + Book.getNumberOfBooks());
    }

    public static int getNumberOfBooks() {
        return numberOfBooks;
    }

    public static void setNumberOfBooks(int numberOfBooks) {
        Book.numberOfBooks = numberOfBooks;


    }
}
