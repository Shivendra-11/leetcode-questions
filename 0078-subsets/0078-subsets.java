class Solution {
    public static void sub(int arr[], int i, int n, ArrayList<Integer> temp, ArrayList<List<Integer>> ans) {
        if (i == n) {
            ans.add(new ArrayList<>(temp));
            return;
        }
       temp.add(arr[i]);
       sub(arr,i+1,arr.length,temp,ans);
       temp.remove(temp.size()-1);
       sub(arr,i+1,arr.length,temp,ans);
    }

    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        sub(nums, 0, nums.length, temp, ans);
        return ans;
    }
}