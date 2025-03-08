package practice2;
public class animal {
    private String name;
    private int age;

    public animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void makeSound(){
        System.out.println("The animal makes a sound");
    }
}
