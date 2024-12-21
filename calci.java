class Main {
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        int sum = a+b;
        int diff = a-b;
        int mult = a*b;
        int div = a/b;
        String magic = "============= Magic =============";
        System.out.println("=========== Method 1 ===========");
        System.out.println("Addition of 10 and 5: " + sum);
        System.out.println("Subtraction of 10 and 5: " + diff);
        System.out.println("Multiplication of 10 and 5: " + mult);
        System.out.println("Division of 10 and 5: " + div);
        System.out.println("=========== Method 2 ===========");
        System.out.println("Addition of 10 and 5: " + (a+b));
        System.out.println("Subtraction of 10 and 5: " + (a-b));
        System.out.println("Multiplication of 10 and 5: " + (a*b));
        System.out.println("Division of 10 and 5: " + (a/b));
        System.out.println("Remainder of the division of 10 and 5: " + (a%b));
        System.out.println(magic);
        System.out.println("Addition: " + (a+b) + " Subtraction: " + (a-b) + " Multiplication: " + (a*b) + " Division: " + (a/b));

    }
}
