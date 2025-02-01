class diesuper {
    int num = 56;

}

class subbenclass extends diesuper {
    int num = 100;

    void printNumber() {
        System.out.println(super.num);
    }
}

public class SuperClass {
    public static void main(String[] args) {
        subbenclass obj = new subbenclass();
        obj.printNumber();
    }
}
