class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int prefix=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            if(prefix==sum){
                return i;
            }
            sum-=nums[i];
        }
        return -1;
    }
}