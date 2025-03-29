package practice5;
import java.time.LocalDate;

public abstract class item {
    private String id;
    private String title;
    private LocalDate publicationdate;
    private int maxcheckoutdays;

    public item(String var, String var2, LocalDate var3, int var4) {
        this.id = var;
        this.title = var2;
        this.publicationdate = var3;
        this.maxcheckoutdays = var4;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getPublicationdate() {
        return publicationdate;
    }

    public int getMaxcheckoutdays() {
        return maxcheckoutdays;
    }
}
