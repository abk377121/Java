class student extends person {
    private String major;
    public student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }
    public String getmajor() {
        return major;
    }
    
}

public class bruhanodastudent {
    public static void main(String[] args) {
        student s1 = new student("John", 20, "Computer Science");
        System.out.println("Name: "+s1.getname());
        System.out.println("Age: "+s1.getage());
        System.out.println("Major: "+s1.getmajor());
    }
}
