class Solution {
    public int subarraySum(int[] nums) {
        int sum=0;
        // int l=0;
        int i=0;
        while(i<nums.length){
    
            for(int j=Math.max(0,i-nums[i]);j<=i;j++){
                sum+=nums[j];
            
            }
            i++;

        }
        return sum;
    }
}