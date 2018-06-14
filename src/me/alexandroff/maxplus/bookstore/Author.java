package me.alexandroff.maxplus.bookstore;

public class Author {

    private String authorName;
    private String authorAddress;
    private int authorPhone;

    public Author(String authorName) {
        this.authorName = authorName;
    }

    public String toString() {
        return this.authorName;
    }


    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorAddress() {
        return authorAddress;
    }

    public void setAuthorAddress(String authorAddress) {
        this.authorAddress = authorAddress;
    }

    public int getAuthorPhone() {
        return authorPhone;
    }

    public void setAuthorPhone(int authorPhone) {
        this.authorPhone = authorPhone;
    }
}
