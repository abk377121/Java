package practice4;

public class course {
    private String courseName;
    private int coursecredits;
    private double grade;

    public course(String courseName, int coursecredits){
        this.courseName = courseName;
        this.coursecredits = coursecredits;
    }

    public void setGrade(double grade){
        this.grade = grade;
    }

    public double getGrade(){
        return grade;
    }

    public String getCourseName(){
        return courseName;
    }

    public int getCourseCredits(){
        return coursecredits;
    }

    public String getLetterGrade(){
        if(grade >= 4.0){
            return "A";
        } else if(grade >= 3.7){
            return "A-";
        } else if(grade >= 3.3){
            return "B+";
        } else if(grade >= 3.0){
            return "B";
        } else if(grade >= 2.7){
            return "B-";
        } else if(grade >= 2.3){
            return "C+";
        } else if(grade >= 2.0){
            return "C";
        } else if(grade >= 1.7){
            return "C-";
        } else if(grade >= 1.3){
            return "D+";
        } else if(grade >= 1.0){
            return "D";
        } else {
            return "F";
        }
    }
}