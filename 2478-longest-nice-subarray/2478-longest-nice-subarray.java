class Solution {
    public int longestNiceSubarray(int[] nums) {
        // int mask=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int mask=0;
            for(int j=i;j<nums.length;j++){
                 if((mask & nums[j])!=0){
                    break;
                 }
                mask |=nums[j];
                maxi=Math.max(maxi,j-i+1);
            }
        }
        return maxi;
    }
}