class Solution {
    int max = 0;

    public void robber(int nums[], int sum, int i, int dp[]) {
        if (i >= nums.length) {
            max = Math.max(max, sum);
         
            return;
        }
        if (dp[i]>=sum) return;
        dp[i]=sum;
        
        robber(nums, sum + nums[i], i + 2,dp);
        robber(nums, sum, i + 1,dp);

    }

    public int rob(int[] nums) {
        int dp[] = new int[101];
        Arrays.fill(dp, -1);
        robber(nums, 0, 0, dp);
        return max;
    }
}