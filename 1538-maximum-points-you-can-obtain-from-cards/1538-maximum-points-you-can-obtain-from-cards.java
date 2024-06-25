class Solution {
    public int maxScore(int[] nums, int k) {
        int lsum=0;
        int rsum=0;
        int maxsum=0;

        for(int i=0;i<=k-1;i++){
            lsum=lsum+nums[i];
        }
        maxsum=lsum;
        int ridx=nums.length-1;

        for(int j=k-1;j>=0;j--){
            lsum -=nums[j];
            rsum +=nums[ridx];
            ridx--;

            maxsum=Math.max( maxsum , lsum+rsum);

        }

return  maxsum;
        
    }
}