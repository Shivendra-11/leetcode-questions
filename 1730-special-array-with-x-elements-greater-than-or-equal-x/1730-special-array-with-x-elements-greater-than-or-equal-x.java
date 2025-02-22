class Solution {
    public int specialArray(int[] nums) {
        int arr[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
           arr[Math.min(nums.length,nums[i])]++;
        }
        int pre=0;
        for(int i=nums.length;i>=0;i--){
            pre+=arr[i];
            if(i==pre) return i;
        }
        
        return -1;
    }
}