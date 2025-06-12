class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxi=0;
        int diff=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
             maxi=Math.max(maxi,Math.abs((nums[i%n]-nums[(i+1)%n])));    
        }
        return maxi;
    }
}