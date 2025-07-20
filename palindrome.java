import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of characters: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        System.out.println("Enter the characters:");
        scanner.nextLine();
        String org = scanner.nextLine();
        System.out.println("You entered: " + org);
        
        String reverse = new StringBuilder(org).reverse().toString();
        
        if (org.equals(reverse)) {
            System.out.println(org + " is a palindrome.");
        } else {
            System.out.println(org + " is not a palindrome.");
        }
    }
}
