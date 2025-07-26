import java.util.Scanner;

public class mode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        int[] freq = new int[input.length()];
        char[] str = input.toCharArray();
        for (int i = 0; i < str.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i] == str[j]) {
                    freq[i]++;
                    str[j] = '0'; // Mark as counted
                }
            }
        }
        System.out.println("Character frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (str[i] != '0' && str[i] != ' ') {
                System.out.println(str[i] + ": " + freq[i]);
            }
        }
        
        scanner.close();
    }
}
