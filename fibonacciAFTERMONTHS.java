import java.util.Scanner;
public class fibonacciAFTERMONTHS {
    static int fib(int n){
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Send number of iterations: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci series till " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
    //too ez
}
