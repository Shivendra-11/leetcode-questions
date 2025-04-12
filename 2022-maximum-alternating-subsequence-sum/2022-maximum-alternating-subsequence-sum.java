class Solution {
    long dp[][];
    public long find(int nums[],int i,int flag){
        if(i>=nums.length){
            return 0;
        }
    //    int parity=flag?1:0;
         if(dp[i][flag]!=-1){
            return dp[i][flag];
         }
       long unpick=find(nums,i+1,flag);
        long val=nums[i];
        if(flag==0){
            val*=-1;
        }
        long pick=find(nums,i+1,flag==1?0:1)+val;

        return dp[i][flag]=Math.max(pick,unpick);

    }
    public long maxAlternatingSum(int[] nums) {
         dp=new long[nums.length][2];
        for(long row[]:dp){
            Arrays.fill(row,-1);
        }
        return find(nums,0,1);
    }
}