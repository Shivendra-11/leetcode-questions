class Solution {
    public static int ways(int cost[],int n,int dp[]){
        if(n<=1){
            return 0;
        }
        if(dp[n]!=-1){
       return dp[n];
        }
        return dp[n]=Math.min((cost[n-1]+ways(cost,n-1,dp)),(cost[n-2]+ways(cost,n-2,dp)));
    }
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length+1];
        Arrays.fill(dp,-1);
        return ways(cost,cost.length,dp);
    }
}