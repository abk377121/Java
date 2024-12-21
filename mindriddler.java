class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("Guess the answers!");
        System.out.println("Unirary operator " + a++);
        System.out.println("Unirary operator " + b++);
        System.out.println("1 + 2 = " + 1+2);
        System.out.println("1 + 2 = " + (1+2));
        System.out.println(1 + 2 + " = 3");
        int increment = ++a * b++;
        System.out.println(increment);
        System.out.println("Ternary operator");
        int lgestnum = (a>b)?a:b;
        System.out.println("Largest of 2 numbers: " + lgestnum);
    }
}
