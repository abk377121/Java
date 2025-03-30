import java.util.Scanner;

public class arrayspan {
    public static int find(int[] arr, int n){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                return i; // Return the index if the element is found
            }
        }
        return -1; // Return -1 if the element is not found
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search for:");
        int n = sc.nextInt();
        
        System.out.println("Enter the number of elements of the array:");
        int m = sc.nextInt();
        int[] arr = new int[m];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = find(arr, n);
        System.out.println(ans);
        sc.close();
    }
    
    
}
