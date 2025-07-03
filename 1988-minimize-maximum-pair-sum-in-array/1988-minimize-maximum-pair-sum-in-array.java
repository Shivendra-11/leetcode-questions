class Solution {
    public int minPairSum(int[] nums) {
        int i=0;
        int j=nums.length-1;
        Arrays.sort(nums);
        int maxi=0;
        while(i<j){
             maxi=Math.max(maxi,nums[i]+nums[j]);
             i++;
             j--;
        }
        return maxi;

    }
}