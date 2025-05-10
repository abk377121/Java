import java.util.Scanner;

public class printdecrease {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        printdown(n);
    }
    public static void printdown(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printdown(n - 1);
    }
}
