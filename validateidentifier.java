import java.util.*;
public class validateidentifier {
    public boolean isValidIdentifier(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (!Character.isLetter(str.charAt(0)) && str.charAt(0) != '_') {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch) && ch != '_') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            validateidentifier validator = new validateidentifier();
            while (true){
                System.out.println("Enter the identifier to validate:");
                String identifier = sc.nextLine().trim();
                if (identifier.equalsIgnoreCase("exit")) {
                    break;
                }
                boolean isValid = validator.isValidIdentifier(identifier);
                if (isValid) {
                    System.out.println(identifier + " is a valid identifier.");
                } else {
                    System.out.println(identifier + " is not a valid identifier.");
                    System.out.println("Remember: A valid identifier must:");
                    System.out.println("1. Start with a letter (A-Z or a-z) or an underscore (_).");
                    System.out.println("2. Contain only letters, digits (0-9), or underscores (_).");
                    System.out.println("3. Not contain any spaces or special characters.");
                    System.out.println("4. Not be a reserved keyword in the programming language.");
                    
                }
                System.out.println();
            }
            System.out.println("Exiting the program.");

        }
    }
}
