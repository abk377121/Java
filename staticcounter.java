class counter {
    int Number = 10;
        void increment(){
            Number+=1;
        }
    }
    
    public class staticcounter {
        public static void main(String[] args) {
            counter c1 = new counter();
            counter c2 = new counter();
            counter c3 = new counter();
            c1.increment();
            c2.increment();
            c3.increment();
            System.out.println(c1.Number);
            System.out.println(c2.Number);
            System.out.println(c3.Number);
    }
}
