import java.util.*;
public class quicksort {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }
    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high); 
        }
    }
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Given array");
        printArray(arr);
        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array");
        printArray(arr);
        sc.close();
    }
}
//for loop is a loop that iterates over a group of values in a range.
// Output:
// Enter the number of elements in the array:
// 5
// Enter the elements of the array:
// 10 7 8 9 1 
// Given array
// 10 7 8 9 1
// Sorted array
// 1 7 8 9 10
// Time Complexity: O(n log n) on average, O(n^2) in the worst case
// Space Complexity: O(log n) due to recursive stack space
// Note: The worst-case scenario occurs when the pivot is always the smallest or largest element, leading to unbalanced partitions.
// This can be mitigated by using techniques like random pivot selection or the median-of-three method