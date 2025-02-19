import java.util.*;

class Solution {
    public static void gen(int arr[], Set<List<Integer>> ans, ArrayList<Integer> temp, int i, int n) {
        if (i == n) {
            ans.add(new ArrayList<>(temp)); // HashSet ensures uniqueness
            return;
        }

        // Include current element
        temp.add(arr[i]);
        gen(arr, ans, temp, i + 1, n);
        temp.remove(temp.size() - 1);

        // Exclude current element
        gen(arr, ans, temp, i + 1, n);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);  // Sort to group duplicates together
        Set<List<Integer>> ans = new HashSet<>();
        gen(nums, ans, new ArrayList<>(), 0, nums.length);
        return new ArrayList<>(ans); // Convert set to list before returning
    }
}
