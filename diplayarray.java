import java.util.Scanner;

public class diplayarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        displayarr(arr, 0);
    }
    public static void displayarr(int[] arr, int index) {
        if (index == arr.length) {
            return; // Base case: if index reaches the length of the array, stop recursion
        }
        System.out.print(arr[index] + " "); // Print the current element
        displayarr(arr, index + 1); // Recursive call with the next index
    }
}
