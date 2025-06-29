import java.util.*;
public class insertionsort {
    void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        insertionsort ob = new insertionsort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Given array");
        ob.printArray(arr);
        sc.close();
        ob.insertionSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
// Output:
// Enter the number of elements in the array:
// 5
// Enter the elements of the array:
// 12 11 13 5 6
// Given array
// 12 11 13 5 6
// Sorted array
// 5 6 11 12 13
// Time Complexity: O(n^2)
// Space Complexity: O(1)