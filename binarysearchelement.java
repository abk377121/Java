import java.util.Scanner;
public class binarysearchelement {
    int binarysearch(int arr[], int x){
        int l = 0, r = arr.length - 1;
        while(l <= r){
            int m = l + (r-l) / 2;
            if(arr[m] == x) {
                return m; // Element found
            }
            if (arr[m] < x){
                l = m + 1;
            } else {
                r = m - 1;
            }
             // Element not found
        }
        return -1;
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

        binarysearchelement OB = new binarysearchelement();
        int result = OB.binarysearch(arr, x);
        if(result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
