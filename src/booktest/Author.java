package booktest;

public class Author {

    String authorName;
    String authorCountry;

    public Author(String authorName, String authorCountry) {
        this.authorName = authorName;
        this.authorCountry = authorCountry;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorCountry() {
        return authorCountry;
    }

    public void setAuthorCountry(String authorCountry) {
        this.authorCountry = authorCountry;
    }

    @Override
    public String toString() {
        return "{" +
                "Author Name='" + authorName + '\'' +
                ", Author Country='" + authorCountry + '\'' +
                '}';
    }
}
