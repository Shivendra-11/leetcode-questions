class Solution {
    public int maxSum(int[] nums) {
        Arrays.sort(nums);
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                sum+=nums[i];
                maxi=Math.max(maxi,sum);
            }
            if(sum<0){
                sum=0;
            }
        }
        return sum+nums[nums.length-1];
    }
}