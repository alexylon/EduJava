package Lecture_08;

import java.util.Scanner;

public class Book {

    private int id;
    private String name;
    private String author;
    private double price;


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
        return "The name of the book is: " + this.name +
                "\nThe author is: " + this.author +
                "\nPrice: $" + this.price + "\n";
    }

    public static void main(String[] args) {
        Book book1 = new Book(1, "Java 1", "James Mwangi", 5.3);
        Book book2 = new Book(2, "Angular 5", "Bob Slay", 4.1);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter book ID: ");
            int id = scanner.nextInt();

            if (id == book1.id) {
                System.out.println(book1);
                return;
            }

            if (id == book2.id) {
                System.out.println(book2);
                return;

            } else {
                System.out.println("There is no such ID\n");
            }
        }

    }
}
