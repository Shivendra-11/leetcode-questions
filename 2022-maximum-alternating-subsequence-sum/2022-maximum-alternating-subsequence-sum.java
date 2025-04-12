class Solution {
    long dp[][];
    public long find(int nums[],int i,boolean flag){
        if(i>=nums.length){
            return 0;
        }
       int parity=flag?1:0;
         if(dp[i][parity]!=-1){
            return dp[i][parity];
         }
       long unpick=find(nums,i+1,flag);
        long val=nums[i];
        if(flag==false){
            val*=-1;
        }
        long pick=find(nums,i+1,!flag)+val;

        return dp[i][parity]=Math.max(pick,unpick);

    }
    public long maxAlternatingSum(int[] nums) {
         dp=new long[nums.length][2];
        for(long row[]:dp){
            Arrays.fill(row,-1);
        }
        return find(nums,0,true);
    }
}