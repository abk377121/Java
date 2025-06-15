import java.util.Scanner;

public class binarysrchusingrescursion {
    int searchbinary(int arr[], int l, int r, int x){
        if (r >= l){
            int mid = l + (r-l)/2;
            if (arr[mid] == x) {
                return mid; // Element found
            }
            if (arr[mid] > x){
                return searchbinary(arr, l, mid - 1, x); // Search in left half
            } else {
                return searchbinary(arr, mid + 1, r, x); // Search in right half
            }

        }
        return -1; // Element not found
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array (sorted in ascending order):");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search:");
        int x = sc.nextInt();
        binarysrchusingrescursion OB = new binarysrchusingrescursion();
        int result = OB.searchbinary(arr, 0, n - 1, x);
        if(result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
