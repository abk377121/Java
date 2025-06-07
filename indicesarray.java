import java.util.Scanner;

public class indicesarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Indices of the array elements:");
        for (int i = 0; i < n; i++) {
            System.out.println("Element " + arr[i] + " is at index: " + i);
        }
        System.out.println("Enter the element to find its index:");
        int elementToFind = sc.nextInt();
        int index = findIndex(arr, elementToFind);
        if (index != -1) {
            System.out.println("Element " + elementToFind + " is found at index: " + index);
        } else {
            System.out.println("Element " + elementToFind + " is not found in the array.");
        }
        
    }
    static int findIndex(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i; // Return the index if the element is found
            }
        }
        return -1; // Return -1 if the element is not found
    }
}
