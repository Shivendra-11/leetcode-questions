class Solution {
    public boolean check(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                c++;
            }
        }
        if(nums[nums.length-1]>nums[0]) c++;
        if(c==1||c==0) return true;

        return false;
    }
}