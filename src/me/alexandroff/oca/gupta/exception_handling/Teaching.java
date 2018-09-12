package me.alexandroff.oca.gupta.exception_handling;

class BookNotFoundException extends Exception {
}

public class Teaching {

    boolean isBookFound;

    Teaching(boolean isBookFound) {

        this.isBookFound = isBookFound;
    }

    boolean locateBook() {

        return isBookFound;
    }

    void findBook() {

        System.out.println("Book found");
    }

    void readBook() {

        System.out.println("Book read");
    }

    void explainBook() {

        System.out.println("Book explained");
    }

    void teachClass() throws BookNotFoundException {
        if (!locateBook())
            throw new BookNotFoundException();
        else
            findBook();

        readBook();
        explainBook();
    }

}

class TestTeaching {

    public static void main(String[] args) throws BookNotFoundException {
        // "throws" not mandatory here IF a "try block" exists

        Teaching teaching1 = new Teaching(true);
        Teaching teaching2 = new Teaching(false);

        try {
            System.out.println("Teaching with a book:");
            teaching1.teachClass();
            // If exception found stops here and skips to "catch"
            // then to "finally" if exists
            System.out.println();
            System.out.println("Teaching when book not found:");
            teaching2.teachClass();
        } catch (BookNotFoundException e) {
            System.out.println("Book not found");
        } finally {
            System.out.println();
            System.out.println("Report to the supervisor in any case");
            // "finally" is not mandatory but can be only single one
            // and last in the "try block".
            // It executes whenever an exception found or not.
        }
    }
}
