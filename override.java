class parent {
    public void hello(){
        System.out.println("Hello from parent class");
    }
    
}

class child extends parent{
    @Override
    public void hello(){
        System.out.println("Hello from child class");
    }
}


public class override {
    public static void main(String[] args) {
        parent p = new child();
        p.hello();
    }
}