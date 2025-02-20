import java.util.*;

class Solution {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private List<Integer> arrayToList(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        return list;
    }

    private void backtrack(int[] nums, List<List<Integer>> result, int idx) {
        if (idx == nums.length) {
            result.add(new ArrayList<>(arrayToList(nums))); 
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            swap(nums, i, idx);
            backtrack(nums, result, idx + 1);
            swap(nums, i, idx); // Backtrack
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, result, 0);
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3};
        System.out.println(sol.permute(nums));
    }
}
