class Solution {
    public int dominantIndex(int[] nums) {
int max=nums[0];
int idx=0;
for(int i=0;i<nums.length;i++){
    if(nums[i]>max){
        max=nums[i];
        idx=i;
    }
}
        Arrays.sort(nums);
        // int max=nums[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            if(max<2*nums[i]){
                return -1;
            }
        }
        return idx;
    }
}