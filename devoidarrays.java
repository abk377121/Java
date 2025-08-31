import java.util.*;
public class devoidarrays {
    public int[] devoidoubles(int[] arr){
        int[] result = new int[arr.length];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            boolean isDuplicate = false;
            for(int j=0; j<index; j++){
                if(arr[i] == result[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                result[index] = arr[i];
                index++;
            }
        }
        int[] finalResult = new int[index];
        for(int i=0; i<index; i++){
            finalResult[i] = result[i];
        }
        return finalResult;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        devoidarrays obj = new devoidarrays();
        int[] result = obj.devoidoubles(arr);
        System.out.println("Array after removing duplicates: ");
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}
