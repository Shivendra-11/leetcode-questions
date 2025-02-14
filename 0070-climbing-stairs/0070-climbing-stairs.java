class Solution {
    public static int fib(int i , int dp[],int n){
     if (i==n) {
            return 1;
        }
        if(i>n) {
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int fibn=fib(i+1,dp,n)+ fib(i+2,dp,n);;
         dp[i]=fibn;
         return dp[i];

    }
    public int climbStairs(int n) {
       int dp[]=new int[n+1];
       Arrays.fill(dp,-1);
       return fib(0,dp,n);
    }
}