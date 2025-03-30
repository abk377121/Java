import java.util.Scanner;

public class arrays {

    // Method to find the index of an element in the array
    public static int find(int[] arr, int d) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == d) {
                return i; // Return the index if the element is found
            }
        }
        return -1; // Return -1 if the element is not found
    }
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search for:");
        int d = sc.nextInt();
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = find(arr, d);
        System.out.println("The element " + d + " is at index: " + ans);
        sc.close();

        
    }
}
