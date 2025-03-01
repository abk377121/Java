class person {
    private String name;
    private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getname() {
        return name;
    }
    public int getage() {
        return age;
    }
}

public class subclasses {
    public static void main(String[] args) {
        person p1 = new person("John", 30);
        System.out.println("Name: "+p1.getname());
        System.out.println("Age: "+p1.getage());
    }
}