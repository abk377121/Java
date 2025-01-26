class mammals{
    void mam(){
        System.out.println("Inside class mammalia");
    }
}

class lion extends mammals{
    void roar(){
        System.out.println("Inside class lion");
    }
}

class human extends mammals{
    void hum(){
        System.out.println("Inside class human");
    }
}

public class mammalia {
    public static void main(String[] args) {
        lion l1 = new lion();
        
        l1.mam();
        l1.roar();
        
    }
}
