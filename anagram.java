import java.util.*;
public class anagram {
    static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        
        if (isAnagram(str1, str2)) {
            System.out.println("'" + str1 + "' and '" + str2 + "' are anagrams.");
        } else {
            System.out.println("'" + str1 + "' and '" + str2 + "' are not anagrams.");
        }
    }
}
