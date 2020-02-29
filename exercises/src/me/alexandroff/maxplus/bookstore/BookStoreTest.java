package me.alexandroff.maxplus.bookstore;

public class BookStoreTest {

    public static void main(String[] args) {

        BookStore bookStore = new BookStore("Helikon",
                "Industrialna 1");

        Author author1 = new Author("Brianna Labuskes");
        Author author2 = new Author("Barbara Davis");
        Author author3 = new Author("Annejet van der Zijl");
        Author author4 = new Author("Eliot Peper");

        Book book1 = new Book("It Ends With Her",
                author1, "1503954099", 5);
        Book book2 = new Book("When Never Comes",
                author2, "1503950174", 3);
        Book book3 = new Book("An American Princess",
                author3, "B073XJL13C", 8);
        Book book4 = new Book("Bandwidth",
                author4, "1503954420", 1);


        System.out.println(bookStore);
        System.out.println();
        System.out.println(book1);
        System.out.println();
        System.out.println(book2);

    }
}
