import java.util.Scanner;
public class revisestrings1 {
    public boolean issubstring(String str1, String str2) {
        return str1.contains(str2);
    }
    public static void main(String[] args) {
        revisestrings1 rs = new revisestrings1();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        
        if (rs.issubstring(str1, str2)) {
            System.out.println("The second string is a substring of the first.");
        } else {
            System.out.println("The second string is not a substring of the first.");
        }
        
        scanner.close();
    }
}
