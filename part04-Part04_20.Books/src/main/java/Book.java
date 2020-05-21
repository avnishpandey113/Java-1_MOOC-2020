
public class Book {

    private String title;
    private int numberOfPages;
    private int publicationYear;

    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.numberOfPages + " pages, " + this.publicationYear;
    }

}
