import java.util.*;

class Solution {
    public static void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private void backtrack(int[] nums , List<List<Integer>> result,int idx) {
     if (idx == nums.length) {
            result.add(new ArrayList<>(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new))));
            return;
        }
        
        for (int i = idx; i < nums.length; i++) {
            swap(nums,i,idx);
            backtrack(nums,result,idx+1);
             swap(nums,i,idx);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // boolean[] visited = new boolean[nums.length];
        backtrack(nums,result,0);
        return result;
    }
}
