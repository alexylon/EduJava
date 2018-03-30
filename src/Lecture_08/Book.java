package Lecture_08;

public class Book {

    int id;
    String name;
    String author;
    double price;


    public Book(int i, String n, String a, double p) {
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
        System.out.println(book1);
        System.out.println(book2);
    }
}
