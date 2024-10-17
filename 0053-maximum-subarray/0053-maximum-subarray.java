class Solution {
    public int maxSubArray(int[] nums) {
        int prefixsum=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
          
            prefixsum+=nums[i];
            maxi=Math.max(maxi,prefixsum);
            if(prefixsum<0){
                prefixsum=0;
            }
        }
        return maxi;
    }
}