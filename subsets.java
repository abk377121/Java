import java.util.*;
public class subsets {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        aider(0, new ArrayList<Integer>(), nums);
        return result;
    }
    public void aider(int first, ArrayList<Integer> curr, int[] nums) {
        if (first == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }
        aider(first + 1, curr, nums);
        
        curr.add(nums[first]);
        aider(first + 1, curr, nums);
        curr.remove(curr.size() - 1);
    }
    public static void main(String[] args) {
        subsets s = new subsets();
        int[] nums = {1,2,3};
        System.out.println(s.subsets(nums));
    }
}
