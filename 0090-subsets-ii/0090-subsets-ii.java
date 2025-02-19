import java.util.*;

class Solution {
    public static void gen(int arr[], List<List<Integer>> ans, ArrayList<Integer> temp, int i, int n) {
        if (i == n) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(arr[i]);
        gen(arr, ans, temp, i + 1, n);
        temp.remove(temp.size() - 1);

        while (i + 1 < n && arr[i] == arr[i + 1]) {
            i++;
        }

      
        gen(arr, ans, temp, i + 1, n);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);  
        List<List<Integer>> ans = new ArrayList<>();
        gen(nums, ans, new ArrayList<>(), 0, nums.length);
        return ans;
    }
}
