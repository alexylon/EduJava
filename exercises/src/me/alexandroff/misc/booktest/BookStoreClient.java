package me.alexandroff.misc.booktest;

public class BookStoreClient {

    public static void main(String[] args) {

        Author author1 = new Author("Brianna Labuskes", "USA");
        Author author2 = new Author("Barbara Davis", "UK");
        Author author3 = new Author("Annejet van der Zijl", "Holland");
        Author author4 = new Author("Eliot Peper", "England");

        Book book1 = new Book("It Ends With Her",
                1503954099, author1);
        Book book2 = new Book("When Never Comes",
                1503950174, author2);
        Book book3 = new Book("An American Princess",
                1536987548, author3);
        Book book4 = new Book("Bandwidth",
                1503954420, author4);

        System.out.println(book1.getAuthorName());
        System.out.println();
        System.out.println(author1);
        System.out.println();
        System.out.println(book1);
    }
}
