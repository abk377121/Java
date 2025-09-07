import java.util.*;
public class dupereturn {
    public int[] finddupes(int[] arr){
        Set<Integer> set = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
        for(int num : arr){
            if(set.contains(num)){
                if(!duplicates.contains(num)){
                    duplicates.add(num);
                }
            } else {
                set.add(num);
            }
        }
        int[] result = new int[duplicates.size()];
        for(int i=0; i<duplicates.size(); i++){
            result[i] = duplicates.get(i);
        }
        return result;
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
        dupereturn obj = new dupereturn();
        int[] result = obj.finddupes(arr);
        System.out.println("Duplicate elements in the array: ");
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}
