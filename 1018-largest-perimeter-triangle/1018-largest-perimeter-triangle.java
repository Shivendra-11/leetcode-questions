class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        int maxi=0;
        for(int i=nums.length-1;i>1;i--){
                if(nums[i-2]+nums[i-1]>nums[i]){
                    return nums[i-2]+nums[i-1]+nums[i];
                }
        }
        return maxi;
    }
}