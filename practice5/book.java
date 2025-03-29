package practice5;
import java.time.LocalDate;

public class book extends item{
    private String author;
    private int pages;

    public book(String id, String title, LocalDate publicationDate, String author, int pages) {
        super(id,title,publicationDate,21);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }
    public int getPages() {
        return pages;
    }
}
