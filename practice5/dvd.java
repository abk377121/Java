package practice5;
import java.time.LocalDate;

public class dvd extends item{
    private String director;
    private int duration;

    public dvd(String id, String title, LocalDate publicationDate, String director, int duration) {
        super(id,title,publicationDate,7);
        this.director = director;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }
    public int getDuration() {
        return duration;
    }

    
    
}
