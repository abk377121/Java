import java.util.*;
public class revisestrings2 {
    public int countsubstrings(String str1, String sub) {
        int count = 0;
        int index = 0;
        while (index >= 0 ) {
            index = str1.indexOf(sub, index);
            if (index >= 0) {
                count++;
                index += sub.length(); // Move index forward to avoid counting the same substring again
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        revisestrings2 rs = new revisestrings2();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter the substring to count: ");
        String sub = scanner.nextLine();
        
        int count = rs.countsubstrings(str1, sub);
        System.out.println("The substring '" + sub + "' appears " + count + " times in the first string.");
        
        scanner.close();
    }
}
