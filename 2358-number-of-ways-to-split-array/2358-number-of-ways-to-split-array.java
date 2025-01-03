class Solution {
    public int waysToSplitArray(int[] nums) {
        long total=0;
        long sum=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            sum+=nums[i];
            
            if(sum>=total-sum){
                c++;
            }
        }
        return c;
    }
}