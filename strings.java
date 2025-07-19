import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of characters: ");
        int n = scanner.nextInt();
        System.out.println("Enter the characters:");
        scanner.nextLine();
        String org = scanner.nextLine(); 
        System.out.println("You entered: " + org);
        String reverse = new StringBuilder(org).reverse().toString();
        System.out.println("Reversed string: " + reverse);
        System.out.println("Concatenated string: " + org + "<------>" + reverse);

        
    }
}
