package practice5;
import java.time.LocalDate;

public class cd extends item{
    private String artist;
    private int tracks;

    public cd(String id, String title, LocalDate publicationDate, String artist, int tracks) {
        super(id,title,publicationDate,14);
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getArtist() {
        return artist;
    }
    public int getDuration() {
        return tracks;
    }   
    
}
