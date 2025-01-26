class Parent {
    int age, id;
    String name;
    void name(String name){
        System.out.println("Name: "+name);
    }
}

class Child extends Parent {
    void age(int age){
        System.out.println("Age: "+age);
    }
}

public class student {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.name("Donquixote Doflamingo");
        c1.age(40);
    }
}
