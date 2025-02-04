class Solution {
    public int maxAscendingSum(int[] nums) {
       int sum=nums[0];
       int maxsum=0;
       for(int i=1;i<nums.length;i++){
        if(nums[i]>nums[i-1]){
            sum+=nums[i];
        }else{
            maxsum=Math.max(sum,maxsum);
            sum=nums[i];
        }
       }
       return Math.max(maxsum,sum);

    }
}