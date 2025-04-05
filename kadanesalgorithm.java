import java.util.Scanner;

public class kadanesalgorithm {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array:");
        int m = sc.nextInt();
        int[] arr = new int[m];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
            System.out.println("Maximum contigous sum is:" + maxSubArraySum(arr));
    }
    
    static int maxSubArraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
            
        return maxSum;
        
        
    }
    
}
// これが最後でもいい、行くぞ粍好!!　世界一のソトライカーは俺だ！