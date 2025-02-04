class Solution {
    public boolean isMonotonic(int[] nums) {
        int k=0;
        boolean inc=false;
        boolean dec=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]) inc=true;

            if(nums[i]>nums[i+1]) dec=true;
        }
        if(inc && dec) return false;

        return true;
    }
}