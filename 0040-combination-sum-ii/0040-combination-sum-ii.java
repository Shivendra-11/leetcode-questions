import java.util.*;

class Solution {
    public static void gen(int arr[], List<List<Integer>> ans, List<Integer> temp, int target, int i) {
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if (i == arr.length || target < 0) {
            return;
        }

        for (int j = i; j < arr.length; j++) {
            if (target >= arr[j]) {
                if (j>i && arr[j] == arr[j-1]) continue;
                    temp.add(arr[j]);
                    gen(arr, ans, temp, target - arr[j], j + 1);
                    temp.remove(temp.size() - 1);
             } 
        }

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ansSet = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        gen(candidates, ansSet, temp, target, 0);

        return ansSet;
    }
}
