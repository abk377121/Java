package practice4;
import java.util.ArrayList;
public class student {
    private String name;
    private int id;
    private ArrayList<course> courses;

    public student(String name, int id){
        this.name = name;
        this.id = id;
        courses = new ArrayList<>();
    }

    public void addCourse(course c){
        courses.add(c);
    }

    public void removeCourse(course c){
        courses.remove(c);
    }

    public double getGPA(){
        if (courses.isEmpty()){
            return 0.0;
        }

        double totalCredits = 0;
        for (course c : courses){
            totalCredits += c.getCourseCredits();
        }

        return totalCredits / courses.size();
    }

    public void getTranscript(){
        StringBuilder transcript = new StringBuilder();
        transcript.append("Name: ").append(name).append("\n");
        transcript.append("ID: ").append(id).append("\n");

        for (course c : courses){
            transcript.append(c.getCourseName()).append(" - ").append(c.getLetterGrade()).append("\n");
        }
    }
}
