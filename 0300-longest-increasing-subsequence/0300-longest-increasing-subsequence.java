class Solution {
    public static int find(int nums[], int i, int prev,int dp[][]) {
        if (i >= nums.length) {
            return 0;
        }

        if (prev!=-1&&dp[i][prev]!= -1) {
            return dp[i][prev];
        }

        int take = 0;

        if (prev == -1 || nums[prev] < nums[i]) {
            take = 1 + find(nums, i + 1, i,dp);
        }
        int skip = find(nums, i + 1, prev,dp);

        if(prev!=-1){
            dp[i][prev]=Math.max(take, skip);
        }
        return Math.max(take, skip);
    }

    public int lengthOfLIS(int[] nums) {
        int dp[][] = new int[2501][2501];
        for(int i=0;i<2501;i++){
            for(int j=0;j<2501;j++){
                dp[i][j]=-1;
            }

        }

        return find(nums, 0, -1, dp);
    }
}