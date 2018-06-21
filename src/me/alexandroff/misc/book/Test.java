package me.alexandroff.misc.book;

public class Test {

    public static void main(String[] args) {
        Book book1 = new Book(121314, "Harry Potter", "J. K. Rowling");
        Book book2 = new Book(151617, "OCA Programmer I", "M. Gupta");

        System.out.println(book1);
        System.out.println("--------------------");
        System.out.println(book2);

        book1.setBookName("Cheers to the Publican");
        book1.setAuthorName("Paul Kahan");

        System.out.println();

        System.out.println("The new title is: " + book1.getBookName());
        System.out.println("The new author is: " + book1.getAuthorName());

        System.out.println();

        book2.printBook();
    }
}