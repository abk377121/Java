import java.util.Scanner;
public class selectsort {
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        selectsort ob = new selectsort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers you want to input: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Unsorted array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        ob.sort(arr);
        System.out.println();
        sc.close();
        System.out.println("Sorted array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
/*      
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * LMFAO
 * 
 * 
 * 
 * 
 * T
 */