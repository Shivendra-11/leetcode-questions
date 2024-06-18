class Solution {
    public int minPairSum(int[] nums) {

   Arrays.sort(nums);
    int i=0;
    int result=0;
    
    int j=nums.length-1;
    while(i<j){
       int sum =nums[i]+nums[j];
        result=Math.max(result , sum );
        i++;
        j--;
    }
    return result;
        
    }
}