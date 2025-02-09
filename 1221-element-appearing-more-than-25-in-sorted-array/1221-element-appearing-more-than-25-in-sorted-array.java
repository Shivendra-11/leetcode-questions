class Solution {
    public int findSpecialInteger(int[] nums) {
        if(nums.length==1) return nums[0]; 
        int n=nums.length;
        int c=1;
        for(int i=0;i<nums.length-1;i++){

            if(nums[i]==nums[i+1]){
                c++;
            }else{
                c=1;
            }
            if(c>n/4) return nums[i];
        }
        return -1;
    }
}