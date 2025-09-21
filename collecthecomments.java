import java.util.*;
class review{
    private String comment;
    review(String comment){
        this.comment = comment;
        
    }
    
    public String getComment(){
        return comment;
    }

}
public class collecthecomments {
    public ArrayList<String> collectComments(ArrayList<review> allreviews){
        ArrayList<String> comments = new ArrayList<>();
        for (int i = 0; i < allreviews.size(); i++) {
            String coument = allreviews.get(i).getComment();
            if (coument.contains("!")){
                String formattedcoment = String.format("%d - %s", i, coument);
                if (!coument.endsWith("!") && !coument.endsWith(",")){
                    formattedcoment = formattedcoment + ".";
                }
                comments.add(formattedcoment);
            }
        }
        return comments;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            collecthecomments obj = new collecthecomments();
            System.out.println("Enter the number of reviews:");
            int n = sc.nextInt();
            sc.nextLine();
            ArrayList<review> allreviews = new ArrayList<>();
            System.out.println("Enter the reviews:");
            for (int i = 0; i < n; i++) {
                String reviewtext = sc.nextLine();
                allreviews.add(new review(reviewtext));
            }
            ArrayList<String> comments = obj.collectComments(allreviews);
            if (comments.size() > 0) {
                System.out.println("Collected comments:");
                for (String comment : comments) {
                    System.out.println(comment);
                }
            
            } else {
                System.out.println("No comments collected.");
            }
        }
    }
}
