interface skull{
    public void method1();
    public void method2();
    
}

public class myinterfaces implements skull{
    public void method1(){
        System.out.println("Implementation of method1");
    }
    public void method2(){
        System.out.println("Implementation of method2");
    }
    public static void main(String[] args) {
        myinterfaces obj = new myinterfaces();
        obj.method1();
        obj.method2();
    }
}
