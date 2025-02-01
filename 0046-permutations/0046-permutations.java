import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(nums, new ArrayList<>(), visited, result);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> tempList, boolean[] visited, List<List<Integer>> result) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                tempList.add(nums[i]);

                backtrack(nums, tempList, visited, result);

                tempList.remove(tempList.size() - 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3};
        System.out.println(sol.permute(nums));
    }
}
