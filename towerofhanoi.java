import java.util.*;

public class towerofhanoi {
    public static void toh(int n, int t1, int t2, int t3) {
        if (n == 0) {
            return;
        }
        toh(n - 1, t1, t3, t2);
        System.out.println("Move disk " + n + " from tower " + t1 + " to tower " + t3);
        toh(n - 1, t2, t1, t3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = sc.nextInt();
        System.out.println("Enter the number for the first tower: ");
        int t1 = sc.nextInt();
        System.out.println("Enter the number for the second tower: ");
        int t2 = sc.nextInt();
        System.out.println("Enter the number for the third tower: ");
        int t3 = sc.nextInt();
        System.out.println("The sequence of moves involved in the Tower of Hanoi are:");
        toh(n, t1, t2, t3);
        sc.close();
        
    }

}
