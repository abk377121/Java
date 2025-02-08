abstract class obj{
    abstract void display();
    public void shape(){
        System.out.println("I'm from abstract class obj");
    }
}

class sphere extends obj{
    void display(){
        System.out.println("I'm a sphere");
    }
}

class cube extends obj{
    void display(){
        System.out.println("I'm a cube");
    }
}

class prism extends obj{
    void display(){
        System.out.println("I'm a prism");
    }
}

public class objects {
    public static void main(String[] args) {
        obj a = new sphere();
        a.display();
        a = new cube();
        a.display();
        a = new prism();
        a.display();
    }
}
