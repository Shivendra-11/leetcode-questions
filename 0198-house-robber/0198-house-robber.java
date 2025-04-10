class Solution {
    int max = 0;

    public int robber(int nums[], int i, int dp[]) {
        if (i >= nums.length) {
            return 0;
        }
      if(dp[i]!=-1){
        return dp[i];
      }
        
        int pick=nums[i]+robber(nums, i + 2,dp);
        int skip=robber(nums,  i + 1,dp);
        return dp[i]=Math.max(pick,skip);

    }

    public int rob(int[] nums) {
        int dp[] = new int[101];
        Arrays.fill(dp, -1);
        return robber(nums, 0, dp);
        // return max;
    }
}