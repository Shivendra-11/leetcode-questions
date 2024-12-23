class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi=-1;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
            }else{
                maxi=Math.max(c,maxi);
                c=0;
            }
        }
      maxi=Math.max(c,maxi);

        return maxi;
    }
}